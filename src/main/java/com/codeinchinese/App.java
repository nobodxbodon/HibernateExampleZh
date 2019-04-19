package com.codeinchinese;

import java.util.Date;

import org.hibernate.Session;

import com.codeinchinese.客户.功用.HibernateUtil;
import com.codeinchinese.客户.模型.客户类;

public class App {
  public static void main(String[] args) {
    System.out.println("Maven + Hibernate + MySQL");
    Session session = HibernateUtil.getSessionFactory().openSession();

    session.beginTransaction();
    客户类 user = new 客户类();

    user.set姓名("小红");
    user.set创建日期(new Date());

    session.save(user);
    session.getTransaction().commit();
  }
}
