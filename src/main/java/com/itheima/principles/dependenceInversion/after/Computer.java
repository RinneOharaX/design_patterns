package com.itheima.principles.dependenceInversion.after;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/18 17:42
 */

/*如果将实现类全部抽取成接口，通过多态创建出需要的子类，再供Computer调用，这样就可以减少大幅度的修改，降低耦合度*/
public class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDisk hardDisk;

    public Computer(CPU cpu, Memory memory, HardDisk hardDisk) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDisk = hardDisk;
    }

    public Computer() {
    }


    public void computerRun(){
        CPU interCPU=new InterCPU();
        Memory kingstonMemory=new KingstonMemory();
        HardDisk  xiJieHardDisk=new XiJieHardDisk();
        interCPU.run();
        kingstonMemory.save();
        xiJieHardDisk.save("数据");
        xiJieHardDisk.get();
    }
}
