package com.itheima.principles.dependenceInversion.before;

/**
 * @PROJECT_NAME: design_patterns
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/4/18 17:42
 */

/*这样的情况下，我们如果想修改电脑的某一个配置，Computer类中的内容要做大幅度修改，会非常麻烦，不利于维护，所以便有了依赖倒转后的改进*/
public class Computer {
    private InterCPU interCPU;
    private KingstonMemory kingstonMemory;
    private  XiJieHardDisk xiJieHardDisk;

    public Computer(InterCPU interCPU, KingstonMemory kingstonMemory, XiJieHardDisk xiJieHardDisk) {
        this.interCPU = interCPU;
        this.kingstonMemory = kingstonMemory;
        this.xiJieHardDisk = xiJieHardDisk;
    }

    public InterCPU getInterCPU() {
        return interCPU;
    }

    public void setInterCPU(InterCPU interCPU) {
        this.interCPU = interCPU;
    }

    public KingstonMemory getKingstonMemory() {
        return kingstonMemory;
    }

    public void setKingstonMemory(KingstonMemory kingstonMemory) {
        this.kingstonMemory = kingstonMemory;
    }

    public XiJieHardDisk getXiJieHardDisk() {
        return xiJieHardDisk;
    }

    public void setXiJieHardDisk(XiJieHardDisk xiJieHardDisk) {
        this.xiJieHardDisk = xiJieHardDisk;
    }

    public Computer() {
    }

    public void computerRun(){
        interCPU.run();
        kingstonMemory.save();
        xiJieHardDisk.save("数据");
        xiJieHardDisk.get();
    }
}
