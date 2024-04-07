package com.cunnan.cli.command;

import cn.hutool.core.io.FileUtil;
import picocli.CommandLine.Command;

import java.io.File;
import java.util.List;

@Command(name = "list", description = "查看文件列表", mixinStandardHelpOptions = true)
public class ListCommand implements Runnable {

    public void run() {
        // 输入路径 输入项目模板的根路径
        String inputPath = "E:/PlanetPojo/planetpro/cunzi-generator/cunzi-generator-demo-projects/acm-template-pro";
        List<File> files = FileUtil.loopFiles(inputPath);
        for (File file : files) {
            System.out.println(file);
        }
    }
}