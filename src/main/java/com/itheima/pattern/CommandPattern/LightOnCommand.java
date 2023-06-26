package com.itheima.pattern.CommandPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//电灯开启的命令,实现command接口
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LightOnCommand implements Command{
    //聚合LightReceiver来实现接口，因为我们是通过Receiver来调用命令而不是直接调用命令
    private LightReceiver lightReceiver;

    @Override
    public void operate() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
