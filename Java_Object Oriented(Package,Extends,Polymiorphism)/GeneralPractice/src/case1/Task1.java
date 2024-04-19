package case1;

import java.util.Scanner;

public class Task1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String dogName = sc.next();
        String dogSex = sc.next();
        String dogColor = sc.next();
        String catName = sc.next();
        String catSex = sc.next();
        double catWeight = sc.nextDouble();
        // 通过有参构造函数实例化Dog类对象dog
        // dog调用talk()方法
        // dog调用eat()方法
        /********* begin *********/
        Dog dog = new Dog(dogName, dogSex, dogColor);
        dog.talk();
        dog.eat();
        /********* end *********/
        // 通过有参构造函数实例化Cat类对象cat
        // cat调用talk()方法
        // cat调用eat()方法
        /********* begin *********/
        Cat cat = new Cat(catName, catSex, catWeight);
        cat.talk();
        cat.eat();
        /********* end *********/
    }
}

// 抽象类Pet 封装属性name和sex
// 构造函数初始化name和sex
// 声明抽象方法talk()
// 声明抽象方法eat()
abstract class Pet
{
    /********* begin *********/
    String name;
    String sex;

    void talk()
    {
        System.out.print("名称：" + name + "，性别：" + sex);
    }

    void eat()
    {
        System.out.println("宠物吃什么？");
    }
    /********* end *********/
}

// Dog类继承自Pet类 封装属性color
// 构造函数初始化name、sex和color
// 实现自己的talk()方法和eat()方法
// talk()输出'名称：name，性别：sex，颜色：color，汪汪叫'
// eat()输出'name吃骨头'
class Dog extends Pet
{
    /********* begin *********/
    String color;

    public Dog(String name, String sex, String color)
    {
        this.name = name;
        this.sex = sex;
        this.color = color;
    }

    @Override
    void eat()
    {
        System.out.println(name + "吃骨头！");
    }

    @Override
    void talk()
    {
        super.talk();
        System.out.println("，颜色：" + color + "，汪汪叫");
    }
    /********* end *********/
}

// Cat类继承自Pet类 封装属性weight
// 构造函数初始化name、sex和weight
// 实现自己的talk()方法和eat()方法
// talk()输出'名称：name，性别：sex，体重：weight kg，喵喵叫'
// eat()输出'name吃鱼'
class Cat extends Pet
{
    /********* begin *********/
    double weight;

    public Cat(String name, String sex, double weight)
    {
        this.name = name;
        this.sex = sex;
        this.weight = weight;
    }

    @Override
    void eat()
    {
        System.out.println(name + "吃鱼！");
    }

    @Override
    void talk()
    {
        super.talk();
        System.out.println("，体重：" + weight + "kg，喵喵叫");
    }
    /********* end *********/
}