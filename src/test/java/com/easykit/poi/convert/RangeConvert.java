package com.easykit.poi.convert;

/**
 * 生成下拉框数据
 */
public class RangeConvert implements ExportRange {

    @Override
    public String[] handler() {
        String[] testRangeData = {"a","b","c"};
        return testRangeData;
    }
}
