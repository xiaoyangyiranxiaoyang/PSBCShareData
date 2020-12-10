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

 Date: 10/12/2020 08:50:35
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
) ENGINE = InnoDB AUTO_INCREMENT = 28 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '青海省银行业金融机构资产负债主要指标' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cbrc_assets_liabilities_main_indicators
-- ----------------------------
INSERT INTO `cbrc_assets_liabilities_main_indicators` VALUES (1, ' 政策性银行', 2042.307010, 91.069914, 2094.494838, 78.264155, -52.000000, 12.805764, 12.805766, 12.888972, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_main_indicators` VALUES (2, '   国家开发银行', 1524.068837, 57.509461, 1577.640808, 44.902456, -54.000000, 12.607005, 12.607005, 10.355057, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_main_indicators` VALUES (3, '   农业发展银行', 518.238173, 33.560453, 516.854030, 33.361699, 1.384143, 0.198759, 0.198761, 2.533915, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_main_indicators` VALUES (4, ' 国有大型商业银行', 3717.621770, 405.054218, 3671.846869, 152.936128, 45.774900, 252.118085, 60.663968, 59.750093, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_main_indicators` VALUES (5, '   工商银行', 790.170709, 40.416498, 781.113203, 9.663138, 9.057505, 30.753360, 5.290737, 1.505034, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_main_indicators` VALUES (6, '   农业银行', 915.527151, 121.552176, 906.753035, 96.598793, 8.774115, 24.953384, 5.900942, 2.041431, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_main_indicators` VALUES (7, '   中国银行', 537.268086, 58.627481, 518.534541, 0.345110, 18.733545, 58.282371, 16.946933, 34.951478, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_main_indicators` VALUES (8, '   建设银行', 1011.850702, 131.340772, 1029.228892, 59.412431, -17.000000, 71.928334, 11.222318, -1.000000, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_main_indicators` VALUES (9, '   交通银行', 124.414143, 9.525849, 117.233426, -9.000000, 7.180719, 18.106611, 6.037641, 6.990450, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_main_indicators` VALUES (10, '   邮政储蓄银行', 338.390980, 43.591442, 318.983771, -5.000000, 19.407210, 48.094025, 15.265398, 12.686166, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_main_indicators` VALUES (11, ' 股份制商业银行', 799.229878, 176.789350, 789.856000, 167.160074, 9.373879, 9.629277, 3.290933, 6.289270, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_main_indicators` VALUES (12, '   招商银行', 125.375450, 0.273834, 124.116899, -2.000000, 1.258551, 2.548155, 1.280819, 2.716978, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_main_indicators` VALUES (13, '   上海浦东发展银行', 96.829247, -18.000000, 94.817865, -20.000000, 2.011383, 2.708611, 0.975008, 4.337746, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_main_indicators` VALUES (14, '   中信银行', 149.713254, 59.245623, 148.479683, 58.077822, 1.233572, 1.167802, 0.260054, 0.159483, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_main_indicators` VALUES (15, '   兴业银行', 255.936330, 112.646427, 255.516178, 114.623196, 0.420151, -2.000000, -1.000000, -1.000000, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_main_indicators` VALUES (16, '   民生银行', 98.762427, 10.055046, 97.806747, 11.173373, 0.955680, -1.000000, 0.000000, -1.000000, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_main_indicators` VALUES (17, '   光大银行', 40.670267, 12.611963, 38.344213, 6.450884, 2.326054, 6.161079, 1.273290, 1.253650, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_main_indicators` VALUES (18, '   华夏银行', 31.942903, 0.000000, 30.774415, -1.000000, 1.168488, 0.138726, 0.140833, 0.129688, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_main_indicators` VALUES (19, ' 城市商业银行', 973.436942, -59.000000, 882.928513, -59.000000, 90.508430, -1.000000, 3.858660, -3.000000, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_main_indicators` VALUES (20, ' 农村金融机构', 1274.773017, 137.583853, 1177.197017, 135.319695, 97.576000, 2.264147, 6.050716, 2.172826, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_main_indicators` VALUES (21, '   农村商业银行', 1052.445059, 69.374319, 969.868276, 66.583544, 82.576783, 2.790765, 4.733014, 1.280845, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_main_indicators` VALUES (22, '   农村信用社', 206.469697, 65.818283, 194.424583, 66.573555, 12.045114, -1.000000, 1.361831, 0.000000, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_main_indicators` VALUES (23, '   村镇银行', 15.699618, 2.392842, 12.758615, 2.162661, 2.941003, 0.230180, 0.000000, 1.178016, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_main_indicators` VALUES (24, '   农村资金互助社', 0.158643, 0.000000, 0.145543, 0.000000, 0.013100, 0.000000, 0.000057, 0.000000, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_main_indicators` VALUES (25, ' 财务公司', 121.411906, -15.000000, 89.328652, -17.000000, 32.083254, 1.683303, 1.685268, 0.324404, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_main_indicators` VALUES (26, ' 信托公司', 173.891343, -8.000000, 14.880867, -29.000000, 159.010476, 20.480834, 20.473274, 6.503589, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_main_indicators` VALUES (27, '全金融机构合计', 9102.671867, 727.612988, 8720.532755, 429.556552, 382.139111, 298.056426, 108.828585, 82.350157, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);

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
) ENGINE = InnoDB AUTO_INCREMENT = 261 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '青海银行业机构资产负债主要项目统计月表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cbrc_assets_liabilities_major_projects
-- ----------------------------
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (209, 'ASSETS', '    现金', 28.746183, 1.293276, 1.460481, 0.034490, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (210, 'LIABILITIES', '    单位存款', 2799.547847, -40.000000, -2.000000, 0.000000, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (211, 'ASSETS', '    贵金属', 1.671134, 0.465215, 0.331988, 0.586510, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (212, 'LIABILITIES', '    储蓄存款', 2576.779035, 109.811556, 7.424447, 0.101470, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (213, 'ASSETS', '    存放中央银行款项', 194.173549, -176.000000, -45.000000, 0.000000, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (214, 'LIABILITIES', '    向中央银行借款', 223.852157, 28.440045, -8.000000, 1.000770, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (215, 'ASSETS', '    存放同业款项', 244.945732, 112.973511, 10.201813, 0.023340, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (216, 'LIABILITIES', '    同业存放款项', 368.186342, 234.790739, -21.000000, 0.256540, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (217, 'ASSETS', '    存放系统内款项', 1079.257898, 398.369931, 20.306993, 0.129480, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (218, 'LIABILITIES', '    系统内存放款项', 2092.375171, 71.762148, 20.015022, 0.003940, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (219, 'ASSETS', '    拨付营运资金', 0.000000, 0.000000, 0.000000, NULL, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (220, 'LIABILITIES', '    同业拆入', 6.000000, -37.000000, 0.000000, 0.000000, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (221, 'ASSETS', '    应收利息', 46.654320, 25.613277, 12.752292, 0.002160, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (222, 'LIABILITIES', '    卖出回购款项', 156.387912, -17.000000, 11.349717, 0.000000, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (223, 'ASSETS', '    贷款', 5624.415063, 1.628177, 15.335438, 0.000000, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (224, 'LIABILITIES', '    汇出汇款', 0.084842, 0.068898, 0.066966, 0.000000, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (225, 'ASSETS', '    贸易融资', 135.997648, 7.762348, -2.000000, 0.005570, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (226, 'LIABILITIES', '    应解汇款', 7.222500, 1.011757, 0.000000, 0.000000, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (227, 'ASSETS', '    贴现及买断式转贴现', 926.432236, -12.000000, -18.000000, 0.094360, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (228, 'LIABILITIES', '    存入保证金', 125.395269, 13.086489, -4.000000, 0.341530, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (229, 'ASSETS', '    拆放同业', 36.856720, -8.000000, -5.000000, 0.015190, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (230, 'LIABILITIES', '    应付利息', 62.249907, 12.465301, 3.625522, 0.228080, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (231, 'ASSETS', '    其他应收款', 19.479590, 1.130147, 0.687210, 0.000000, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (232, 'LIABILITIES', '    应付职工薪酬', 15.075347, -2.000000, 0.523952, 0.237220, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (233, 'ASSETS', '    投资', 832.890543, 135.823077, -5.000000, 0.252120, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (234, 'LIABILITIES', '    应付股利', 0.587850, 0.051115, 0.000000, -1.000000, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (235, 'ASSETS', '    买入返售资产', 20.330487, 17.335487, 0.000000, 1.152080, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (236, 'LIABILITIES', '    应付债券', 49.200000, 30.000000, 0.000000, 1.562500, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (237, 'ASSETS', '    长期待摊费用', 2.038123, 0.000000, 0.031939, 0.170470, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (238, 'LIABILITIES', '    其他', 237.588576, 23.401383, -7.000000, 0.262510, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (239, 'ASSETS', '    固定资产原价', 100.112094, 1.055115, 0.418915, 0.059290, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (240, 'LIABILITIES', '负债合计', 8720.532755, 429.556552, 1.326759, 0.033730, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (241, 'ASSETS', '        减：累计折旧', 49.018793, 2.669616, 0.222394, 0.087880, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (242, 'LIABILITIES', '少数股东权益', 0.000000, 0.000000, 0.000000, NULL, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (243, 'ASSETS', '    固定资产净值', 51.093300, -2.000000, 0.196521, 0.033240, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (244, 'LIABILITIES', '    实收资本（拨入营运资本）', 172.179876, 1.370845, 0.000000, 0.012770, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (245, 'ASSETS', '    固定资产清理', 0.276246, 0.121598, 0.158870, 0.801720, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (246, 'LIABILITIES', '    资本公积', 43.600486, 0.000000, 0.000000, 0.000000, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (247, 'ASSETS', '    在建工程', 11.055454, -1.000000, 0.000000, 0.000000, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (248, 'LIABILITIES', '    盈余公积', 27.478980, 1.020653, 0.017058, 0.153420, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (249, 'ASSETS', '    无形资产', 7.876204, 0.000000, 0.000000, 0.094650, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (250, 'LIABILITIES', '    未分配利润', 85.233620, 292.871633, 8.152851, 1.710290, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (251, 'ASSETS', '    抵债资产', 13.972624, 9.545524, 0.000000, 4.245460, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (252, 'LIABILITIES', '        其中：本年利润', 108.828585, 294.330914, 8.520433, 3.110080, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (253, 'ASSETS', '    递延所得税资产', 35.751506, -1.000000, -1.000000, 1.032400, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (254, 'LIABILITIES', '    其他所有者权益', NULL, NULL, NULL, NULL, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (255, 'ASSETS', '    其他资产', 187.225980, 103.816477, 27.365869, 0.603990, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (256, 'LIABILITIES', '所有者权益合计', 382.139111, 298.056426, 7.777282, 0.206330, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (257, 'ASSETS', '  减：各项资产减值损失准备', 398.468672, -111.000000, 2.367251, 0.012380, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (258, 'LIABILITIES', '', NULL, NULL, NULL, NULL, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (259, 'ASSETS', '资产总计', 9102.671867, 727.612988, 9.104034, 0.039980, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_assets_liabilities_major_projects` VALUES (260, 'LIABILITIES', '负债及所有者权益总计', 9102.671866, 727.612978, 9.104041, 0.039980, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);

-- ----------------------------
-- Table structure for cbrc_major_regulatory_indicators
-- ----------------------------
DROP TABLE IF EXISTS `cbrc_major_regulatory_indicators`;
CREATE TABLE `cbrc_major_regulatory_indicators`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
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
) ENGINE = InnoDB AUTO_INCREMENT = 106 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '青海主要监管指标汇总' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cbrc_major_regulatory_indicators
-- ----------------------------
INSERT INTO `cbrc_major_regulatory_indicators` VALUES (85, '总资产', '', 9102.671867, 727.612988, 349.978005, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_major_regulatory_indicators` VALUES (86, '　　各项贷款', '', 6686.844946, -3.000000, -16.000000, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_major_regulatory_indicators` VALUES (87, '总负债', '', 8720.532755, 429.556552, 284.616788, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_major_regulatory_indicators` VALUES (88, '　　各项存款', '', 5514.599060, 74.530486, 5.392737, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_major_regulatory_indicators` VALUES (89, '其中：储蓄存款', '', 2576.779035, 109.811556, 237.383490, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_major_regulatory_indicators` VALUES (90, '所有者权益', '', 382.139111, 298.056426, 65.361208, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_major_regulatory_indicators` VALUES (91, '本年利润（税后）', '', 108.828585, 294.330914, 82.350157, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_major_regulatory_indicators` VALUES (92, '资产利润率（季）', '>=0.6%', NULL, NULL, NULL, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_major_regulatory_indicators` VALUES (93, '调整资产利润率（季）', '', NULL, NULL, NULL, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_major_regulatory_indicators` VALUES (94, '成本收入比率（季）', '<=45%', NULL, NULL, NULL, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_major_regulatory_indicators` VALUES (95, '中间业务收入比率（季）', '', NULL, NULL, NULL, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_major_regulatory_indicators` VALUES (96, '利息收入率（季）', '', NULL, NULL, NULL, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_major_regulatory_indicators` VALUES (97, '净息差（季）', '', NULL, NULL, NULL, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_major_regulatory_indicators` VALUES (98, '不良贷款余额', '', 285.740329, -165.000000, -37.000000, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_major_regulatory_indicators` VALUES (99, '不良贷款率', '<=5%', 0.042730, -2.000000, -1.000000, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_major_regulatory_indicators` VALUES (100, '不良资产总额（季）', '', NULL, NULL, NULL, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_major_regulatory_indicators` VALUES (101, '不良资产率（季）', '<=4%', NULL, NULL, NULL, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_major_regulatory_indicators` VALUES (102, '贷款损失准备充足率', '>=100%', NULL, NULL, NULL, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_major_regulatory_indicators` VALUES (103, '拨备覆盖率 ', '　', NULL, NULL, NULL, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_major_regulatory_indicators` VALUES (104, '资产损失准备充足率（季）', '>=100%', NULL, NULL, NULL, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);
INSERT INTO `cbrc_major_regulatory_indicators` VALUES (105, '存贷款比例', '<=75%', 1.212570, -2.000000, 0.000000, '2020-10-01', '0', 'admin', '2020-12-10 08:44:17', NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
