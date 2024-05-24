/**
 * @author  shaopengwei@hotmail.com
 * @version 1.0.0
 * 
 * java 类对象
 * 
 */
public class JavaObject {
    
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 1;
        cat1.name = "小白";
        cat1.color = "白色";
        cat1.eat();
    }
}

/**
 * 定义一个猫类
 */
class Cat{
    // 类属性
    public String name;
    int age;
    String color;
    double weight;

    // 类方法
    public void run() {
        System.out.println("我是一只猫，我可以跑！");
    }

    public void eat() {
        System.out.println("我是一只猫，我能吃东西！");
    }
}