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

 Date: 26/11/2020 09:41:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for kpi_show_asset_business
-- ----------------------------
DROP TABLE IF EXISTS `kpi_show_asset_business`;
CREATE TABLE `kpi_show_asset_business`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `district` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '地区',
  `total_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '合计-余额',
  `total_growth_m` decimal(12, 6) NULL DEFAULT NULL COMMENT '合计-月增',
  `total_growth_y` decimal(12, 6) NULL DEFAULT NULL COMMENT '合计-年增',
  `total_daily` decimal(12, 6) NULL DEFAULT NULL COMMENT '合计-日均',
  `small_amount_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '三农贷款(小额)-余额',
  `small_amount_growth_m` decimal(12, 6) NULL DEFAULT NULL COMMENT '三农贷款(小额)-月增',
  `small_amount_growth_y` decimal(12, 6) NULL DEFAULT NULL COMMENT '三农贷款(小额)-年增',
  `small_amount_daily` decimal(12, 6) NULL DEFAULT NULL COMMENT '三农贷款(小额)-日均',
  `consumption_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '消费贷款-余额',
  `consumption_growth_m` decimal(12, 6) NULL DEFAULT NULL COMMENT '消费贷款-月增',
  `consumption_growth_y` decimal(12, 6) NULL DEFAULT NULL COMMENT '消费贷款-年增',
  `consumption_daily` decimal(12, 6) NULL DEFAULT NULL COMMENT '消费贷款-日均',
  `small_business_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '小企业贷款-余额',
  `small_business_growth_m` decimal(12, 6) NULL DEFAULT NULL COMMENT '小企业贷款-月增',
  `small_business_growth_y` decimal(12, 6) NULL DEFAULT NULL COMMENT '小企业贷款-年增',
  `small_business_daily` decimal(12, 6) NULL DEFAULT NULL COMMENT '小企业贷款-日均',
  `data_date` date NOT NULL COMMENT '数据日期',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '全行资产业务情况表-结果数据主表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for kpi_show_asset_business_schedule
-- ----------------------------
DROP TABLE IF EXISTS `kpi_show_asset_business_schedule`;
CREATE TABLE `kpi_show_asset_business_schedule`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `district` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '地区',
  `total_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '合计-余额',
  `total_growth_m` decimal(12, 6) NULL DEFAULT NULL COMMENT '合计-月增',
  `total_growth_y` decimal(12, 6) NULL DEFAULT NULL COMMENT '合计-年增',
  `company_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '公司贷款-余额',
  `company_growth_m` decimal(12, 6) NULL DEFAULT NULL COMMENT '公司贷款-月增',
  `company_growth_y` decimal(12, 6) NULL DEFAULT NULL COMMENT '公司贷款-年增',
  `supply_chain_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '供应链-余额',
  `supply_chain_growth_m` decimal(12, 6) NULL DEFAULT NULL COMMENT '供应链-月增',
  `supply_chain_growth_y` decimal(12, 6) NULL DEFAULT NULL COMMENT '供应链-年增',
  `direct_paste_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '直贴-余额',
  `direct_paste_growth_m` decimal(12, 6) NULL DEFAULT NULL COMMENT '直贴-月增',
  `direct_paste_growth_y` decimal(12, 6) NULL DEFAULT NULL COMMENT '直贴-年增',
  `rediscount_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '转贴现-余额',
  `rediscount_growth_m` decimal(12, 6) NULL DEFAULT NULL COMMENT '转贴现-月增',
  `rediscount_growth_y` decimal(12, 6) NULL DEFAULT NULL COMMENT '转贴现-年增',
  `interbank_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '存放同业-余额',
  `interbank_growth_m` decimal(12, 6) NULL DEFAULT NULL COMMENT '存放同业-月增',
  `interbank_growth_y` decimal(12, 6) NULL DEFAULT NULL COMMENT '存放同业-年增',
  `data_date` date NOT NULL COMMENT '数据日期',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '全行资产业务情况表-结果数据附表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for kpi_show_credit
-- ----------------------------
DROP TABLE IF EXISTS `kpi_show_credit`;
CREATE TABLE `kpi_show_credit`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `district` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '地区',
  `deposit_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '存款合计-余额',
  `deposit_growth_m` decimal(12, 6) NULL DEFAULT NULL COMMENT '存款合计-月增',
  `deposit_growth_y` decimal(12, 6) NULL DEFAULT NULL COMMENT '存款合计-年增',
  `self_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '邮储自营-余额',
  `self_growth_m` decimal(12, 6) NULL DEFAULT NULL COMMENT '邮储自营-月增',
  `self_growth_y` decimal(12, 6) NULL DEFAULT NULL COMMENT '邮储自营-年增',
  `agent_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '邮储代理-余额',
  `agent_growth_m` decimal(12, 6) NULL DEFAULT NULL COMMENT '邮储代理-月增',
  `agent_growth_y` decimal(12, 6) NULL DEFAULT NULL COMMENT '邮储代理-年增',
  `company_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '公司存款-余额',
  `company_growth_m` decimal(12, 6) NULL DEFAULT NULL COMMENT '公司存款-月增',
  `company_growth_y` decimal(12, 6) NULL DEFAULT NULL COMMENT '公司存款-年增',
  `unhealthy_rate` decimal(12, 6) NULL DEFAULT NULL COMMENT '不良率',
  `overdue_rate` decimal(12, 6) NULL DEFAULT NULL COMMENT '逾期率',
  `data_date` date NOT NULL COMMENT '数据日期',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '全行KPI指标表（二）展示结果数据表(存贷)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for kpi_show_credit_schedule
-- ----------------------------
DROP TABLE IF EXISTS `kpi_show_credit_schedule`;
CREATE TABLE `kpi_show_credit_schedule`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `district` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '地区',
  `total_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '合计-余额',
  `total_growth_m` decimal(12, 6) NULL DEFAULT NULL COMMENT '合计-月增',
  `total_growth_y` decimal(12, 6) NULL DEFAULT NULL COMMENT '合计-年增',
  `retail_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人零售贷款-余额',
  `retail_growth_m` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人零售贷款-月增',
  `retail_growth_y` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人零售贷款-年增',
  `small_business_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '小企业贷款-余额',
  `small_business_growth_m` decimal(12, 6) NULL DEFAULT NULL COMMENT '小企业贷款-月增',
  `small_business_growth_y` decimal(12, 6) NULL DEFAULT NULL COMMENT '小企业贷款-年增',
  `company_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '公司贷款-余额',
  `company_growth_m` decimal(12, 6) NULL DEFAULT NULL COMMENT '公司贷款-月增',
  `company_growth_y` decimal(12, 6) NULL DEFAULT NULL COMMENT '公司贷款-年增',
  `supply_chain_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '供应链-余额',
  `supply_chain_growth_m` decimal(12, 6) NULL DEFAULT NULL COMMENT '供应链-月增',
  `supply_chain_growth_y` decimal(12, 6) NULL DEFAULT NULL COMMENT '供应链-年增',
  `bill_financing_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '票据融资-余额',
  `bill_financing_growth_m` decimal(12, 6) NULL DEFAULT NULL COMMENT '票据融资-月增',
  `bill_financing_growth_y` decimal(12, 6) NULL DEFAULT NULL COMMENT '票据融资-年增',
  `data_date` date NOT NULL COMMENT '数据日期',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '全行KPI指标表（二）展示结果数据附表(贷款)' ROW_FORMAT = Dynamic;

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
-- Table structure for kpi_source_credit_scale
-- ----------------------------
DROP TABLE IF EXISTS `kpi_source_credit_scale`;
CREATE TABLE `kpi_source_credit_scale`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `district` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '地区',
  `microloans` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人贷款-小额贷款',
  `individual_business` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人贷款-个商贷款',
  `home_mortgage` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人贷款-住房按揭贷款',
  `other_consumer` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人贷款-其他消费贷款',
  `personal_other` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人贷款-其他贷款',
  `small_business` decimal(12, 6) NULL DEFAULT NULL COMMENT '公司贷款-小企业',
  `supply_chain` decimal(12, 6) NULL DEFAULT NULL COMMENT '公司贷款-供应链',
  `domestic_trade_finance` decimal(12, 6) NULL DEFAULT NULL COMMENT '公司贷款-国内贸易融资',
  `international_trade_finance` decimal(12, 6) NULL DEFAULT NULL COMMENT '公司贷款-国际贸易融资',
  `other_company` decimal(12, 6) NULL DEFAULT NULL COMMENT '公司贷款-其他公司贷款',
  `dedicated_financing` decimal(12, 6) NULL DEFAULT NULL COMMENT '公司贷款-专项融资',
  `small_business_factoring` decimal(12, 6) NULL DEFAULT NULL COMMENT '公司贷款-小企业保理',
  `corporate_other` decimal(12, 6) NULL DEFAULT NULL COMMENT '公司贷款-其他',
  `corporation_overdraft` decimal(12, 6) NULL DEFAULT NULL COMMENT '公司贷款-法人账户透支',
  `three_farmers_company` decimal(12, 6) NULL DEFAULT NULL COMMENT '公司贷款-三农公司贷款',
  `international_company` decimal(12, 6) NULL DEFAULT NULL COMMENT '公司贷款-国际公司贷款',
  `mergers_acquisitions` decimal(12, 6) NULL DEFAULT NULL COMMENT '公司贷款-并购贷款',
  `various_advances` decimal(12, 6) NULL DEFAULT NULL COMMENT '公司贷款-各项垫款',
  `rediscount` decimal(12, 6) NULL DEFAULT NULL COMMENT '票据-转贴现',
  `direct_paste` decimal(12, 6) NULL DEFAULT NULL COMMENT '票据-直贴',
  `personal_overdraft` decimal(12, 6) NULL DEFAULT NULL COMMENT '透支-个人透支',
  `unit_overdraft` decimal(12, 6) NULL DEFAULT NULL COMMENT '透支-单位透支',
  `foreign_currency` decimal(12, 6) NULL DEFAULT NULL COMMENT '国际-外币贷款',
  `buy_forfeiting_rmb` decimal(12, 6) NULL DEFAULT NULL COMMENT '国际-买入福费廷(人民币)',
  `buy_forfeiting_foreign` decimal(12, 6) NULL DEFAULT NULL COMMENT '国际-买入福费廷(外币)',
  `data_date` date NOT NULL COMMENT '数据日期',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '信贷规模表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for kpi_source_original_data
-- ----------------------------
DROP TABLE IF EXISTS `kpi_source_original_data`;
CREATE TABLE `kpi_source_original_data`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `indicator_num` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '指标号',
  `indicator_name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '指标名称',
  `quan_sheng` decimal(16, 6) NULL DEFAULT NULL COMMENT '青海生分行',
  `ben_bu` decimal(16, 6) NULL DEFAULT NULL COMMENT '青海省分行本部',
  `ji_guan` decimal(16, 6) NULL DEFAULT NULL COMMENT '青海省分行机关',
  `cheng_xi` decimal(16, 6) NULL DEFAULT NULL COMMENT '西宁市城西支行',
  `da_tong` decimal(16, 6) NULL DEFAULT NULL COMMENT '大通支行',
  `hai_dong` decimal(16, 6) NULL DEFAULT NULL COMMENT '青海省海东市支行',
  `cheng_zhong` decimal(16, 6) NULL DEFAULT NULL COMMENT '西宁市城中支行',
  `hai_nan` decimal(16, 6) NULL DEFAULT NULL COMMENT '青海省海南藏族自治州支行',
  `yu_shu` decimal(16, 6) NULL DEFAULT NULL COMMENT '青海省玉树藏族自治州支行',
  `hai_xi` decimal(16, 6) NULL DEFAULT NULL COMMENT '海西蒙古族藏族自治州支行',
  `hai_bei` decimal(16, 6) NULL DEFAULT NULL COMMENT '青海省海北藏族自治州支行',
  `huang_nan` decimal(16, 6) NULL DEFAULT NULL COMMENT '黄南藏族自治州支行',
  `guo_luo` decimal(16, 6) NULL DEFAULT NULL COMMENT '青海省果洛藏族自治州支行',
  `ge_er_mu` decimal(16, 6) NULL DEFAULT NULL COMMENT '格尔木市支行',
  `ying_yi_bu` decimal(16, 6) NULL DEFAULT NULL COMMENT '青海省分行(营业部)',
  `data_date` date NOT NULL COMMENT '数据日期',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '数据原表（商业银行日报表）' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for kpi_source_overdue
-- ----------------------------
DROP TABLE IF EXISTS `kpi_source_overdue`;
CREATE TABLE `kpi_source_overdue`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `district` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '地区',
  `personal_business_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人经营性贷款-逾期余额',
  `personal_business_balance_last` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人经营性贷款-逾期余额较上期',
  `personal_business_balance_by` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人经营性贷款-逾期余额较年初',
  `personal_business_rate` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人经营性贷款-逾期率',
  `personal_business_rate_last` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人经营性贷款-逾期率较上期',
  `personal_business_rate_by` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人经营性贷款-逾期率较年初',
  `personal_consumer_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人消费贷款-逾期余额',
  `personal_consumer_balance_last` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人消费贷款-逾期余额较上期',
  `personal_consumer_balance_by` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人消费贷款-逾期余额较年初',
  `personal_consumer_rate` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人消费贷款-逾期率',
  `personal_consumer_rate_last` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人消费贷款-逾期率较上期',
  `personal_consumer_rate_by` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人消费贷款-逾期率较年初',
  `small_business_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '小企业贷款-逾期余额',
  `small_business_balance_last` decimal(12, 6) NULL DEFAULT NULL COMMENT '小企业贷款-逾期余额较上期',
  `small_business_balance_by` decimal(12, 6) NULL DEFAULT NULL COMMENT '小企业贷款-逾期余额较年初',
  `small_business_rate` decimal(12, 6) NULL DEFAULT NULL COMMENT '小企业贷款-逾期率',
  `small_business_rate_last` decimal(12, 6) NULL DEFAULT NULL COMMENT '小企业贷款-逾期率较上期',
  `small_business_rate_by` decimal(12, 6) NULL DEFAULT NULL COMMENT '小企业贷款-逾期率较年初',
  `credit_card_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '信用卡业务-逾期余额',
  `credit_card_balance_last` decimal(12, 6) NULL DEFAULT NULL COMMENT '信用卡业务-逾期余额较上期',
  `credit_card_balance_by` decimal(12, 6) NULL DEFAULT NULL COMMENT '信用卡业务-逾期余额较年初',
  `credit_card_rate` decimal(12, 6) NULL DEFAULT NULL COMMENT '信用卡业务-逾期率',
  `credit_card_rate_last` decimal(12, 6) NULL DEFAULT NULL COMMENT '信用卡业务-逾期率较上期',
  `credit_card_rate_by` decimal(12, 6) NULL DEFAULT NULL COMMENT '信用卡业务-逾期率较年初',
  `retail_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '零售-逾期余额',
  `retail_balance_last` decimal(12, 6) NULL DEFAULT NULL COMMENT '零售-逾期余额较上期',
  `retail_balance_by` decimal(12, 6) NULL DEFAULT NULL COMMENT '零售-逾期余额较年初',
  `retail_rate` decimal(12, 6) NULL DEFAULT NULL COMMENT '零售-逾期率',
  `retail_rate_last` decimal(12, 6) NULL DEFAULT NULL COMMENT '零售-逾期率较上期',
  `retail_rate_by` decimal(12, 6) NULL DEFAULT NULL COMMENT '零售-逾期率较年初',
  `data_date` date NOT NULL COMMENT '数据日期',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '零售信贷逾期表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for kpi_source_saving_data
-- ----------------------------
DROP TABLE IF EXISTS `kpi_source_saving_data`;
CREATE TABLE `kpi_source_saving_data`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `district` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '地区',
  `daily_balance` decimal(16, 6) NULL DEFAULT NULL COMMENT '本日余额-全省',
  `daily_balance_self` decimal(16, 6) NULL DEFAULT NULL COMMENT '本日余额-自营',
  `daily_balance_agent` decimal(16, 6) NULL DEFAULT NULL COMMENT '本日余额-代理',
  `daily_increase` decimal(16, 6) NULL DEFAULT NULL COMMENT '本日新增-全省',
  `daily_increase_self` decimal(16, 6) NULL DEFAULT NULL COMMENT '本日新增-自营',
  `daily_increase_agent` decimal(16, 6) NULL DEFAULT NULL COMMENT '本日新增-代理',
  `monthly_increase` decimal(16, 6) NULL DEFAULT NULL COMMENT '本月新增-全省',
  `monthly_increase_self` decimal(16, 6) NULL DEFAULT NULL COMMENT '本月新增-自营',
  `monthly_increase_agent` decimal(16, 6) NULL DEFAULT NULL COMMENT '本月新增-代理',
  `yearly_increase` decimal(16, 6) NULL DEFAULT NULL COMMENT '本年新增-全省',
  `yearly_increase_self` decimal(16, 6) NULL DEFAULT NULL COMMENT '本年新增-自营',
  `yearly_increase_agent` decimal(16, 6) NULL DEFAULT NULL COMMENT '本年新增-代理',
  `data_date` date NOT NULL COMMENT '数据日期',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '代理储蓄数据(储蓄存款余额发展日报表)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for kpi_source_unhealthy
-- ----------------------------
DROP TABLE IF EXISTS `kpi_source_unhealthy`;
CREATE TABLE `kpi_source_unhealthy`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `district` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '地区',
  `personal_business_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人经营性贷款-不良余额',
  `personal_business_balance_last` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人经营性贷款-不良余额较上期',
  `personal_business_balance_by` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人经营性贷款-不良余额较年初',
  `personal_business_rate` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人经营性贷款-不良率',
  `personal_business_rate_last` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人经营性贷款-不良率较上期',
  `personal_business_rate_by` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人经营性贷款-不良率较年初',
  `personal_consumer_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人消费贷款-不良余额',
  `personal_consumer_balance_last` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人消费贷款-不良余额较上期',
  `personal_consumer_balance_by` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人消费贷款-不良余额较年初',
  `personal_consumer_rate` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人消费贷款-不良率',
  `personal_consumer_rate_last` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人消费贷款-不良率较上期',
  `personal_consumer_rate_by` decimal(12, 6) NULL DEFAULT NULL COMMENT '个人消费贷款-不良率较年初',
  `small_business_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '小企业贷款-不良余额',
  `small_business_balance_last` decimal(12, 6) NULL DEFAULT NULL COMMENT '小企业贷款-不良余额较上期',
  `small_business_balance_by` decimal(12, 6) NULL DEFAULT NULL COMMENT '小企业贷款-不良余额较年初',
  `small_business_rate` decimal(12, 6) NULL DEFAULT NULL COMMENT '小企业贷款-不良率',
  `small_business_rate_last` decimal(12, 6) NULL DEFAULT NULL COMMENT '小企业贷款-不良率较上期',
  `small_business_rate_by` decimal(12, 6) NULL DEFAULT NULL COMMENT '小企业贷款-不良率较年初',
  `credit_card_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '信用卡业务-不良余额',
  `credit_card_balance_last` decimal(12, 6) NULL DEFAULT NULL COMMENT '信用卡业务-不良余额较上期',
  `credit_card_balance_by` decimal(12, 6) NULL DEFAULT NULL COMMENT '信用卡业务-不良余额较年初',
  `credit_card_rate` decimal(12, 6) NULL DEFAULT NULL COMMENT '信用卡业务-不良率',
  `credit_card_rate_last` decimal(12, 6) NULL DEFAULT NULL COMMENT '信用卡业务-不良率较上期',
  `credit_card_rate_by` decimal(12, 6) NULL DEFAULT NULL COMMENT '信用卡业务-不良率较年初',
  `retail_balance` decimal(12, 6) NULL DEFAULT NULL COMMENT '零售-不良余额',
  `retail_balance_last` decimal(12, 6) NULL DEFAULT NULL COMMENT '零售-不良余额较上期',
  `retail_balance_by` decimal(12, 6) NULL DEFAULT NULL COMMENT '零售-不良余额较年初',
  `retail_rate` decimal(12, 6) NULL DEFAULT NULL COMMENT '零售-不良率',
  `retail_rate_last` decimal(12, 6) NULL DEFAULT NULL COMMENT '零售-不良率较上期',
  `retail_rate_by` decimal(12, 6) NULL DEFAULT NULL COMMENT '零售-不良率较年初',
  `data_date` date NOT NULL COMMENT '数据日期',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '零售信贷不良表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
