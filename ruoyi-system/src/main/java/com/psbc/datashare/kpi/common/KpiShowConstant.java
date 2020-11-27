package com.psbc.datashare.kpi.common;

import java.util.LinkedList;
import java.util.List;

/**
 * @author mql
 * @date 2020/11/26
 */
public class KpiShowConstant {

    /**
     * kpi 相关地区定义
     */
    public static final String DISTRICT_QUAN_SHENG = "全省";
    public static final String DISTRICT_BEN_BU = "本部";
    public static final String DISTRICT_JI_GUAN = "机关";
    public static final String DISTRICT_CHENG_XI = "城西";
    public static final String DISTRICT_DA_TONG = "大通";
    public static final String DISTRICT_HAI_DONG = "海东";
    public static final String DISTRICT_CHENG_ZHONG = "城中";
    public static final String DISTRICT_HAI_NAN = "海南";
    public static final String DISTRICT_YU_SHU = "玉树";
    public static final String DISTRICT_HAI_XI = "海西";
    public static final String DISTRICT_HAI_BEI = "海北";
    public static final String DISTRICT_HUANG_NAN = "黄南";
    public static final String DISTRICT_GUO_LUO = "果洛";
    public static final String DISTRICT_GE_ER_MU = "格尔木";
    public static final String DISTRICT_YING_YI_BU = "营业部";

    /**
     * 全行资产业务情况表主表显示的地区列表(按顺序)
     */
    public static final LinkedList<String> DISTRICT_LIST_ASSET_BUSINESS = new LinkedList<String>(){{
        add(DISTRICT_QUAN_SHENG);
        add(DISTRICT_CHENG_XI);
        add(DISTRICT_CHENG_ZHONG);
        add(DISTRICT_DA_TONG);
        add(DISTRICT_HAI_DONG);
        add(DISTRICT_HAI_XI);
        add(DISTRICT_GE_ER_MU);
        add(DISTRICT_HAI_NAN);
        add(DISTRICT_HAI_BEI);
        add(DISTRICT_HUANG_NAN);
        add(DISTRICT_GUO_LUO);
        add(DISTRICT_YU_SHU);
        add(DISTRICT_YING_YI_BU);
    }};
}
