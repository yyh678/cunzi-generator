package com.cunnan.cli.example;

import picocli.CommandLine;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;

/**
 * @author cunnan
 * @Description 交互式命令行输入
 * 动态交互式命令行输入类继承Callable接口比较适合
 */
public class Login implements Callable<Integer> {
    @Option(names = {"-u", "--user"}, description = "User name")
    String user;

    // interactive = true 表示交互式输入
    @Option(names = {"-p", "--password"}, description = "Passphrase", interactive = true,prompt = "Enter password:")
    String password;

    public Integer call() throws Exception {
        System.out.println("password = " + password);
        return 0;
    }

    public static void main(String[] args) {
        new CommandLine(new Login()).execute("-u", "cunnan", "-p");
    }
}