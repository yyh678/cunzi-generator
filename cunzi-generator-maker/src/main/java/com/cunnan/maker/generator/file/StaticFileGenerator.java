package com.cunnan.maker.generator.file;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ArrayUtil;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

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
