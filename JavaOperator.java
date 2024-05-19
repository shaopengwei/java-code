/**
 * @author  shaopengwei@hotmail.com
 * @version 1.0.0
 * 
 * java 运算符
 *      算术运算符
 *          +
 *          -
 *          *
 *          /
 *          %：取余运算，a % b => a - a / b * b，例如 10 % 3 => 10 - 10 / 3 * 3 = 10 - 9 = 1
 *          ++：++a => 先a+1，然后赋值；a++ => 先赋值，后a+1
 *          --
 *          字符串连接 +
 *      关系运算符
 *          ==
 *          !=
 *          <
 *          >
 *          <=
 *          >=
 *          instanceof：检查是否是类的对象
 *      逻辑运算符
 *          &：逻辑与
 *          &&：短路与，a && b => 先判断a，如果a为false，不会计算b，直接返回false
 *          |：逻辑或
 *          ||：短路或，a || b => 先判断a，如果a为true，不用计算b，直接返回true
 *          ! ：取反
 *          ^：异或，相同为0，不同为1
 *      赋值运算符
 *          =
 *          +=：a+=b => a = a + b
 *          -=
 *          /=
 *          %=
 *      三元运算符
 *          a ? b : c => 如果a为true，返回b；如果a为false，返回c
 *      位运算
 *          >>：算数右移，相当于除以2
 *          <<：算数左移，相当于乘以2
 *          >>>：逻辑右移
 *          ~：按位取反
 *          &：位与
 *          |：位或
 *          ^：位异或
 * 
 */
public class JavaOperator {
    public static void main(String[] args) {
        // javaPlus();
        // javaMo();
        javaBit();
    }

    public static void javaPlus() {
        System.out.println(1 + 1);
    }

    public static void javaMo() {
        int i = 10 % 3;
        int j = -10 % 3;
        int k = 10 % -3;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
    }

    public static void javaBit() {
        // 计算机运算是先按照补码运算，再将结果转换成源码
        // 2&3 的运算过程
        // 2 的源码：00000000 00000000 00000000 00000010
        // 2 的补码：00000000 00000000 00000000 00000010
        // 3 的源码：00000000 00000000 00000000 00000011
        // 3 的补码：00000000 00000000 00000000 00000011
        // 计算补码的位与
        //          00000000 00000000 00000000 00000010
        // 结果转换成源码
        //          00000000 00000000 00000000 00000010
        // 结果是 2
        System.out.println(2&3);
    }

}
