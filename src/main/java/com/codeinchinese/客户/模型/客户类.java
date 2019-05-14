package com.codeinchinese.客户.模型;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="客户")
public class 客户类 implements java.io.Serializable {

  private Long 客户_ID;
  private String 姓名;
  private Date 创建日期;

  public 客户类() {
  }

  public 客户类(String 姓名, Date 创建日期) {
      this.姓名 = 姓名;
      this.创建日期 = 创建日期;
  }

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name = "客户_ID", length=20)
  public Long get客户Id() {
      return this.客户_ID;
  }

  public void set客户Id(Long 客户Id) {
      this.客户_ID = 客户Id;
  }

  @Column(name = "姓名", nullable = false, length=45)
  public String get姓名() {
      return this.姓名;
  }

  public void set姓名(String 姓名) {
      this.姓名 = 姓名;
  }

  @Column(name = "创建日期", nullable = false, length=19)
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
