/**
 * @author  shaopengwei@hotmail.com
 * @version 1.0.0
 * 
 * java 键盘输入
 *      使用 scanner 类接收用户的键盘输入
 *      next()
 *      nextInt()
 *      nextDouble()
 *      ...
 */

import java.util.Scanner;

public class JavaScanner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入名字：");
        String name = myScanner.next();
        System.out.println("请输入年龄：");
        int age = myScanner.nextInt();
        System.out.println("请输入工资：");
        double salary = myScanner.nextDouble();
        System.out.println("你的名字是：" + name + " 你的年龄是：" + age + " 你的工资是：" + salary);
    }
}
