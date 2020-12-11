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

 Date: 11/12/2020 17:53:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cbrc_assets_liabilities_main_indicators
-- ----------------------------
DROP TABLE IF EXISTS `cbrc_assets_liabilities_main_indicators`;
CREATE TABLE `cbrc_assets_liabilities_main_indicators`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `institution` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '机构',
  `assets_total` decimal(16, 6) NULL DEFAULT NULL COMMENT '资产总额',
  `assets_compate_begin_year` decimal(16, 6) NULL DEFAULT NULL COMMENT '比年初',
  `liabilities_total` decimal(16, 6) NULL DEFAULT NULL COMMENT '负债总额',
  `liabilities_compate_begin_year` decimal(16, 6) NULL DEFAULT NULL COMMENT '比年初',
  `owner_equity` decimal(16, 6) NULL DEFAULT NULL COMMENT '所有者权益',
  `equity_compate_begin_year` decimal(16, 6) NULL DEFAULT NULL COMMENT '比年初',
  `profit_this_year` decimal(16, 6) NULL DEFAULT NULL COMMENT '本年利润',
  `profit_compate_last_year` decimal(16, 6) NULL DEFAULT NULL COMMENT '比去年同期',
  `data_date` date NOT NULL COMMENT '数据日期',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 325 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '青海省银行业金融机构资产负债主要指标' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cbrc_assets_liabilities_major_projects
-- ----------------------------
DROP TABLE IF EXISTS `cbrc_assets_liabilities_major_projects`;
CREATE TABLE `cbrc_assets_liabilities_major_projects`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '资产(assets)或负债(liabilities)',
  `item` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '项目',
  `current_issue` decimal(16, 6) NULL DEFAULT NULL COMMENT '本期',
  `compare_begin_year` decimal(16, 6) NULL DEFAULT NULL COMMENT '比年初',
  `compare_last_month` decimal(16, 6) NULL DEFAULT NULL COMMENT '比上月',
  `compate_last_year_pct` decimal(16, 6) NULL DEFAULT NULL COMMENT '比去年同期增减%',
  `data_date` date NOT NULL COMMENT '数据日期',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 833 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '青海银行业机构资产负债主要项目统计月表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cbrc_deposit_loan_details
-- ----------------------------
DROP TABLE IF EXISTS `cbrc_deposit_loan_details`;
CREATE TABLE `cbrc_deposit_loan_details`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `item` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '项目',
  `balance` decimal(16, 6) NULL DEFAULT NULL COMMENT '本期',
  `growth_lst_m` decimal(16, 6) NULL DEFAULT NULL COMMENT '比上月',
  `growth_begin_y` decimal(16, 6) NULL DEFAULT NULL COMMENT '比年初',
  `data_date` date NOT NULL COMMENT '数据日期',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '青海省银行业金融机构存贷款明细月报表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cbrc_deposit_loan_institution
-- ----------------------------
DROP TABLE IF EXISTS `cbrc_deposit_loan_institution`;
CREATE TABLE `cbrc_deposit_loan_institution`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `institution` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '机构',
  `deposit_balance` decimal(16, 6) NULL DEFAULT NULL COMMENT '存款-月末余额',
  `deposit_growth_m` decimal(16, 6) NULL DEFAULT NULL COMMENT '存款-比上月增减',
  `deposit_growth_y` decimal(16, 6) NULL DEFAULT NULL COMMENT '存款-比年初增减',
  `loan_balance` decimal(16, 6) NULL DEFAULT NULL COMMENT '贷款-月末余额',
  `loan_growth_m` decimal(16, 6) NULL DEFAULT NULL COMMENT '贷款-比上月增减',
  `loan_growth_y` decimal(16, 6) NULL DEFAULT NULL COMMENT '贷款-比年初增减',
  `data_date` date NOT NULL COMMENT '数据日期',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 190 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '青海省银行业金融机构存贷款分机构情况表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cbrc_deposit_loan_monthly_daily_avg
-- ----------------------------
DROP TABLE IF EXISTS `cbrc_deposit_loan_monthly_daily_avg`;
CREATE TABLE `cbrc_deposit_loan_monthly_daily_avg`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `institution` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '机构名称',
  `loan_balance` decimal(16, 6) NULL DEFAULT NULL COMMENT '贷款-本期',
  `loan_growth_m` decimal(16, 6) NULL DEFAULT NULL COMMENT '贷款-比上期',
  `loan_growth_y` decimal(16, 6) NULL DEFAULT NULL COMMENT '贷款-比年初',
  `loan_avg_balance` decimal(16, 6) NULL DEFAULT NULL COMMENT '月日均贷款余额-本期',
  `loan_avg_growth_m` decimal(16, 6) NULL DEFAULT NULL COMMENT '月日均贷款余额-比上期',
  `loan_avg_growth_y` decimal(16, 6) NULL DEFAULT NULL COMMENT '月日均贷款余额-比年初',
  `deposit_balance` decimal(16, 6) NULL DEFAULT NULL COMMENT '存款-本期',
  `deposit_growth_m` decimal(16, 6) NULL DEFAULT NULL COMMENT '存款-比上月',
  `deposit_growth_y` decimal(16, 6) NULL DEFAULT NULL COMMENT '存款-比年初',
  `deposit_avg_balance` decimal(16, 6) NULL DEFAULT NULL COMMENT '月日均存款余额-本期',
  `deposit_avg_growth_m` decimal(16, 6) NULL DEFAULT NULL COMMENT '月日均存款余额-比上月',
  `deposit_avg_growth_y` decimal(16, 6) NULL DEFAULT NULL COMMENT '月日均存款余额-比年初',
  `data_date` date NOT NULL COMMENT '数据日期',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 67 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '青海省分机构存贷款月日均情况表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cbrc_loan_five_levels_detail
-- ----------------------------
DROP TABLE IF EXISTS `cbrc_loan_five_levels_detail`;
CREATE TABLE `cbrc_loan_five_levels_detail`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `institution` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '机构',
  `normal_balance` decimal(16, 6) NULL DEFAULT NULL COMMENT '正常类-本期',
  `normal_growth_y` decimal(16, 6) NULL DEFAULT NULL COMMENT '正常类-比年初',
  `interest_balance` decimal(16, 6) NULL DEFAULT NULL COMMENT '关注类-本期',
  `interest_growth_y` decimal(16, 6) NULL DEFAULT NULL COMMENT '关注类-比年初',
  `secondary_balance` decimal(16, 6) NULL DEFAULT NULL COMMENT '次级类-本期',
  `secondary_growth_y` decimal(16, 6) NULL DEFAULT NULL COMMENT '次级类-比年初',
  `doubt_balance` decimal(16, 6) NULL DEFAULT NULL COMMENT '可疑类-本期',
  `doubt_growth_y` decimal(16, 6) NULL DEFAULT NULL COMMENT '可疑类-比年初',
  `loss_balance` decimal(16, 6) NULL DEFAULT NULL COMMENT '损失类-本期',
  `loss_growth_y` decimal(16, 6) NULL DEFAULT NULL COMMENT '损失类-比年初',
  `data_date` date NOT NULL COMMENT '数据日期',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 28 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '青海省银行业金融机构贷款五级分类明细表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cbrc_loan_five_levels_unhealthy
-- ----------------------------
DROP TABLE IF EXISTS `cbrc_loan_five_levels_unhealthy`;
CREATE TABLE `cbrc_loan_five_levels_unhealthy`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `institution` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '机构',
  `loan_balance` decimal(16, 6) NULL DEFAULT NULL COMMENT '贷款合计-本期',
  `loan_growth_y` decimal(16, 6) NULL DEFAULT NULL COMMENT '贷款合计-比年初',
  `loan_unhealthy_balance` decimal(16, 6) NULL DEFAULT NULL COMMENT '不良贷款合计-本期',
  `loan_unhealthy_growth_y` decimal(16, 6) NULL DEFAULT NULL COMMENT '不良贷款合计-比年初',
  `loan_unhealthy_pct` decimal(16, 6) NULL DEFAULT NULL COMMENT '不良贷款率-本期',
  `loan_unhealthy_pct_growth_y` decimal(16, 6) NULL DEFAULT NULL COMMENT '不良贷款率-比年初',
  `data_date` date NOT NULL COMMENT '数据日期',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 28 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '青海省银行业金融机构贷款五级分类不良情况表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cbrc_loan_to_industry
-- ----------------------------
DROP TABLE IF EXISTS `cbrc_loan_to_industry`;
CREATE TABLE `cbrc_loan_to_industry`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `industry` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '行业',
  `loan_balance` decimal(16, 6) NULL DEFAULT NULL COMMENT '本期',
  `growth_lst_m` decimal(16, 6) NULL DEFAULT NULL COMMENT '比上月',
  `growth_begin_y` decimal(16, 6) NULL DEFAULT NULL COMMENT '比年初',
  `loan_pct` decimal(16, 6) NULL DEFAULT NULL COMMENT '贷款占比-本期',
  `data_date` date NOT NULL COMMENT '数据日期',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '青海省银行业金融机构贷款投向分行业季报表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cbrc_major_regulatory_indicators
-- ----------------------------
DROP TABLE IF EXISTS `cbrc_major_regulatory_indicators`;
CREATE TABLE `cbrc_major_regulatory_indicators`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `categories` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '类别',
  `item` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '项目',
  `regulatory_standards` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '监管标准',
  `current_issue` decimal(16, 6) NULL DEFAULT NULL COMMENT '本期',
  `compare_begin_year` decimal(16, 6) NULL DEFAULT NULL COMMENT '比年初',
  `compate_last_year` decimal(16, 6) NULL DEFAULT NULL COMMENT '比去年同期',
  `data_date` date NOT NULL COMMENT '数据日期',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 337 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '青海主要监管指标汇总' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for crbc_deposit_loan_district
-- ----------------------------
DROP TABLE IF EXISTS `crbc_deposit_loan_district`;
CREATE TABLE `crbc_deposit_loan_district`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `district` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '地区',
  `deposit_balance` decimal(16, 6) NULL DEFAULT NULL COMMENT '存款-本期',
  `deposit_growth_y` decimal(16, 6) NULL DEFAULT NULL COMMENT '存款-比年初',
  `loan_balance` decimal(16, 6) NULL DEFAULT NULL COMMENT '贷款-本期',
  `loan_growth_y` decimal(16, 6) NULL DEFAULT NULL COMMENT '贷款-比年初',
  `unhealthy_balance` decimal(16, 6) NULL DEFAULT NULL COMMENT '不良贷款-本期',
  `unhealthy_growth_y` decimal(16, 6) NULL DEFAULT NULL COMMENT '不良贷款-比年初',
  `unhealthy_rate_pct` decimal(16, 6) NULL DEFAULT NULL COMMENT '不良贷款率-本期',
  `unhealthy_rate_y` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '不良贷款率-比年初',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '青海省银行业金融机构分地区存款、贷款情况表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
