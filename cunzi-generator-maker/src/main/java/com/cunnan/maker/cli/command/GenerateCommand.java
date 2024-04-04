package com.cunnan.maker.cli.command;

import cn.hutool.core.bean.BeanUtil;
import com.cunnan.maker.generator.file.FileGenerator;
import com.cunnan.maker.model.DataModel;
import lombok.Data;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

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
        DataModel dataModel = new DataModel();
        BeanUtil.copyProperties(this, dataModel);
        System.out.println("配置信息" + dataModel);
        FileGenerator.doGenerate(dataModel);
        return 0;
    }
}
