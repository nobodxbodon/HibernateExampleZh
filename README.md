
### 数据库
```mysql
DROP TABLE IF EXISTS `演示`.`客户`;
CREATE TABLE  `演示`.`客户` (
  `客户_ID` bigint(20) unsigned COLLATE utf8_unicode_ci NOT NULL AUTO_INCREMENT,
  `姓名` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `创建日期` datetime COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`客户_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COLLATE utf8_unicode_ci;

ALTER TABLE `演示`.`客户`
ADD INDEX `姓名_索引` (`姓名` ASC) ;
```

### Java
```java
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
```

### 参考

[Maven 3 + Hibernate 3.6 + Oracle 11g Example](https://www.mkyong.com/hibernate/maven-3-hibernate-3-6-oracle-11g-example-xml-mapping/)