

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for loan_main
-- ----------------------------
DROP TABLE IF EXISTS `loan_main`;
CREATE TABLE `loan_main`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `apply_id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '贷款申请id',
  `load_rct_id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '借据号',
  `cust_id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '客户号',
  `cust_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '客户姓名',
  `cust_cert_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '客户证件号',
  `loan_product_id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '产品编码',
  `product_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '贷款产品名称',
  `product_class` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '产品分类',
  `int_rate` decimal(4, 2) NULL DEFAULT NULL COMMENT '贷款利率',
  `bmk_rate` decimal(4, 2) NULL DEFAULT NULL COMMENT '基准利率',
  `usage_desc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用途',
  `loan_term` int(4) NULL DEFAULT NULL COMMENT '贷款期限',
  `loan_bgn_date` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '贷款开始时间',
  `loan_dltne_date` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '贷款截止时间',
  `loan_amt` decimal(15, 2) NULL DEFAULT NULL COMMENT '贷款金额',
  `loan_bal` decimal(15, 2) NULL DEFAULT NULL COMMENT '贷款余额',
  `handov_flag` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '保全移交标记',
  `repay_acc_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '还款账户名称',
  `repay_acc_acc_no` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '还款账户账号',
  `risk_class` tinyint(2) NULL DEFAULT NULL COMMENT '风险分类(0:正常,1:关注,2:次级,3:可疑,4;损失)',
  `teller_no` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '柜员号',
  `inst_no` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '创建机构号',
  `empolyee_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '员工姓名',
  `empolyee_card` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '员工证件号',
  `inst_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '机构名称',
  `limit_contract_no` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '额度合同编号',
  `loan_contract_no` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '贷款合同编号',
  `etl_date` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '跑批时间',
  `create_by` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间-应用操作时间',
  `server_ip` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '服务器IP',
  `update_by` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `update_time` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间',
  `del_flag` tinyint(2) NOT NULL DEFAULT 0 COMMENT '是否逻辑删除:默认0未删除;1已删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 44 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '贷款记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of loan_main
-- ----------------------------
INSERT INTO `loan_main` VALUES (1, 'S1310900001559', '63010111009130146301', 'K1310900002513', '尕松拉毛', '632721198103130525', 'P30102030009', '邮薪贷', '', 6.18, 4.75, '', 36, '2018/3/28', '2021/3/28', 120000.00, 21040.02, '', '尕松拉毛', '6217998500008734466', 0, '20090414350', '6399955Q', '李婷婷', '239005199304181562', '中国邮政储蓄银行股份有限公司青海省玉树藏族自治州支行', '', '6399955Q118030366582', '20201118', NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `loan_main` VALUES (2, 'S1310900001559', '63010111009131652501', 'K1310900002513', '文周吉', '632721198103130525', 'P30101040005', '极速贷（纯线上模式）', '', 8.00, 3.85, '', 24, '2020/6/10', '2022/6/10', 60000.00, 48276.54, '', '文周吉', '6221808500000867308', 1, '20150828330', '6399957Q', '拉旦才让', '239005199304181562', '中国邮政储蓄银行股份有限公司青海省海南藏族自治州支行', '6399957Q220063177691', '6399955Q118030366582', '20201118', NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `loan_main` VALUES (3, 'S1310900001559', '63010111009133358101', 'K1310900002513', '王海波', '632721198103130525', 'P30101040005', '极速贷（纯线上模式）', '', 10.00, 4.75, '', 24, '2019/8/29', '2021/8/29', 150000.00, 66147.88, '', '王海波', '6217998500008864081', 2, '20110857800', '6399960Q', '陈龙', '239005199304181562', '中国邮政储蓄银行股份有限公司青海省海东市支行', '', '6399955Q118030366582', '20201118', NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `loan_main` VALUES (4, 'S1310900001559', '63010111009133762901', 'K1310900002513', '王海波', '632721198103130525', 'P30101040005', '极速贷（纯线上模式）', '', 10.00, 3.85, '', 24, '2020/4/23', '2022/4/23', 40000.00, 30734.05, '', '王海波', '6217998500008864081', 3, '20100809920', '6399960Q', '白生芳', '239005199304181562', '中国邮政储蓄银行股份有限公司青海省海东市支行', '6399960Q219080208325', '6399955Q118030366582', '20201118', NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `loan_main` VALUES (5, 'S1310900001559', '63010111009133979601', 'K1310900002513', '代春兰', '632721198103130525', 'P30102030003', '个人综合消费贷款', '', 5.39, 4.65, '', 120, '2017/3/9', '2027/3/9', 250000.00, 173487.39, '', '代春兰', '6217998500012487556', 4, '20090508070', '6399962Q', '梁婧', '239005199304181562', '中国邮政储蓄银行股份有限公司青海省分行', '6399962Q217035644101', '6399955Q118030366582', '20201118', NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `loan_main` VALUES (6, 'S1310900001559', '63010111009134703201', 'K1310900002513', '拉措卓玛', '632721198103130525', 'P30102030009', '邮薪贷', '', 6.18, 4.75, '', 36, '2019/8/1', '2022/8/1', 50000.00, 31645.13, '', '拉措卓玛', '6217978500000415373', 0, '20141225690', '63001222', '张有鹏', '239005199304181562', '中国邮政储蓄银行股份有限公司西宁市城中支行', '', '6399955Q118030366582', '20201118', NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `loan_main` VALUES (9, 'S1310900001559', '63010111009137117501', 'K1310900002513', '张玉英', '632721198103130525', 'P30102030011', '优享贷', '', 6.10, NULL, '', 36, '2020/8/4', '2023/8/4', 50000.00, 46173.02, '', '张玉英', '6217998500011107031', 1, '20160833980', '63002226', '王联栋', '239005199304181562', '中国邮政储蓄银行股份有限公司青海省海北州门源回族自治县支行', '63002226220084021083', '6399955Q118030366582', '20201118', NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `loan_main` VALUES (11, 'S1310900001559', '63010111009137904001', 'K1310900002513', '张素尔', '632721198103130525', 'P30101020001', '商贷通-抵质押', '', 7.13, 4.75, '', 60, '2017/3/24', '2022/3/24', 60000.00, 19214.45, '', '张素尔', '6217998500002032370', 2, '20111230640', '63002328', '王磊', '239005199304181562', '中国邮政储蓄银行股份有限公司西宁市南滩支行', '63002328215084373837', '6399955Q118030366582', '20201118', NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `loan_main` VALUES (15, 'S1310900001559', '63010111009139358701', 'K1310900002513', '石岱俊', '632721198103130525', 'P30102010004', '个人二手房贷款', '', 5.39, 4.80, '', 120, '2019/1/24', '2029/1/24', 310000.00, 267046.83, '', '石岱俊', '6217998500012122757', 3, '20100828520', '6399960Q', '曹菁', '239005199304181562', '中国邮政储蓄银行股份有限公司青海省海东市支行', '', '6399955Q118030366582', '20201118', NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `loan_main` VALUES (26, 'S1310900001559', '63010111009138391601', 'K1310900002513', '冯大秀', '632721198103130525', 'P30102010003', '个人一手房贷款', '', 4.90, 4.80, '', 144, '2017/4/26', '2029/4/26', 230000.00, 176213.43, '', '冯大秀', '6217998500003526008', 4, '20100110180', '6399960Q', '刘贵金', '239005199304181562', '中国邮政储蓄银行股份有限公司青海省海东市支行', '', '6399955Q118030366582', '20201118', NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `loan_main` VALUES (27, 'S1310900001559', '63010111009138566401', 'K1310900002513', '多杰才旦', '632721198103130525', 'P30101030002', '政贷通-扶贫小额贷款', '', 4.35, 3.85, 'A0311', 12, '2020/11/13', '2021/11/13', 30000.00, 30000.00, '', '多杰才旦', '6217998500011382196', 0, '20111011680', '2198629Q', '管雪', '239005199304181562', '', '6399956Q220115737286', '6399955Q118030366582', '20201118', NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `loan_main` VALUES (29, 'S1310900001559', '63010111009139358701', 'K1310900002513', '俄赛多日杰', '632721198103130525', 'P30101030001', '政贷通-再就业担保', '', 4.75, 4.75, '', 36, '2019/5/22', '2022/5/22', 100000.00, 100000.00, '', '俄赛多日杰', '6217998500012352644', 1, '20160833980', '6399959Q', '王联栋', '239005199304181562', '中国邮政储蓄银行股份有限公司青海省海北藏族自治州支行', '', '6399955Q118030366582', '20201118', NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `loan_main` VALUES (34, 'S1310900001559', '63010111009134703201', 'K1310900002513', '孔令虎', '632721198103130525', 'P30101020004', '商贷通-联保', '', 8.00, 8.00, '', 24, '2019/3/21', '2021/3/21', 150000.00, 43481.73, '', '孔令虎', '6217998500008022516', 2, '20100110180', '6399960Q', '刘贵金', '239005199304181562', '中国邮政储蓄银行股份有限公司青海省海东市支行', '', '6399955Q118030366582', '20201118', NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `loan_main` VALUES (39, 'S1310900001559', '63010111009137904001', 'K1310900002513', '祝富甲', '632721198103130525', 'P30101010002', '农贷通-信用', '', 5.10, 3.85, 'A0179', 12, '2020/10/20', '2021/10/20', 50000.00, 50000.00, '', '祝富甲', '6217998500014517053', 3, '20090716210', '35000011', '陈雪瓶', '239005199304181562', '', '63001172220105237511', '6399955Q118030366582', '20201118', NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `loan_main` VALUES (43, 'S1310900001559', '63010111009139358701', 'K1310900002513', '刘元珠', '632721198103130525', 'P30101020001', '商贷通-抵质押', '', 6.65, 4.75, '', 60, '2016/2/23', '2021/2/23', 42000.00, 3253.75, '', '刘元珠', '6221888500007221361', 4, '20110857800', '6399960Q', '陈龙', '239005199304181562', '中国邮政储蓄银行股份有限公司青海省海东市支行', '6399960Q214093650262', '6399955Q118030366582', '20201118', NULL, NULL, NULL, NULL, NULL, 0);

INSERT INTO `ruoyi`.`sys_menu`(`menu_id`, `menu_name`, `parent_id`, `order_num`, `url`, `target`, `menu_type`, `visible`, `perms`, `icon`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (7, '信贷数据配置', 0, 4, '#', '', 'M', '0', '', 'fa fa-bars', 'admin', '2020-11-09 15:58:07', '', NULL, '信贷信息设置');
INSERT INTO `ruoyi`.`sys_menu`(`menu_id`, `menu_name`, `parent_id`, `order_num`, `url`, `target`, `menu_type`, `visible`, `perms`, `icon`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (8, '信贷管理数据', 0, 5, '#', '', 'M', '0', '', 'fa fa-bars', 'admin', '2020-11-09 15:58:07', '', NULL, '信贷管理数据');
INSERT INTO `ruoyi`.`sys_menu`(`menu_id`, `menu_name`, `parent_id`, `order_num`, `url`, `target`, `menu_type`, `visible`, `perms`, `icon`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (1062, '信贷固定金额奖励设置', 7, 1, '/credit/reward/config', '', 'C', '0', 'tool:gen:code', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `ruoyi`.`sys_menu`(`menu_id`, `menu_name`, `parent_id`, `order_num`, `url`, `target`, `menu_type`, `visible`, `perms`, `icon`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (1063, '信贷信息管理', 8, 1, '/credit/loanMain', '', 'C', '0', 'tool:gen:code', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `ruoyi`.`sys_menu`(`menu_id`, `menu_name`, `parent_id`, `order_num`, `url`, `target`, `menu_type`, `visible`, `perms`, `icon`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (1064, '奖励发放记录', 8, 2, '/credit/reward/log', '', 'C', '0', 'tool:gen:code', '#', 'admin', '2020-11-20 11:41:12', '', NULL, '');
INSERT INTO `ruoyi`.`sys_menu`(`menu_id`, `menu_name`, `parent_id`, `order_num`, `url`, `target`, `menu_type`, `visible`, `perms`, `icon`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (1065, '问责记录', 8, 3, '/credit/accountability', '', 'C', '0', 'tool:gen:code', '#', 'admin', '2020-11-20 11:41:12', '', NULL, '');
INSERT INTO `ruoyi`.`sys_menu`(`menu_id`, `menu_name`, `parent_id`, `order_num`, `url`, `target`, `menu_type`, `visible`, `perms`, `icon`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (1066, '异常数据记录', 8, 4, 'credit/notice', '', 'C', '0', 'tool:gen:code', '#', 'admin', '2020-11-20 11:41:12', '', NULL, '');

INSERT INTO `ruoyi`.`sys_dict_type`(`dict_id`, `dict_name`, `dict_type`, `status`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (100, '问责原因', 'loan_accountability_type', '0', 'admin', '2020-12-03 15:53:23', 'admin', '2020-12-03 16:01:16', '问责原因类型');
INSERT INTO `ruoyi`.`sys_dict_type`(`dict_id`, `dict_name`, `dict_type`, `status`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (101, '问责状态', 'loan_accountability_state', '0', 'admin', '2020-12-03 16:01:04', 'admin', '2020-12-03 16:29:29', '问责是否生效,默认生效');
INSERT INTO `ruoyi`.`sys_dict_type`(`dict_id`, `dict_name`, `dict_type`, `status`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (102, '信贷五级分类', 'loan_state', '0', 'admin', '2020-12-03 16:22:26', 'admin', '2020-12-03 16:28:27', '状态');
INSERT INTO `ruoyi`.`sys_dict_type`(`dict_id`, `dict_name`, `dict_type`, `status`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (103, '免责原因', 'loan_exemption_type', '0', 'admin', '2020-12-03 16:58:17', '', NULL, '免责原因');
INSERT INTO `ruoyi`.`sys_dict_type`(`dict_id`, `dict_name`, `dict_type`, `status`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (104, '贷款种类', 'loan_credit_type', '0', 'admin', '2020-12-09 08:47:20', '', NULL, NULL);

INSERT INTO `ruoyi`.`sys_dict_data`(`dict_code`, `dict_sort`, `dict_label`, `dict_value`, `dict_type`, `css_class`, `list_class`, `is_default`, `status`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (100, 1, '关注', '0', 'loan_accountability_type', '', '', 'Y', '0', 'admin', '2020-12-03 15:55:10', 'admin', '2020-12-03 16:19:51', '');
INSERT INTO `ruoyi`.`sys_dict_data`(`dict_code`, `dict_sort`, `dict_label`, `dict_value`, `dict_type`, `css_class`, `list_class`, `is_default`, `status`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (101, 2, '可疑', '1', 'loan_accountability_type', '', '', 'Y', '0', 'admin', '2020-12-03 15:55:31', 'admin', '2020-12-03 16:20:06', '');
INSERT INTO `ruoyi`.`sys_dict_data`(`dict_code`, `dict_sort`, `dict_label`, `dict_value`, `dict_type`, `css_class`, `list_class`, `is_default`, `status`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (102, 3, '损失', '2', 'loan_accountability_type', '', '', 'Y', '0', 'admin', '2020-12-03 15:56:01', 'admin', '2020-12-03 16:20:14', '');
INSERT INTO `ruoyi`.`sys_dict_data`(`dict_code`, `dict_sort`, `dict_label`, `dict_value`, `dict_type`, `css_class`, `list_class`, `is_default`, `status`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (103, 1, '生效', '0', 'loan_accountability_state', NULL, NULL, 'Y', '0', 'admin', '2020-12-03 16:02:10', '', NULL, NULL);
INSERT INTO `ruoyi`.`sys_dict_data`(`dict_code`, `dict_sort`, `dict_label`, `dict_value`, `dict_type`, `css_class`, `list_class`, `is_default`, `status`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (104, 2, '失效', '1', 'loan_accountability_state', NULL, NULL, 'Y', '0', 'admin', '2020-12-03 16:02:28', '', NULL, NULL);
INSERT INTO `ruoyi`.`sys_dict_data`(`dict_code`, `dict_sort`, `dict_label`, `dict_value`, `dict_type`, `css_class`, `list_class`, `is_default`, `status`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (105, 1, '正常', '0', 'loan_state', '', 'info', 'Y', '0', 'admin', '2020-12-03 16:23:30', 'admin', '2020-12-03 16:39:00', '');
INSERT INTO `ruoyi`.`sys_dict_data`(`dict_code`, `dict_sort`, `dict_label`, `dict_value`, `dict_type`, `css_class`, `list_class`, `is_default`, `status`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (106, 2, '次级', '1', 'loan_state', '', 'info', 'Y', '0', 'admin', '2020-12-03 16:23:40', 'admin', '2020-12-03 16:39:07', '');
INSERT INTO `ruoyi`.`sys_dict_data`(`dict_code`, `dict_sort`, `dict_label`, `dict_value`, `dict_type`, `css_class`, `list_class`, `is_default`, `status`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (107, 3, '关注', '2', 'loan_state', '', 'warning', 'Y', '0', 'admin', '2020-12-03 16:23:57', 'admin', '2020-12-03 16:39:13', '');
INSERT INTO `ruoyi`.`sys_dict_data`(`dict_code`, `dict_sort`, `dict_label`, `dict_value`, `dict_type`, `css_class`, `list_class`, `is_default`, `status`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (108, 4, '可疑', '3', 'loan_state', '', 'warning', 'Y', '0', 'admin', '2020-12-03 16:24:05', 'admin', '2020-12-03 16:39:21', '');
INSERT INTO `ruoyi`.`sys_dict_data`(`dict_code`, `dict_sort`, `dict_label`, `dict_value`, `dict_type`, `css_class`, `list_class`, `is_default`, `status`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (109, 5, '损失', '4', 'loan_state', '', 'danger', 'Y', '0', 'admin', '2020-12-03 16:24:12', 'admin', '2020-12-03 16:39:26', '');
INSERT INTO `ruoyi`.`sys_dict_data`(`dict_code`, `dict_sort`, `dict_label`, `dict_value`, `dict_type`, `css_class`, `list_class`, `is_default`, `status`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (111, 1, '尽职免责', '0', 'loan_exemption_type', NULL, NULL, 'Y', '0', 'admin', '2020-12-03 16:58:46', '', NULL, NULL);
INSERT INTO `ruoyi`.`sys_dict_data`(`dict_code`, `dict_sort`, `dict_label`, `dict_value`, `dict_type`, `css_class`, `list_class`, `is_default`, `status`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (112, 2, '客观因素', '1', 'loan_exemption_type', NULL, NULL, 'Y', '0', 'admin', '2020-12-03 16:59:02', '', NULL, NULL);
INSERT INTO `ruoyi`.`sys_dict_data`(`dict_code`, `dict_sort`, `dict_label`, `dict_value`, `dict_type`, `css_class`, `list_class`, `is_default`, `status`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (113, 1, '消费贷款', '0', 'loan_credit_type', NULL, NULL, 'Y', '0', 'admin', '2020-12-09 08:47:52', '', NULL, NULL);
INSERT INTO `ruoyi`.`sys_dict_data`(`dict_code`, `dict_sort`, `dict_label`, `dict_value`, `dict_type`, `css_class`, `list_class`, `is_default`, `status`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (114, 2, '经营贷款', '1', 'loan_credit_type', NULL, NULL, 'Y', '0', 'admin', '2020-12-09 08:48:09', '', NULL, NULL);
INSERT INTO `ruoyi`.`sys_dict_data`(`dict_code`, `dict_sort`, `dict_label`, `dict_value`, `dict_type`, `css_class`, `list_class`, `is_default`, `status`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (115, 3, '小企业贷款', '2', 'loan_credit_type', NULL, NULL, 'Y', '0', 'admin', '2020-12-09 08:48:24', '', NULL, NULL);
INSERT INTO `ruoyi`.`sys_dict_data`(`dict_code`, `dict_sort`, `dict_label`, `dict_value`, `dict_type`, `css_class`, `list_class`, `is_default`, `status`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (116, 4, '公司贷款', '3', 'loan_credit_type', NULL, NULL, 'Y', '0', 'admin', '2020-12-09 08:48:40', '', NULL, NULL);

DROP TABLE IF EXISTS `loan_main_ext`;
CREATE TABLE `loan_main_ext`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `load_rct_id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '借据号',
  `reward_amount` decimal(8, 2) NULL DEFAULT NULL COMMENT '奖励金额',
  `grant_times` tinyint(3) NULL DEFAULT NULL COMMENT '发放期数',
  `issued` tinyint(3) NULL DEFAULT NULL COMMENT '已发放期数',
  `next_grant_date` datetime(0) NULL DEFAULT NULL COMMENT '下次发放时间',
  `create_by` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间-应用操作时间',
  `server_ip` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '服务器IP',
  `update_by` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `update_time` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间',
  `del_flag` tinyint(2) NOT NULL DEFAULT 0 COMMENT '是否逻辑删除:默认0未删除;1已删除',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `load_rct_id`(`load_rct_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '信贷记录扩展表' ROW_FORMAT = Dynamic;

DROP TABLE IF EXISTS `loan_reward_config`;
CREATE TABLE `loan_reward_config`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `dept_id` bigint(20) NULL DEFAULT NULL COMMENT '部门id',
  `parent_id` bigint(20) NULL DEFAULT 0 COMMENT '父部门id',
  `dept_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '部门名称',
  `user_id` bigint(20) NULL DEFAULT NULL COMMENT '用户ID',
  `user_name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '用户昵称',
  `reward_amount` decimal(8, 2) NULL DEFAULT NULL COMMENT '奖励金额',
  `loan_type` tinyint(2) NULL DEFAULT NULL COMMENT '贷种',
  `create_by` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间-应用操作时间',
  `server_ip` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '服务器IP',
  `update_by` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `update_time` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间',
  `del_flag` tinyint(2) NOT NULL DEFAULT 0 COMMENT '是否逻辑删除:默认0未删除;1已删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of loan_reward_config
-- ----------------------------
INSERT INTO `loan_reward_config` VALUES (2, 103, 101, NULL, NULL, NULL, 22.00, 3, 'admin', '2020-12-10 17:13:04', '127.0.0.1', 'admin', NULL, 1);
INSERT INTO `loan_reward_config` VALUES (3, 103, 101, NULL, NULL, NULL, 11.00, 2, 'admin', '2020-12-10 17:13:08', '127.0.0.1', 'admin', NULL, 1);
INSERT INTO `loan_reward_config` VALUES (4, 103, 101, '研发部门', NULL, NULL, 45.00, 0, 'admin', '2020-12-10 17:04:25', '127.0.0.1', NULL, NULL, 0);
INSERT INTO `loan_reward_config` VALUES (5, 101, 100, '省分行', NULL, NULL, 12.00, 1, 'admin', '2020-12-10 17:13:22', '127.0.0.1', NULL, NULL, 0);

DROP TABLE IF EXISTS `loan_accountability`;
CREATE TABLE `loan_accountability`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `load_rct_id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '借据号',
  `accountability_type` tinyint(2) NULL DEFAULT NULL COMMENT '问责原因',
  `remark` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '问责备注',
  `accountability_state` tinyint(2) NULL DEFAULT NULL COMMENT '问责状态',
  `create_by` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间-应用操作时间',
  `server_ip` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '服务器IP',
  `update_by` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `update_time` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间',
  `del_flag` tinyint(2) NOT NULL DEFAULT 0 COMMENT '是否逻辑删除:默认0未删除;1已删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '信贷问责记录表' ROW_FORMAT = Dynamic;

DROP TABLE IF EXISTS `loan_exemption`;
CREATE TABLE `loan_exemption`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `load_rct_id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '借据号',
  `exemption_type` tinyint(2) NULL DEFAULT NULL COMMENT '免责原因',
  `remark` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '免责备注',
  `create_by` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间-应用操作时间',
  `server_ip` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '服务器IP',
  `update_by` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `update_time` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间',
  `del_flag` tinyint(2) NOT NULL DEFAULT 0 COMMENT '是否逻辑删除:默认0未删除;1已删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '信贷免责记录表' ROW_FORMAT = Dynamic;

DROP TABLE IF EXISTS `loan_reward_log`;
CREATE TABLE `loan_reward_log`  (
  `id` bigint(20) NOT NULL,
  `load_rct_id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '借据号',
  `num` tinyint(3) NULL DEFAULT NULL COMMENT '奖励第几期',
  `create_by` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间-应用操作时间',
  `server_ip` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '服务器IP',
  `update_by` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `update_time` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间',
  `del_flag` tinyint(2) NOT NULL DEFAULT 0 COMMENT '是否逻辑删除:默认0未删除;1已删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '信贷奖励发放记录表' ROW_FORMAT = Dynamic;

DROP TABLE IF EXISTS `loan_notice`;
CREATE TABLE `loan_notice`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `load_rct_id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '借据号',
  `notice_type` tinyint(3) NULL DEFAULT NULL COMMENT '提醒类型',
  `notice_reason` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '提醒原因',
  `is_handle` tinyint(2) NULL DEFAULT NULL COMMENT '是否处理',
  `create_by` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间-应用操作时间',
  `server_ip` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '服务器IP',
  `update_by` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `update_time` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间',
  `del_flag` tinyint(2) NOT NULL DEFAULT 0 COMMENT '是否逻辑删除:默认0未删除;1已删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '信贷提醒记录表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;


