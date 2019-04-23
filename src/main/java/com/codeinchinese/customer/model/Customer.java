package com.codeinchinese.customer.model;

import java.util.Date;

public class Customer implements java.io.Serializable {

  private Long 客户_ID;
  private String 姓名;
  private Date 创建日期;

  public Customer() {
  }

  public Customer(String 姓名, Date 创建日期) {
      this.姓名 = 姓名;
      this.创建日期 = 创建日期;
  }

  public Long get客户Id() {
      return this.客户_ID;
  }

  public void set客户Id(Long 客户Id) {
      this.客户_ID = 客户Id;
  }

  public String get姓名() {
      return this.姓名;
  }

  public void set姓名(String 姓名) {
      this.姓名 = 姓名;
  }

  public Date get创建日期() {
      return this.创建日期;
  }

  public void set创建日期(Date 创建日期) {
      this.创建日期 = 创建日期;
  }

  @Override
  public String toString() {
    return 客户_ID + " " + 姓名 + " " + 创建日期;
  }

}
