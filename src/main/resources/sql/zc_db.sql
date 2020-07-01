/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50729
 Source Host           : localhost:3306
 Source Schema         : zc_db

 Target Server Type    : MySQL
 Target Server Version : 50729
 File Encoding         : 65001

 Date: 29/04/2020 10:54:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for comployee
-- ----------------------------
DROP TABLE IF EXISTS `comployee`;
CREATE TABLE `comployee`  (
  `comployee_no` varchar(30) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `comployee_name` varchar(25) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `sex` varchar(5) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `age` int(10) UNSIGNED NOT NULL,
  `dept` varchar(45) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `profession` varchar(20) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `address` varchar(60) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `phone` varchar(20) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `comployee_status` varchar(10) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  PRIMARY KEY (`comployee_no`) USING BTREE,
  INDEX `fk_comployee_dept`(`dept`) USING BTREE,
  CONSTRAINT `fk_comployee_dept` FOREIGN KEY (`dept`) REFERENCES `department` (`dept`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = gb2312 COLLATE = gb2312_chinese_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of comployee
-- ----------------------------
INSERT INTO `comployee` VALUES ('0001', '于谦', '男', 28, '保安部', '职员', '上海', '13236489654', '在职');
INSERT INTO `comployee` VALUES ('0002', '李明', '男', 32, '保安部', '处长', '上海', '13164987452', '在职');
INSERT INTO `comployee` VALUES ('0003', '张刚', '男', 22, '设备管理部', '职员', '上海', '13112546985', '休假');
INSERT INTO `comployee` VALUES ('0004', '王利', '男', 26, '外贸部', '职员', '上海', '13569845215', '在职');
INSERT INTO `comployee` VALUES ('0005', '王霞', '女', 33, '总务处', '职员', '上海', '135649852487', '休假');
INSERT INTO `comployee` VALUES ('1000', 'www', '男', 24, '设备管理部', '处长', '上海', '13265412365', '在职');
INSERT INTO `comployee` VALUES ('2000', 'xxx', '男', 24, '总务处', '处长', '上海', '13569845215', '休假');
INSERT INTO `comployee` VALUES ('3000', 'yyy', '女', 24, '设备管理部', '职员', '上海', '13965445665', '在职');

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `dept` varchar(45) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  PRIMARY KEY (`dept`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = gb2312 COLLATE = gb2312_chinese_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('保安部');
INSERT INTO `department` VALUES ('科技组');
INSERT INTO `department` VALUES ('人力资源部');
INSERT INTO `department` VALUES ('设备管理部');
INSERT INTO `department` VALUES ('外贸部');
INSERT INTO `department` VALUES ('总务处');

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info`  (
  `userName` varchar(30) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `pwd` varchar(100) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `comployee_no` varchar(30) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `competence` varchar(15) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  PRIMARY KEY (`userName`) USING BTREE,
  INDEX `fk_userinfo_comployee`(`comployee_no`) USING BTREE,
  CONSTRAINT `fk_userinfo_comployee` FOREIGN KEY (`comployee_no`) REFERENCES `comployee` (`comployee_no`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = gb2312 COLLATE = gb2312_chinese_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('niuys', 'niuys', '1000', '管理员');
INSERT INTO `user_info` VALUES ('xxx', 'x', '2000', '管理员');
INSERT INTO `user_info` VALUES ('yyy', 'yyy', '3000', '操作员');
INSERT INTO `user_info` VALUES ('于谦', 'yuqian', '0001', '管理员');

-- ----------------------------
-- Table structure for zc_info
-- ----------------------------
DROP TABLE IF EXISTS `zc_info`;
CREATE TABLE `zc_info`  (
  `zc_id` varchar(30) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `zc_no` varchar(30) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `zc_name` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `zc_price` float NOT NULL,
  `zc_factory` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `zc_produceTime` varchar(20) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL DEFAULT '2008-01-01',
  `zc_buyTime` varchar(20) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL DEFAULT '2008-01-01',
  `zc_buyer` varchar(15) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `zc_type` varchar(20) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `zc_status` varchar(15) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `zc_bzxx` varchar(255) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NULL DEFAULT NULL,
  PRIMARY KEY (`zc_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = gb2312 COLLATE = gb2312_chinese_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of zc_info
-- ----------------------------
INSERT INTO `zc_info` VALUES ('C2KS@_1', 'C2KS', '山特UPS电源', 5320, '山特', '2007-12-09', '2008-08-13', 'Sonic', '拓展配件', '维修', '');
INSERT INTO `zc_info` VALUES ('C2KS@_4', 'C2KS', '山特UPS电源', 5320, '山特', '2007-12-09', '2008-08-13', 'Sonic', '笔记本', '正常', '');
INSERT INTO `zc_info` VALUES ('kk300@_1', 'kk300', '卡巴斯基7.0', 100, 'HR_gd', '1990-04-07', '2008-08-15', 'Rose', '电脑软件', '正常', NULL);
INSERT INTO `zc_info` VALUES ('kk300@_2', 'kk300', '卡巴斯基7.0', 100, 'HR_gd', '1990-04-07', '2008-08-15', 'Rose', '服务器', '维修', NULL);
INSERT INTO `zc_info` VALUES ('KLV-40V380A@_5', 'KLV-40V380A', '索尼液晶电视', 8490, '索尼', '2008-07-25', '2008-08-15', 'John', '数码配件', '正常', NULL);
INSERT INTO `zc_info` VALUES ('t300@_3', 't300', '卡巴斯基6.0', 100, 'HR', '1990-04-08', '2008-08-15', 'Sonic', '服务器', '正常', NULL);
INSERT INTO `zc_info` VALUES ('T300@_4', 'T300', '索尼数码照相机', 2500, '索尼', '2008-08-05', '2008-08-13', 'David', '数码产品', '正常', NULL);
INSERT INTO `zc_info` VALUES ('T300@_5', 'T300', '索尼数码照相机', 2500, '索尼', '2008-08-05', '2008-08-13', 'David', '数码产品', '借出', NULL);
INSERT INTO `zc_info` VALUES ('V3906TX@_6', 'V3906TX', '惠普 Compaq Presario', 5700, '惠普', '2008-07-04', '2008-08-15', 'Sonic', '笔记本', '报废', NULL);
INSERT INTO `zc_info` VALUES ('V3906TX@_7', 'V3906TX', '惠普 Compaq Presario', 5700, '惠普', '2008-07-04', '2008-08-15', 'Sonic', '笔记本', '维修', NULL);
INSERT INTO `zc_info` VALUES ('V3906TX@_8', 'V3906TX', '惠普 Compaq Presario', 5700, '惠普', '2008-07-04', '2008-08-15', 'Sonic', '笔记本', '正常', NULL);

-- ----------------------------
-- Table structure for zc_inout
-- ----------------------------
DROP TABLE IF EXISTS `zc_inout`;
CREATE TABLE `zc_inout`  (
  `inout_no` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `zc_id` varchar(30) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `comployee_no` varchar(30) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `out_time` varchar(20) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `should_time` varchar(20) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `back_time` varchar(20) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NULL DEFAULT NULL,
  PRIMARY KEY (`inout_no`) USING BTREE,
  INDEX `fk_zcinfo_zcinout`(`zc_id`) USING BTREE,
  CONSTRAINT `FK_zc_inout_1` FOREIGN KEY (`zc_id`) REFERENCES `zc_info` (`zc_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = gb2312 COLLATE = gb2312_chinese_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of zc_inout
-- ----------------------------
INSERT INTO `zc_inout` VALUES (3, 'C2KS@_1', '0002', '2008-08-14', '2008-09-14', '2008-08-14');
INSERT INTO `zc_inout` VALUES (4, 'C2KS@_4', '0001', '2008-08-14', '2008-09-14', '2010-04-08');
INSERT INTO `zc_inout` VALUES (6, 'kk300@_1', '0002', '2008-08-14', '2008-09-14', '2008-08-14');
INSERT INTO `zc_inout` VALUES (7, 'kk300@_2', '0002', '2008-08-14', '2008-09-14', '2008-08-14');
INSERT INTO `zc_inout` VALUES (8, 'KLV-40V380A@_5', '0001', '2008-08-14', '2008-09-14', '2008-08-14');
INSERT INTO `zc_inout` VALUES (9, 'KLV-40V380A@_5', '0001', '2008-08-14', '2008-09-14', '2008-08-14');
INSERT INTO `zc_inout` VALUES (11, 't300@_3', '0002', '2008-08-14', '2008-09-14', '2008-08-15');
INSERT INTO `zc_inout` VALUES (12, 'C2KS@_1', '0005', '2008-08-14', '2008-09-14', '2010-04-08');
INSERT INTO `zc_inout` VALUES (13, 'T300@_4', '0002', '2008-08-15', '2008-09-15', '2010-04-08');
INSERT INTO `zc_inout` VALUES (14, 'T300@_5', '0003', '2008-08-15', '2008-11-15', '');
INSERT INTO `zc_inout` VALUES (15, 'V3906TX@_6', '0002', '2008-08-15', '2008-09-15', '');
INSERT INTO `zc_inout` VALUES (16, 'V3906TX@_7', '0001', '2008-08-15', '2008-1015', '');
INSERT INTO `zc_inout` VALUES (17, 'C2KS@_1 ', '1000', '2010-04-11', '2010-6-11', NULL);

-- ----------------------------
-- Table structure for zc_wx
-- ----------------------------
DROP TABLE IF EXISTS `zc_wx`;
CREATE TABLE `zc_wx`  (
  `repair_no` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `zc_id` varchar(30) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `send_time` varchar(30) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `sender` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `login_user` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `reason` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NULL DEFAULT NULL,
  `wx_time` varchar(30) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NULL DEFAULT NULL,
  `wx_result` varchar(45) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NULL DEFAULT NULL,
  `cost` float NULL DEFAULT NULL,
  `wx_comment` varchar(45) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NULL DEFAULT NULL,
  PRIMARY KEY (`repair_no`) USING BTREE,
  INDEX `fk_zcinfo_zcwx`(`zc_id`) USING BTREE,
  CONSTRAINT `fk_zcinfo_zcwx` FOREIGN KEY (`zc_id`) REFERENCES `zc_info` (`zc_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 32 CHARACTER SET = gb2312 COLLATE = gb2312_chinese_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of zc_wx
-- ----------------------------
INSERT INTO `zc_wx` VALUES (27, 'C2KS@_4', '2010-04-05', 'ss', 'xxx', 'sss', '2010-04-11', 'NULL', 0, 'NULL');
INSERT INTO `zc_wx` VALUES (31, 'C2KS@_1', '2010-04-04', 'ddd', 'yyy', 'dd', NULL, NULL, 0, NULL);

SET FOREIGN_KEY_CHECKS = 1;
