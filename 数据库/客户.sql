DROP TABLE IF EXISTS `演示`.`客户`;
CREATE TABLE  `演示`.`客户` (
  `客户_ID` bigint(20) unsigned COLLATE utf8_unicode_ci NOT NULL AUTO_INCREMENT,
  `姓名` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `创建日期` datetime COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`客户_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_unicode_ci;

ALTER TABLE `演示`.`客户`
ADD INDEX `姓名_索引` (`姓名` ASC) ;