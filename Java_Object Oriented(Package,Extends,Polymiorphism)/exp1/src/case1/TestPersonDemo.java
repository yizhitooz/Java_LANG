package case1;

public class TestPersonDemo
{
    public static void main(String[] args)
    {
        /********* begin *********/
        // 声明并实例化一Person对象p
        Person p = new Person();
        // 给p中的属性赋值
        p.name = "张三";
        p.age = 18;
        // 调用Person类中的talk()方法
        p.talk();
        /********* end *********/

    }
}

// 在这里定义Person类
class Person
{
    /********* begin *********/
    String name;
    int age;

    void talk()
    {
        System.out.println("我是：" + this.name + "，今年：" + this.age + "岁");
    }

    /********* end *********/
}
