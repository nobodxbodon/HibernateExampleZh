package com.codeinchinese.客户.模型;

import java.util.Date;

public class 客户类 implements java.io.Serializable {

  private Long 客户_ID;
  private String 姓名;
  private Date 创建日期;

  public 客户类() {
  }

  public 客户类(String name, Date createdDate) {
      this.姓名 = name;
      this.创建日期 = createdDate;
  }

  public Long get客户Id() {
      return this.客户_ID;
  }

  public void set客户Id(Long customerId) {
      this.客户_ID = customerId;
  }

  public String get姓名() {
      return this.姓名;
  }

  public void set姓名(String name) {
      this.姓名 = name;
  }

  public Date get创建日期() {
      return this.创建日期;
  }

  public void set创建日期(Date createdDate) {
      this.创建日期 = createdDate;
  }

}
