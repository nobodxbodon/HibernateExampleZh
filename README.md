详见: [中文命名之Hibernate+MySQL演示](https://zhuanlan.zhihu.com/p/63518209)

### 测试环境:
- Windows 7 Pro 64bit, JDK 1.7.0_80, MySQL 5.5.62, Eclipse Kepler SR2
- MacOS 10.13.6, JDK 1.8.0_45, MySQL 5.5.24, Eclipse 4.7.3a

Hibernate 3.3.2.GA

### 功能验证:
运行`com.codeinchinese.App`, 插入一条记录并进行一次查询.
简单反射Junit测试在[这里](src/test/java/com/codeinchinese/AppTest.java)

### 数据库
[源码](数据库/客户.sql); 需修改`hibernate.cfg.xml`中的数据库用户/密码部分.
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
[模型类](src/main/java/com/codeinchinese/客户/模型/客户类.java)
```java
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
```

### 参考

[Maven 3 + Hibernate 3.6 + Oracle 11g Example](https://www.mkyong.com/hibernate/maven-3-hibernate-3-6-oracle-11g-example-xml-mapping/)