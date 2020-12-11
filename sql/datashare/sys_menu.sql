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

 Date: 10/12/2020 08:52:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu`  (
  `menu_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '菜单ID',
  `menu_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '菜单名称',
  `parent_id` bigint(20) NULL DEFAULT 0 COMMENT '父菜单ID',
  `order_num` int(4) NULL DEFAULT 0 COMMENT '显示顺序',
  `url` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '#' COMMENT '请求地址',
  `target` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '打开方式（menuItem页签 menuBlank新窗口）',
  `menu_type` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '菜单类型（M目录 C菜单 F按钮）',
  `visible` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '菜单状态（0显示 1隐藏）',
  `perms` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '权限标识',
  `icon` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '#' COMMENT '菜单图标',
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`menu_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 60302 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '菜单权限表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES (1, '系统管理', 0, 1, '#', '', 'M', '0', '', 'fa fa-gear', 'admin', '2020-11-09 15:58:07', '', NULL, '系统管理目录');
INSERT INTO `sys_menu` VALUES (2, '系统监控', 0, 2, '#', '', 'M', '0', '', 'fa fa-video-camera', 'admin', '2020-11-09 15:58:07', '', NULL, '系统监控目录');
INSERT INTO `sys_menu` VALUES (3, '系统工具', 0, 3, '#', '', 'M', '0', '', 'fa fa-bars', 'admin', '2020-11-09 15:58:07', '', NULL, '系统工具目录');
INSERT INTO `sys_menu` VALUES (4, 'KPI报表', 0, 4, '#', '', 'M', '0', '', 'fa fa-bars', 'admin', '2020-11-09 15:58:07', '', NULL, 'KPI报表目录');
INSERT INTO `sys_menu` VALUES (5, '市场占有率报表', 0, 5, '#', '', 'M', '0', '', 'fa fa-bars', 'admin', '2020-11-09 15:58:07', '', NULL, '市场占有率报表目录');
INSERT INTO `sys_menu` VALUES (6, '银监局共享数据', 0, 6, '#', '', 'M', '0', '', 'fa fa-bars', 'admin', '2020-11-09 15:58:07', '', NULL, '银监局共享数据');
INSERT INTO `sys_menu` VALUES (100, '用户管理', 1, 1, '/system/user', '', 'C', '0', 'system:user:view', 'fa fa-user-o', 'admin', '2020-11-09 15:58:07', '', NULL, '用户管理菜单');
INSERT INTO `sys_menu` VALUES (101, '角色管理', 1, 2, '/system/role', '', 'C', '0', 'system:role:view', 'fa fa-user-secret', 'admin', '2020-11-09 15:58:07', '', NULL, '角色管理菜单');
INSERT INTO `sys_menu` VALUES (102, '菜单管理', 1, 3, '/system/menu', '', 'C', '0', 'system:menu:view', 'fa fa-th-list', 'admin', '2020-11-09 15:58:07', '', NULL, '菜单管理菜单');
INSERT INTO `sys_menu` VALUES (103, '部门管理', 1, 4, '/system/dept', '', 'C', '0', 'system:dept:view', 'fa fa-outdent', 'admin', '2020-11-09 15:58:07', '', NULL, '部门管理菜单');
INSERT INTO `sys_menu` VALUES (104, '岗位管理', 1, 5, '/system/post', '', 'C', '0', 'system:post:view', 'fa fa-address-card-o', 'admin', '2020-11-09 15:58:07', '', NULL, '岗位管理菜单');
INSERT INTO `sys_menu` VALUES (105, '字典管理', 1, 6, '/system/dict', '', 'C', '0', 'system:dict:view', 'fa fa-bookmark-o', 'admin', '2020-11-09 15:58:07', '', NULL, '字典管理菜单');
INSERT INTO `sys_menu` VALUES (106, '参数设置', 1, 7, '/system/config', '', 'C', '0', 'system:config:view', 'fa fa-sun-o', 'admin', '2020-11-09 15:58:07', '', NULL, '参数设置菜单');
INSERT INTO `sys_menu` VALUES (107, '通知公告', 1, 8, '/system/notice', '', 'C', '0', 'system:notice:view', 'fa fa-bullhorn', 'admin', '2020-11-09 15:58:07', '', NULL, '通知公告菜单');
INSERT INTO `sys_menu` VALUES (108, '日志管理', 1, 9, '#', '', 'M', '0', '', 'fa fa-pencil-square-o', 'admin', '2020-11-09 15:58:07', '', NULL, '日志管理菜单');
INSERT INTO `sys_menu` VALUES (109, '在线用户', 2, 1, '/monitor/online', '', 'C', '0', 'monitor:online:view', 'fa fa-user-circle', 'admin', '2020-11-09 15:58:07', '', NULL, '在线用户菜单');
INSERT INTO `sys_menu` VALUES (110, '定时任务', 2, 2, '/monitor/job', '', 'C', '0', 'monitor:job:view', 'fa fa-tasks', 'admin', '2020-11-09 15:58:07', '', NULL, '定时任务菜单');
INSERT INTO `sys_menu` VALUES (111, '数据监控', 2, 3, '/monitor/data', '', 'C', '0', 'monitor:data:view', 'fa fa-bug', 'admin', '2020-11-09 15:58:07', '', NULL, '数据监控菜单');
INSERT INTO `sys_menu` VALUES (112, '服务监控', 2, 3, '/monitor/server', '', 'C', '0', 'monitor:server:view', 'fa fa-server', 'admin', '2020-11-09 15:58:07', '', NULL, '服务监控菜单');
INSERT INTO `sys_menu` VALUES (113, '表单构建', 3, 1, '/tool/build', '', 'C', '0', 'tool:build:view', 'fa fa-wpforms', 'admin', '2020-11-09 15:58:07', '', NULL, '表单构建菜单');
INSERT INTO `sys_menu` VALUES (114, '代码生成', 3, 2, '/tool/gen', '', 'C', '0', 'tool:gen:view', 'fa fa-code', 'admin', '2020-11-09 15:58:07', '', NULL, '代码生成菜单');
INSERT INTO `sys_menu` VALUES (115, '系统接口', 3, 3, '/tool/swagger', '', 'C', '0', 'tool:swagger:view', 'fa fa-gg', 'admin', '2020-11-09 15:58:07', '', NULL, '系统接口菜单');
INSERT INTO `sys_menu` VALUES (401, '全行KPI指标（一）', 4, 1, '/datashare/kpi/incomeshow', '', 'C', '0', 'datashare/kpi:incomeshow:view', '#', 'admin', '2020-11-18 11:34:20', '', NULL, '全行KPI指标（一）菜单');
INSERT INTO `sys_menu` VALUES (402, '全行KPI指标（二）', 4, 2, '/datashare/kpi/credit', '', 'C', '0', 'datashare/kpi:credit:view', '#', 'admin', '2020-11-25 09:25:41', '', NULL, '全行KPI指标（二）菜单');
INSERT INTO `sys_menu` VALUES (403, '全行资产业务情况表', 4, 4, '/datashare/kpi/assetbusiness', '', 'C', '0', 'datashare/kpi:assetbusiness:view', '#', 'admin', '2020-11-25 09:25:55', '', NULL, '全行资产业务情况表菜单');
INSERT INTO `sys_menu` VALUES (404, 'KPI指标（二）-附表', 4, 3, '/datashare/kpi/credit_schedule', 'menuItem', 'C', '1', 'datashare/kpi:credit_schedule:view', '#', 'admin', '2020-11-25 09:25:47', 'admin', '2020-11-26 15:48:16', '全行KPI指标（二）-附表菜单');
INSERT INTO `sys_menu` VALUES (405, '资产业务情况-附表', 4, 5, '/datashare/kpi/assetbusiness_schedule', 'menuItem', 'C', '1', 'datashare/kpi:assetbusiness_schedule:view', '#', 'admin', '2020-11-25 09:26:01', 'admin', '2020-11-26 15:48:27', '全行资产业务情况-附表菜单');
INSERT INTO `sys_menu` VALUES (500, '操作日志', 108, 1, '/monitor/operlog', '', 'C', '0', 'monitor:operlog:view', 'fa fa-address-book', 'admin', '2020-11-09 15:58:07', '', NULL, '操作日志菜单');
INSERT INTO `sys_menu` VALUES (501, '登录日志', 108, 2, '/monitor/logininfor', '', 'C', '0', 'monitor:logininfor:view', 'fa fa-file-image-o', 'admin', '2020-11-09 15:58:07', '', NULL, '登录日志菜单');
INSERT INTO `sys_menu` VALUES (601, '主要监管指标汇总', 6, 1, '/datashare/cbrc/major_regulatory_indicators', '', 'C', '0', 'datashare/cbrc:major_regulatory_indicators:view', '#', 'admin', '2020-12-09 16:04:46', '', NULL, '主要监管指标汇总菜单');
INSERT INTO `sys_menu` VALUES (602, '银行业机构资产负债主要项目统计', 6, 2, '/datashare/cbrc/assets_liabilities_projects', '', 'C', '0', 'datashare/cbrc:assets_liabilities_projects:view', '#', 'admin', '2020-12-09 16:05:06', '', NULL, '银行业机构资产负债主要项目统计菜单');
INSERT INTO `sys_menu` VALUES (603, '金融机构资产负债主要指标', 6, 3, '/datashare/cbrc/assets_liabilities_indicators', '', 'C', '0', 'datashare/cbrc:assets_liabilities_indicators:view', '#', 'admin', '2020-12-09 16:04:57', '', NULL, '金融机构资产负债主要指标菜单');
INSERT INTO `sys_menu` VALUES (1000, '用户查询', 100, 1, '#', '', 'F', '0', 'system:user:list', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1001, '用户新增', 100, 2, '#', '', 'F', '0', 'system:user:add', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1002, '用户修改', 100, 3, '#', '', 'F', '0', 'system:user:edit', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1003, '用户删除', 100, 4, '#', '', 'F', '0', 'system:user:remove', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1004, '用户导出', 100, 5, '#', '', 'F', '0', 'system:user:export', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1005, '用户导入', 100, 6, '#', '', 'F', '0', 'system:user:import', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1006, '重置密码', 100, 7, '#', '', 'F', '0', 'system:user:resetPwd', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1007, '角色查询', 101, 1, '#', '', 'F', '0', 'system:role:list', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1008, '角色新增', 101, 2, '#', '', 'F', '0', 'system:role:add', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1009, '角色修改', 101, 3, '#', '', 'F', '0', 'system:role:edit', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1010, '角色删除', 101, 4, '#', '', 'F', '0', 'system:role:remove', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1011, '角色导出', 101, 5, '#', '', 'F', '0', 'system:role:export', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1012, '菜单查询', 102, 1, '#', '', 'F', '0', 'system:menu:list', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1013, '菜单新增', 102, 2, '#', '', 'F', '0', 'system:menu:add', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1014, '菜单修改', 102, 3, '#', '', 'F', '0', 'system:menu:edit', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1015, '菜单删除', 102, 4, '#', '', 'F', '0', 'system:menu:remove', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1016, '部门查询', 103, 1, '#', '', 'F', '0', 'system:dept:list', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1017, '部门新增', 103, 2, '#', '', 'F', '0', 'system:dept:add', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1018, '部门修改', 103, 3, '#', '', 'F', '0', 'system:dept:edit', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1019, '部门删除', 103, 4, '#', '', 'F', '0', 'system:dept:remove', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1020, '岗位查询', 104, 1, '#', '', 'F', '0', 'system:post:list', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1021, '岗位新增', 104, 2, '#', '', 'F', '0', 'system:post:add', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1022, '岗位修改', 104, 3, '#', '', 'F', '0', 'system:post:edit', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1023, '岗位删除', 104, 4, '#', '', 'F', '0', 'system:post:remove', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1024, '岗位导出', 104, 5, '#', '', 'F', '0', 'system:post:export', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1025, '字典查询', 105, 1, '#', '', 'F', '0', 'system:dict:list', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1026, '字典新增', 105, 2, '#', '', 'F', '0', 'system:dict:add', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1027, '字典修改', 105, 3, '#', '', 'F', '0', 'system:dict:edit', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1028, '字典删除', 105, 4, '#', '', 'F', '0', 'system:dict:remove', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1029, '字典导出', 105, 5, '#', '', 'F', '0', 'system:dict:export', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1030, '参数查询', 106, 1, '#', '', 'F', '0', 'system:config:list', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1031, '参数新增', 106, 2, '#', '', 'F', '0', 'system:config:add', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1032, '参数修改', 106, 3, '#', '', 'F', '0', 'system:config:edit', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1033, '参数删除', 106, 4, '#', '', 'F', '0', 'system:config:remove', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1034, '参数导出', 106, 5, '#', '', 'F', '0', 'system:config:export', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1035, '公告查询', 107, 1, '#', '', 'F', '0', 'system:notice:list', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1036, '公告新增', 107, 2, '#', '', 'F', '0', 'system:notice:add', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1037, '公告修改', 107, 3, '#', '', 'F', '0', 'system:notice:edit', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1038, '公告删除', 107, 4, '#', '', 'F', '0', 'system:notice:remove', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1039, '操作查询', 500, 1, '#', '', 'F', '0', 'monitor:operlog:list', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1040, '操作删除', 500, 2, '#', '', 'F', '0', 'monitor:operlog:remove', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1041, '详细信息', 500, 3, '#', '', 'F', '0', 'monitor:operlog:detail', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1042, '日志导出', 500, 4, '#', '', 'F', '0', 'monitor:operlog:export', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1043, '登录查询', 501, 1, '#', '', 'F', '0', 'monitor:logininfor:list', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1044, '登录删除', 501, 2, '#', '', 'F', '0', 'monitor:logininfor:remove', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1045, '日志导出', 501, 3, '#', '', 'F', '0', 'monitor:logininfor:export', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1046, '账户解锁', 501, 4, '#', '', 'F', '0', 'monitor:logininfor:unlock', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1047, '在线查询', 109, 1, '#', '', 'F', '0', 'monitor:online:list', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1048, '批量强退', 109, 2, '#', '', 'F', '0', 'monitor:online:batchForceLogout', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1049, '单条强退', 109, 3, '#', '', 'F', '0', 'monitor:online:forceLogout', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1050, '任务查询', 110, 1, '#', '', 'F', '0', 'monitor:job:list', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1051, '任务新增', 110, 2, '#', '', 'F', '0', 'monitor:job:add', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1052, '任务修改', 110, 3, '#', '', 'F', '0', 'monitor:job:edit', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1053, '任务删除', 110, 4, '#', '', 'F', '0', 'monitor:job:remove', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1054, '状态修改', 110, 5, '#', '', 'F', '0', 'monitor:job:changeStatus', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1055, '任务详细', 110, 6, '#', '', 'F', '0', 'monitor:job:detail', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1056, '任务导出', 110, 7, '#', '', 'F', '0', 'monitor:job:export', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1057, '生成查询', 114, 1, '#', '', 'F', '0', 'tool:gen:list', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1058, '生成修改', 114, 2, '#', '', 'F', '0', 'tool:gen:edit', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1059, '生成删除', 114, 3, '#', '', 'F', '0', 'tool:gen:remove', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1060, '预览代码', 114, 4, '#', '', 'F', '0', 'tool:gen:preview', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (1061, '生成代码', 114, 5, '#', '', 'F', '0', 'tool:gen:code', '#', 'admin', '2020-11-09 15:58:07', '', NULL, '');
INSERT INTO `sys_menu` VALUES (40101, '全行KPI指标（一）查询', 401, 1, '#', '', 'F', '0', 'datashare/kpi:incomeshow:list', '#', 'admin', '2020-11-18 11:34:20', '', NULL, '');
INSERT INTO `sys_menu` VALUES (40104, '全行KPI指标（一）导入', 401, 2, '#', '', 'F', '0', 'datashare/kpi:incomeshow:import', '#', 'admin', '2020-11-18 11:34:20', '', NULL, '');
INSERT INTO `sys_menu` VALUES (40105, '全行KPI指标（一）导出', 401, 3, '#', '', 'F', '0', 'datashare/kpi:incomeshow:export', '#', 'admin', '2020-11-18 11:34:20', '', NULL, '');
INSERT INTO `sys_menu` VALUES (40201, '全行KPI指标（二）查询', 402, 1, '#', '', 'F', '0', 'datashare/kpi:credit:list', '#', 'admin', '2020-11-25 09:25:41', '', NULL, '');
INSERT INTO `sys_menu` VALUES (40203, '全行KPI指标（二）修改', 402, 1, '#', '', 'F', '0', 'datashare/kpi:credit:edit', '#', 'admin', '2020-11-25 09:25:41', '', NULL, '');
INSERT INTO `sys_menu` VALUES (40204, '全行KPI指标（二）导入KPI源数据', 402, 4, '#', 'menuItem', 'F', '0', 'datashare/kpi:credit:import', '#', 'admin', '2020-11-25 09:25:41', 'admin', '2020-11-26 15:53:29', '');
INSERT INTO `sys_menu` VALUES (40205, '全行KPI指标（二）导出', 402, 5, '#', '', 'F', '0', 'datashare/kpi:credit:export', '#', 'admin', '2020-11-25 09:25:41', '', NULL, '');
INSERT INTO `sys_menu` VALUES (40301, '全行资产业务情况表 查询', 403, 1, '#', '', 'F', '0', 'datashare/kpi:assetbusiness:list', '#', 'admin', '2020-11-25 09:25:55', '', NULL, '');
INSERT INTO `sys_menu` VALUES (40303, '全行资产业务情况表 修改', 403, 5, '#', '', 'F', '0', 'datashare/kpi:assetbusiness:edit', '#', 'admin', '2020-11-25 09:25:55', '', NULL, '');
INSERT INTO `sys_menu` VALUES (40305, '全行资产业务情况表 导出', 403, 5, '#', '', 'F', '0', 'datashare/kpi:assetbusiness:export', '#', 'admin', '2020-11-25 09:25:55', '', NULL, '');
INSERT INTO `sys_menu` VALUES (40401, '全行KPI指标（二）-附表查询', 404, 1, '#', '', 'F', '0', 'datashare/kpi:credit_schedule:list', '#', 'admin', '2020-11-25 09:25:47', '', NULL, '');
INSERT INTO `sys_menu` VALUES (40405, '全行KPI指标（二）-附表导出', 404, 5, '#', '', 'F', '0', 'datashare/kpi:credit_schedule:export', '#', 'admin', '2020-11-25 09:25:47', '', NULL, '');
INSERT INTO `sys_menu` VALUES (40501, '全行资产业务情况-附表查询', 405, 1, '#', '', 'F', '0', 'datashare/kpi:assetbusiness_schedule:list', '#', 'admin', '2020-11-25 09:26:01', '', NULL, '');
INSERT INTO `sys_menu` VALUES (40505, '全行资产业务情况-附表导出', 405, 5, '#', '', 'F', '0', 'datashare/kpi:assetbusiness_schedule:export', '#', 'admin', '2020-11-25 09:26:01', '', NULL, '');
INSERT INTO `sys_menu` VALUES (60101, '主要监管指标汇总查询', 601, 1, '#', '', 'F', '0', 'datashare/cbrc:major_regulatory_indicators:list', '#', 'admin', '2020-12-09 16:04:46', '', NULL, '');
INSERT INTO `sys_menu` VALUES (60106, '银监局共享数据导入', 601, 1, '#', '', 'F', '0', 'datashare/cbrc:major_regulatory_indicators:import', '#', 'admin', '2020-12-09 16:04:46', '', NULL, '');
INSERT INTO `sys_menu` VALUES (60201, '银行业机构资产负债主要项目统计查询', 602, 1, '#', '', 'F', '0', 'datashare/cbrc:assets_liabilities_projects:list', '#', 'admin', '2020-12-09 16:05:06', '', NULL, '');
INSERT INTO `sys_menu` VALUES (60301, '金融机构资产负债主要指标查询', 603, 1, '#', '', 'F', '0', 'datashare/cbrc:assets_liabilities_indicators:list', '#', 'admin', '2020-12-09 16:04:57', '', NULL, '');

SET FOREIGN_KEY_CHECKS = 1;
