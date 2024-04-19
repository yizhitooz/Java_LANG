package case4;

public class overridingTest
{
    public static void main(String[] args)
    {
        // 实例化子类对象s，调用talk()方法打印信息
        /********* begin *********/
        Student s = new Student();
        s.name = "张三";
        s.age = 18;
        s.university = "哈佛大学";
        s.talk();
        /********* end *********/

    }
}

class Person
{
    /********* begin *********/
    String name;
    int age;

    void work()
    {
        System.out.println("父类方法被调用了");
    }

    void talk()
    {
        System.out.println("父类方法被调用了");
    }
    /********* end *********/
}

class Student extends Person
{
    /********* begin *********/
    String university;

    @Override
    void work()
    {
        System.out.print("我在" + university + "上学");
    }

    void talk()
    {
        System.out.print("我是：" + name + "，今年：" + age + "岁，");
        work();
    }
    /********* end *********/
}