package com.core.basic.object;
import com.core.basic.basicInterface.basicInterface;
import java.time.LocalDate;
import com.core.basic.record.*;

public class Employee implements basicInterface {
    private static int num = 0;
    private int id;
    private String name;
    private double salary;
    private LocalDate hireDay;
    // 初始化块
    {
        num += 1;
        id = 0;
        name = "unknown";
        salary = 0.0;
        hireDay = null;
    }
    // 构造器和静态工厂方法
    public Employee() {}
    public Employee(String name, int id, double salary, int year, int month, int day) {
        // 调用其他的构造器
        this();
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }
    // 更改器
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }
    public void raiseSalary(double byPercent) {
        this.salary += byPercent / 100 * this.salary;
    }
    // 访问器
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }
    public LocalDate getHireDay() {
        return hireDay;
    }
    // 静态方法
    public static int getNum() {
        return num;
    }
    public static void swapArray(Employee[] staff, int index1, int index2) {
        if(index1 == index2) {
            return;
        }
        Employee temp = staff[index1];
        staff[index1] = staff[index2];
        staff[index2] = temp;
    }
}
