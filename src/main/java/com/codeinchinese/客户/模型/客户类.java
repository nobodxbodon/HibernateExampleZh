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

  public Long getCustomerId() {
      return this.客户_ID;
  }

  public void setCustomerId(Long customerId) {
      this.客户_ID = customerId;
  }

  public String getName() {
      return this.姓名;
  }

  public void setName(String name) {
      this.姓名 = name;
  }

  public Date getCreatedDate() {
      return this.创建日期;
  }

  public void setCreatedDate(Date createdDate) {
      this.创建日期 = createdDate;
  }

}
