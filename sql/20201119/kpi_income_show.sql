/*
 Navicat Premium Data Transfer

 Source Server         : localhost 3136
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3136
 Source Schema         : ruoyi

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 19/11/2020 17:50:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for kpi_show_income
-- ----------------------------
DROP TABLE IF EXISTS `kpi_show_income`;
CREATE TABLE `kpi_show_income`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `district` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '地区',
  `people_num` int(11) NULL DEFAULT NULL COMMENT '从业人数',
  `income_total_month` decimal(12, 6) NULL DEFAULT NULL COMMENT '总收入-本月',
  `income_total_year` decimal(12, 6) NULL DEFAULT NULL COMMENT '总收入-本年',
  `income_self_month` decimal(12, 6) NULL DEFAULT NULL COMMENT '自营收入-本月',
  `income_self_year` decimal(12, 6) NULL DEFAULT NULL COMMENT '自营收入-本年',
  `income_self_rise` decimal(12, 6) NULL DEFAULT NULL COMMENT '自营收入-增幅',
  `income_self_progress` decimal(12, 6) NULL DEFAULT NULL COMMENT '自营收入-完成年度预算进度',
  `income_self_percapita` decimal(12, 6) NULL DEFAULT NULL COMMENT '自营收入-人均收入',
  `net_profit_month` decimal(12, 6) NULL DEFAULT NULL COMMENT '净利润-本月',
  `net_profit_year` decimal(12, 6) NULL DEFAULT NULL COMMENT '净利润-本年',
  `net_profit_rise` decimal(12, 6) NULL DEFAULT NULL COMMENT '净利润-增幅',
  `net_profit_progress` decimal(12, 6) NULL DEFAULT NULL COMMENT '净利润-完成年度预算进度',
  `net_profit_percapita` decimal(12, 6) NULL DEFAULT NULL COMMENT '净利润-人均收入',
  `income_profit_rate` decimal(12, 6) NULL DEFAULT NULL COMMENT '收入利润率',
  `data_date` date NOT NULL COMMENT '数据日期',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '全行KPI指标表（一）展示数据表(收入KPI)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of kpi_show_income
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
