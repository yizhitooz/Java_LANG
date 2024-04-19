package case8;

public class TestPolymorphism
{
    public static void main(String[] args)
    {
        // 以多态方式分别实例化子类对象并调用eat()方法
        /********* begin *********/
        Dog d = new Dog();
        d.eat();
        Cat c = new Cat();
        c.eat();
        Lion l = new Lion();
        l.eat();
        /********* end *********/
    }
}

// Animal类中定义eat()方法
class Animal
{
    /********* begin *********/
    String name;
    int age;

    void eat()
    {
        System.out.println("eating bread...");
    }
    /********* end *********/
}

// Dog类继承Animal类 复写eat()方法
class Dog extends Animal
{
    /********* begin *********/
    @Override
    void eat()
    {
        super.eat();
    }
    /********* end *********/
}

// Cat类继承Animal类 复写eat()方法
class Cat extends Animal
{
    /********* begin *********/
    @Override
    void eat()
    {
        System.out.println("eating rat...");
    }
    /********* end *********/
}

// Lion类继承Animal类 复写eat()方法
class Lion extends Animal
{
    /********* begin *********/
    @Override
    void eat()
    {
        System.out.println("eating meat...");
    }
    /********* end *********/
}
