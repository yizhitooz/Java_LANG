package case3;

public class superTest
{
    public static void main(String[] args)
    {
        // 实例化一个Student类的对象s，为Student对象s中的school赋值，打印输出信息
        /********* begin *********/
        Student s = new Student();
        s.name = "张三";
        s.age = 18;
        s.university = "哈佛大学";
        s.show();
        /********* end *********/
    }
}

class Person
{
    /********* begin *********/
    String name;
    int age;
    /********* end *********/
}

class Student extends Person
{
    /********* begin *********/
    String university;

    void show()
    {
        System.out.println("姓名：" + super.name + "，年龄：" + super.age + "，学校：" + university);
    }
    /********* end *********/
}
