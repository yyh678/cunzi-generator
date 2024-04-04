package com.cunnan.maker.generator.file;

import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * @author CunNan
 * @Description
 */
public class FileGenerator {

    public static void doGenerate(Object model) throws TemplateException, IOException {
        //
        String projectPath = System.getProperty("user.dir");
        // 整个项目的根路径
        //File parentFile = new File(projectPath).getParentFile();
        // 输入路径
        //String inputPath = new File(parentFile, "cunzi-generator-demo-projects/acm-template").getAbsolutePath();
        String inputPath = projectPath
                + File.separator
                + "cunzi-generator-demo-projects"
                + File.separator
                + "acm-template";
        // 输出路径
        String outputPath = projectPath;
        // 生成静态文件
        StaticFileGenerator.copyFilesByHutool(inputPath, outputPath);
        // 生成动态文件
        String inputDynamicFilePath = projectPath + File.separator + "cunzi-generator-maker" + File.separator + "src/main/resources/templates/MainTemplate.java.ftl";
        String outputDynamicFilePath = projectPath + File.separator + "acm-template/src/com/cunnan/acm/MainTemplate.java";
        DynamicFileGenerator.doGenerator(inputDynamicFilePath, outputDynamicFilePath, model);
    }
}
