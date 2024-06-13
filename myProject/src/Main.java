import com.algorithm.Sort;
import com.core.basic.object.Employee;
import com.core.basic.object.Manager;
import com.tool.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        /*
        Employee[] staff = new Employee[3];
        Manager boss = new Manager("Cal Cracker",1, 75000, 1987, 12, 15);
        boss.setBonus(5000);
        // 对象变量的多态
        staff[0] = boss;
        staff[1] = new Employee("Hary Hacker",2, 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester",3, 40000, 1990, 3, 15);
        for(Employee e : staff){
            System.out.println(e.toString());
            System.out.println(e.hashCode());
            System.out.println(e);
            System.out.println("id: " + e.getId() + " Employee Name: " + e.getName() + " Salary: " + e.getSalary() + " hireDay: " + e.getHireDay());
        }

        System.out.println("Raised salary.");
        for(Employee e:staff){
            if(e instanceof Manager boss0)// 给经理及以上的员工涨5%的工资
                boss0.raiseSalary(5);
        }
        System.out.println(Employee.getNum());
        for(Employee e : staff){
            System.out.println("id: " + e.getId() + " Employee Name: " + e.getName() + " Salary: " + e.getSalary() + " hireDay: " + e.getHireDay());
        }


        int[] arr1 = null;
        int[] arr2 = null;

        int times = 500000;
        int maxLength = 1000;
        int maxValue = 100;

        boolean res = true;
        for(int i = 0; i < times; ++i){
            arr1 = Comparator.createArray(maxLength, maxValue);
            arr2 = Comparator.copyArr(arr1);

            Sort.quickSort(arr1, 0, arr1.length - 1);
            Sort.insertSort(arr2);
            if(!Comparator.res(arr1, arr2))
            {
                res = false;
                break;
            }
        }
        System.out.println(res ? "Nice" : "Fucking wrong");
        */
        ArrayList<Employee> staff = new ArrayList<>();
        staff.ensureCapacity(100);// 容量为100，但并没有占用100个空间且没内容，数组列表是占用100空间但没内容
        staff.add(new Manager("Cal Cracker",1, 75000, 1987, 12, 15));
        staff.add(new Employee("Hary Hacker",2, 50000, 1989, 10, 1));
        staff.add(new Employee("Tony Tester",3, 40000, 1990, 3, 15));//容量为100，占用3空间
        // 扩大的机制是：当前staff满了(==100)后仍然调用add，就创建新的更大数组，并拷贝过去
        System.out.println(staff.size());
        staff.trimToSize();
        System.out.println(staff.size());
    }
}