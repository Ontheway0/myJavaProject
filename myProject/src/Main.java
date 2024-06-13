import com.core.basic.object.*;
import com.core.basic.record.*;
import com.test.comparator;
import com.algorithm.Sort;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*Employee[] staff = new Employee[3];
        Manager boss = new Manager("Cal Cracker",1, 75000, 1987, 12, 15);
        boss.setBonus(5000);
        staff[0] = boss;
        staff[1] = new Employee("Hary Hacker",2, 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester",3, 40000, 1990, 3, 15);
        for(Employee e : staff){
            System.out.println("id: " + e.getId() + " Employee Name: " + e.getName() + " Salary: " + e.getSalary() + " hireDay: " + e.getHireDay());
        }
        System.out.println("Raised Salary.");
        for(Employee e : staff){
            e.raiseSalary(5);
        }
        System.out.println(Employee.getNum());
        for(Employee e : staff){
            System.out.println("id: " + e.getId() + " Employee Name: " + e.getName() + " Salary: " + e.getSalary() + " hireDay: " + e.getHireDay());
        }
        System.out.println(80000 * (1 + 0.05));*/

        int[] arr1 = null;
        int[] arr2 = null;

        for(int i = 0; i < comparator.times; ++i){
            arr1 = comparator.createArray(comparator.maxLength, comparator.maxValue);
            arr2 = comparator.copyArr(arr1);

            Arrays.sort(arr1);
            Sort.mergeSort(arr2, 0, arr2.length - 1);
            comparator.result = comparator.res(arr1, arr2);
            if(!comparator.result){
                comparator.result = false;
                break;
            }
        }
        System.out.println(comparator.result?"Successful":"Fucking wrong");
    }

}