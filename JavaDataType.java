/**
 * @author      shaopengwei@hotmail.com
 * @version     1.0.0
 * 
 * java 基本8种数据类型：
 *      数值型：
 *          整数类型：
 *          byte    1字节
 *          short   2字节
 *          int     4字节
 *          long    8字节
 *          浮点小数类型：
 *          float   4字节
 *          double  8字节
 *      字符型：
 *          char    2字节
 *      布尔型：
 *      boolean     1字节
 * 
 * ASCII 码表编码，128个字符编码
 * unicode 编码能支持世界所有符号编码，一个英文字母和一个汉字都占用2个字节
 * utf-8 编码是一种变长的编码方式，字母占一个字节，汉字占3个字节
 * gbk 编码中字母占一个字节，汉字占2个字节
 * gb2312
 * big5 编码支持繁体中文
 */
public class JavaDataType {

    public static void main(String[] args) {
        javaInt();
    }

    /**
     * java int 类型
     */
    public static void javaInt() {
        int i = 10;
        System.out.println("i = " + i);
    }
}