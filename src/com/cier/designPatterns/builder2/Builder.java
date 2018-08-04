package com.cier.designPatterns.builder2;

public abstract class Builder {

    // 第一步：装 CPU
    // 声明为抽象方法，具体由子类实现
    public abstract void buildCPU();

    // 第二步：装主板
    public abstract void buildMainBoard();

    // 第三步：装硬盘
    public abstract void buildHD();

    // 返回产品的方法：获得组装好的电脑
    public abstract Computer getComputer();

}
