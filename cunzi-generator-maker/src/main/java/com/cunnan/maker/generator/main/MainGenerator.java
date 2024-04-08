package com.cunnan.maker.generator.main;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.core.util.StrUtil;
import com.cunnan.maker.generator.JarGenerator;
import com.cunnan.maker.generator.ScripGenerator;
import com.cunnan.maker.generator.file.DynamicFileGenerator;
import com.cunnan.maker.meta.Meta;
import com.cunnan.maker.meta.MetaManager;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * @author CunNan
 * @Description 测试生成器
 * 使用模板模式可控式生成代码，通过继承该类，实现自己的生成逻辑
 */
public class MainGenerator extends GenerateTemplate{

    @Override
    protected void buildDist(String outputPath, String sourceCopyDestPath, String jarPath, String shellOutputFilePath) {
        System.out.println("不生成精简版的程序");
    }

    public static void main(String[] args) throws TemplateException, IOException, InterruptedException {
        MainGenerator mainGenerator = new MainGenerator();
        mainGenerator.doGenerator();
    }
}
