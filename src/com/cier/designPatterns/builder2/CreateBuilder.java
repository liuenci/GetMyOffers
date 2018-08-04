package com.cier.designPatterns.builder2;

public class CreateBuilder extends Builder{
    // 创建产品实例
    private Computer computer = new Computer();
    @Override
    public void buildCPU() {
        computer.add("组装CPU");
    }

    @Override
    public void buildMainBoard() {
        computer.add("组装主板");
    }

    @Override
    public void buildHD() {
        computer.add("组装硬盘");
    }

    /**
     * 返回组装成功的电脑
     * @return
     */
    @Override
    public Computer getComputer() {
        return computer;
    }
}
