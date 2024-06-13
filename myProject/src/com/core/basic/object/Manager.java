package com.core.basic.object;

import java.time.LocalDate;
import java.util.Objects;

public class Manager extends Employee{
    private double bonus;
    // 构造器
    public Manager(){
        super();
        bonus = 0.0;
    }
    public Manager(String name, int id, double salary, int year, int month, int day) {
        // 调用其他的构造器
        super(name, id, salary, year, month, day);
    }
    // 更改器
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void raiseSalary(double byPercent) {
        super.setSalary(this.getSalary() * (1 + byPercent/100) - this.bonus);
    }
    // 访问器
    public double getSalary()
    {
        return super.getSalary() + bonus;
    }

    public boolean equals(Object otherObject){
        if(!super.equals(otherObject))
            return false;
        Manager other = (Manager) otherObject;
        return this.bonus == other.bonus;
    }
}
