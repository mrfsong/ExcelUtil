package com.easykit.poi;

import com.easykit.poi.core.CharUtil;

import java.io.File;
import java.io.FileNotFoundException;

public class Demo {
    private static final String CHINESE_CHAR_REGEIX = "[\\u4e00-\\u9fa5]+";

    public static void main(String[] args) throws FileNotFoundException {
        /*File excelFile = new File("D:/testUserData.xlsx");

        // 生成到本地
        new Example4Builder().builder(excelFile);

        // 将本地Excel文件读取并解析入库
        new Example4Import().importExcel(excelFile);*/

        String temp = "123456";
        System.out.println(CharUtil.isChinese(temp));
        temp = "你好";
        System.out.println(CharUtil.isChinese(temp));
        temp = "，JAVA";
        System.out.println(CharUtil.isChinese(temp));


    }
}
