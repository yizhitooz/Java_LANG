package case8;

public class TestPolymorphism
{
    public static void main(String[] args)
    {
        // �Զ�̬��ʽ�ֱ�ʵ����������󲢵���eat()����
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

// Animal���ж���eat()����
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

// Dog��̳�Animal�� ��дeat()����
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

// Cat��̳�Animal�� ��дeat()����
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

// Lion��̳�Animal�� ��дeat()����
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
