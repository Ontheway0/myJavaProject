package com.core.basic.record;

public record Position(double x, double y, double z) {
    // 内含与参数相同的私有字段，标准构造后便不可改变
    // 标准化构造器，特殊访问器
    // 三个函数equals， ToString， hashCode
    // 首先协助标准构造器的参数逻辑的形式
    public Position {
        if(x < 0)
            x = 0;
        if(y < 0)
            y = 0;
        if(z < 0)
            z = 0;
    }
}
