package com.cunnan.maker.cli;

import com.cunnan.maker.cli.command.ConfigCommand;
import com.cunnan.maker.cli.command.GenerateCommand;
import com.cunnan.maker.cli.command.ListCommand;
import picocli.CommandLine;
import picocli.CommandLine.Command;

/**
 * @author CunNan
 * @Description 实际命令执行者
 */

@Command(name = "cunzi", mixinStandardHelpOptions = true)
public class CommandExecutor implements Runnable{

    private final CommandLine commandLine;

    // 不用new初始化，而是放在代码块里是因为之后我们使用的都是同一个commandLine，没有必要每次都new一个对象
    {
        commandLine = new CommandLine(this)
                .addSubcommand(new GenerateCommand())
                .addSubcommand(new ConfigCommand())
                .addSubcommand(new ListCommand());
    }

    @Override
    public void run() {
        // 不输出子命令时给出相应的提示
        System.out.println("请输入具体命令，或输入 --help 查看帮助信息");
    }

    // 执行命令
    public Integer doExecute(String[] args) {
        return commandLine.execute(args);
    }
}
