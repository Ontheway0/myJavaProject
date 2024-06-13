package com.test;
import com.core.basic.object.Employee;
import java.lang.reflect.*;
public class reflectTest {

    public static void main(String[] args)
    throws ReflectiveOperationException{
        Employee e = new Employee();
        Class cl = e.getClass();

        String className = "java.util.Random";
        Class cl1 = Class.forName(className);
        System.out.println(cl1.getName());

        Object obj = cl1.getConstructor().newInstance();
        System.out.println(cl.getFields().getClass().getName());

    }
}
