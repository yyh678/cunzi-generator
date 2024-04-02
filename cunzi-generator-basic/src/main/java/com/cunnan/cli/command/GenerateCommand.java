package com.cunnan.cli.command;

import cn.hutool.core.bean.BeanUtil;
import com.cunnan.generator.MainGenerator;
import com.cunnan.model.MainTemplateConfig;
import lombok.Data;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.util.concurrent.Callable;

/**
 * @author CunNan
 * @Description 生成文件
 */
@Data
@Command(name = "generate", mixinStandardHelpOptions = true, description = "Generate files")
public class GenerateCommand implements Callable<Integer> {

    @Option(names = {"-l", "-loop"},arity= "0..1", description = "是否循环！", interactive = true, echo = true)
    private boolean loop;

    @Option(names = {"-a", "--author"}, arity = "0..1", description = "作者", interactive = true, echo = true)
    private String author = "CunNan";

    @Option(names = {"-o", "--outputText"}, arity = "0..1", description = "输出内容", interactive = true, echo = true)
    private String outputText = "sum = ";

    @Override
    public Integer call() throws Exception {
        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
        BeanUtil.copyProperties(this, mainTemplateConfig);
        System.out.println("配置信息" + mainTemplateConfig);
        MainGenerator.doGenerate(mainTemplateConfig);
        return 0;
    }
}
