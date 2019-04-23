package com.codeinchinese;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.codeinchinese.customer.model.Customer;
import com.codeinchinese.客户.功用.HibernateUtil;

public class App {
  public static void main(String[] args) {
    System.out.println("Maven + Hibernate + MySQL");
    Session 会话 = HibernateUtil.getSessionFactory().openSession();

    会话.beginTransaction();
    Customer 客户 = new Customer();

    客户.set姓名("小红");
    客户.set创建日期(new Date());

    会话.save(客户);
    会话.getTransaction().commit();

    Query 查询 = 会话.createQuery("from Customer where 姓名 = '小红' ");
    List list = 查询.list();
    for (Object o : list) {
      System.out.println(o);
    }
  }
}
