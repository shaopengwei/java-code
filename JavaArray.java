import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author  shaopengwei@hotmail.com
 * @version 1.0.0
 * 
 * java 数组
 *      数组的初始化方式
 *          int[] arr = new int[5]
 *          int[] arr = {1,2,3,4,5}
 *      数组的使用
 *          数组赋值：引用赋值
 *          数组拷贝：按照元素赋值
 */

public class JavaArray {
    public static void main(String[] args) {
        arrayInfo();
    }

    public static void arrayInfo() {
        ArrayList<Integer> arrayTest = new ArrayList<>();
        arrayTest.add(1);
        arrayTest.add(2);
        arrayTest.add(3);
        arrayTest.add(4);
        arrayTest.add(5);

        int sum = 0;
        for (Integer item : arrayTest) {
            sum += item;
        }

        System.out.println("sum = " + sum);
        System.out.println(arrayTest.get(0));

        // 数组的静态初始化
        double[] arrayDouble1 = {1, 2, 3, 4, 5};
        System.out.println(arrayDouble1.length);

        // 数组的初始化，分配固定大小空间
        int[] arrayInt = new int[2];
        Scanner scannerTest = new Scanner(System.in);
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("请输入第" + (i+1) + "个元素");
            arrayInt[i] = scannerTest.nextInt();
        }
        System.out.println(arrayInt[0]);
    }
}
