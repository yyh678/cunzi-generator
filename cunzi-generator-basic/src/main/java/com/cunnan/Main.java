package com.cunnan;

import com.cunnan.cli.CommandExecutor;

/**
 * @author CunNan
 * @Description
 */
public class Main {
    public static void main(String[] args) {

        args = new String[]{"generate", "-l", "-a", "-o"};
        // args = new String[]{"config"};
        // args = new String[]{"list"};
        CommandExecutor commandExecutor = new CommandExecutor();
        commandExecutor.doExecute(args);
    }
}
