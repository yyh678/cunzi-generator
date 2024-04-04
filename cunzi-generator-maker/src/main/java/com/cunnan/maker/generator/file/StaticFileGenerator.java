package com.cunnan.maker.generator.file;

import cn.hutool.core.io.FileUtil;


/**
 * @author CunNan
 * @Description 静态生成器
 */
public class StaticFileGenerator {

    /**
     * 使用Hutool工具类复制文件
     * @param inputPath 输入文件路径
     * @param outputPath 输出文件路径
     */
    public static void copyFilesByHutool(String inputPath,String outputPath){
        FileUtil.copy(inputPath, outputPath, false);
    }
}
