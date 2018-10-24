/*
Navicat MySQL Data Transfer

Source Server         : mysql80
Source Server Version : 80011
Source Host           : localhost:3306
Source Database       : spring

Target Server Type    : MYSQL
Target Server Version : 80011
File Encoding         : 65001

Date: 2018-10-24 10:24:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for learn_resource
-- ----------------------------
DROP TABLE IF EXISTS `learn_resource`;
CREATE TABLE `learn_resource` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `author` varchar(20) DEFAULT NULL COMMENT '作者',
  `title` varchar(100) DEFAULT NULL COMMENT '描述',
  `url` varchar(100) DEFAULT NULL COMMENT '地址链接',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1029 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of learn_resource
-- ----------------------------
INSERT INTO `learn_resource` VALUES ('999', '官方SpriongBoot例子', '官方SpriongBoot例子', 'https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples');
INSERT INTO `learn_resource` VALUES ('1000', '龙果学院', 'Spring Boot 教程系列学习', 'http://www.roncoo.com/article/detail/124661');
INSERT INTO `learn_resource` VALUES ('1001', '嘟嘟MD独立博客', 'Spring Boot干货系列', 'http://tengj.top/');
INSERT INTO `learn_resource` VALUES ('1002', '后端编程嘟', 'Spring Boot视频教程', 'http://www.toutiao.com/m1559096720023553/');
