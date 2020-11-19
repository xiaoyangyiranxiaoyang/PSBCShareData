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
-- Table structure for kpi_income_show
-- ----------------------------
DROP TABLE IF EXISTS `kpi_income_show`;
CREATE TABLE `kpi_income_show`  (
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
) ENGINE = InnoDB AUTO_INCREMENT = 34 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '全行KPI指标表（一）展示数据表(收入KPI)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of kpi_income_show
-- ----------------------------
INSERT INTO `kpi_income_show` VALUES (4, '全  省', 1002, 7398.276153, 66477.080754, 5494.850000, 47508.720000, -15.000000, 71.979738, 47.413892, 1772.206640, 156539.356791, 778.546268, 625.506900, 156.226903, 329.496052, '2020-11-01', '0', 'admin', '2020-11-19 16:35:21', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (5, '城  西', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-11-01', '0', 'admin', '2020-11-19 16:35:21', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (6, '城  中', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-11-01', '0', 'admin', '2020-11-19 16:35:21', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (7, '大  通', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-11-01', '0', 'admin', '2020-11-19 16:35:21', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (8, '海  东', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-11-01', '0', 'admin', '2020-11-19 16:35:21', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (9, '海  西 ', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-11-01', '0', 'admin', '2020-11-19 16:35:21', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (10, '格尔木', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-11-01', '0', 'admin', '2020-11-19 16:35:21', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (11, '海  南 ', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-11-01', '0', 'admin', '2020-11-19 16:35:21', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (12, '海  北 ', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-11-01', '0', 'admin', '2020-11-19 16:35:21', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (13, '黄  南  ', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-11-01', '0', 'admin', '2020-11-19 16:35:21', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (14, '果  洛 ', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-11-01', '0', 'admin', '2020-11-19 16:35:21', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (15, '玉  树  ', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-11-01', '0', 'admin', '2020-11-19 16:35:21', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (16, '营业部', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-11-01', '0', 'admin', '2020-11-19 16:35:21', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (17, '本  部', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-11-01', '0', 'admin', '2020-11-19 16:35:21', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (18, '业务处理中心', 54, NULL, NULL, NULL, NULL, NULL, NULL, NULL, -106.000000, -961.000000, 1.858127, 87.397420, -18.000000, NULL, '2020-11-01', '0', 'admin', '2020-11-19 16:35:21', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (19, '全  省', 1002, 7398.276153, 66477.080754, 5494.850000, 47508.720000, -15.000000, 71.979738, 47.413892, 1772.206640, 156539.356791, 778.546268, 625.506900, 156.226903, 329.496052, '2020-10-01', '0', 'admin', '2020-11-19 17:28:23', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (20, '城  西', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-10-01', '0', 'admin', '2020-11-19 17:28:23', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (21, '城  中', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-10-01', '0', 'admin', '2020-11-19 17:28:23', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (22, '大  通', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-10-01', '0', 'admin', '2020-11-19 17:28:23', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (23, '海  东', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-10-01', '0', 'admin', '2020-11-19 17:28:23', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (24, '海  西 ', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-10-01', '0', 'admin', '2020-11-19 17:28:23', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (25, '格尔木', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-10-01', '0', 'admin', '2020-11-19 17:28:23', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (26, '海  南 ', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-10-01', '0', 'admin', '2020-11-19 17:28:23', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (27, '海  北 ', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-10-01', '0', 'admin', '2020-11-19 17:28:23', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (28, '黄  南  ', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-10-01', '0', 'admin', '2020-11-19 17:28:23', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (29, '果  洛 ', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-10-01', '0', 'admin', '2020-11-19 17:28:23', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (30, '玉  树  ', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-10-01', '0', 'admin', '2020-11-19 17:28:23', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (31, '营业部', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-10-01', '0', 'admin', '2020-11-19 17:28:23', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (32, '本  部', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-10-01', '0', 'admin', '2020-11-19 17:28:23', NULL, NULL, NULL);
INSERT INTO `kpi_income_show` VALUES (33, '业务处理中心', 54, NULL, NULL, NULL, NULL, NULL, NULL, NULL, -106.000000, -961.000000, 1.858127, 87.397420, -18.000000, NULL, '2020-10-01', '0', 'admin', '2020-11-19 17:28:23', NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
