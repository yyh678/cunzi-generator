package com.cunnan.maker.generator;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.core.util.StrUtil;
import com.cunnan.maker.generator.file.DynamicFileGenerator;
import com.cunnan.maker.meta.Meta;
import com.cunnan.maker.meta.MetaManager;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * @author CunNan
 * @Description 测试生成器
 */
public class MainGenerator {

    public static void main(String[] args) throws TemplateException, IOException {
        Meta meta = MetaManager.getMetaObject();
        System.out.println(meta);

        // 输出的根路径
        String projectPath = System.getProperty("user.dir");
        String outputPath = projectPath + File.separator + "generated";
        if(!FileUtil.exist(outputPath)){
            FileUtil.mkdir(outputPath);
        }

        // 读取resources目录
        ClassPathResource classPathResource = new ClassPathResource("");
        String inputResourcePath = classPathResource.getAbsolutePath();

        // java包路径 com.cunnan.maker
        String outputBasePackage = meta.getBasePackage();
        // com/cunnan/maker
        String outputBasePackagePath = StrUtil.join("/", StrUtil.split(outputBasePackage, "."));
        // maker/src/main/java/com/cunnan
        String outputBaseJavaPackagePath = outputPath + File.separator + "src/main/java" + File.separator + outputBasePackagePath;

        String inputFilePath;
        String outputFilePath;

        inputFilePath = inputResourcePath + File.separator + "templates/java/model/DataModel.java.ftl";
        outputFilePath = outputBaseJavaPackagePath + File.separator + "model" + File.separator + "DataModel.java";
        DynamicFileGenerator.doGenerator(inputFilePath, outputFilePath, meta);

        // cli.command.ConfigCommand
        inputFilePath = inputResourcePath + File.separator + "templates/java/cli/command/ConfigCommand.java.ftl";
        outputFilePath = outputBaseJavaPackagePath + "/cli/command/ConfigCommand.java";
        DynamicFileGenerator.doGenerator(inputFilePath , outputFilePath, meta);

        // cli.command.GenerateCommand
        inputFilePath = inputResourcePath + File.separator + "templates/java/cli/command/GenerateCommand.java.ftl";
        outputFilePath = outputBaseJavaPackagePath + "/cli/command/GenerateCommand.java";
        DynamicFileGenerator.doGenerator(inputFilePath , outputFilePath, meta);

        // cli.command.ListCommand
        inputFilePath = inputResourcePath + File.separator + "templates/java/cli/command/ListCommand.java.ftl";
        outputFilePath = outputBaseJavaPackagePath + "/cli/command/ListCommand.java";
        DynamicFileGenerator.doGenerator(inputFilePath , outputFilePath, meta);

        // cli.CommandExecutor
        inputFilePath = inputResourcePath + File.separator + "templates/java/cli/CommandExecutor.java.ftl";
        outputFilePath = outputBaseJavaPackagePath + "/cli/CommandExecutor.java";
        DynamicFileGenerator.doGenerator(inputFilePath , outputFilePath, meta);

        // Main
        inputFilePath = inputResourcePath + File.separator + "templates/java/Main.java.ftl";
        outputFilePath = outputBaseJavaPackagePath + "/Main.java";
        DynamicFileGenerator.doGenerator(inputFilePath , outputFilePath, meta);
    }
}
