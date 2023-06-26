package com.itheima.pattern.CommandPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/6/21 13:06
 */

//电灯关闭命令，实现command接口,聚合receiver类
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
public class LightOffCommand implements Command {
    private LightReceiver lightReceiver;

    @Override
    public void operate() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
