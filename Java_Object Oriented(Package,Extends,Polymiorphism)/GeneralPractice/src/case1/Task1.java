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
        // ͨ���вι��캯��ʵ����Dog�����dog
        // dog����talk()����
        // dog����eat()����
        /********* begin *********/
        Dog dog = new Dog(dogName, dogSex, dogColor);
        dog.talk();
        dog.eat();
        /********* end *********/
        // ͨ���вι��캯��ʵ����Cat�����cat
        // cat����talk()����
        // cat����eat()����
        /********* begin *********/
        Cat cat = new Cat(catName, catSex, catWeight);
        cat.talk();
        cat.eat();
        /********* end *********/
    }
}

// ������Pet ��װ����name��sex
// ���캯����ʼ��name��sex
// �������󷽷�talk()
// �������󷽷�eat()
abstract class Pet
{
    /********* begin *********/
    String name;
    String sex;

    void talk()
    {
        System.out.print("���ƣ�" + name + "���Ա�" + sex);
    }

    void eat()
    {
        System.out.println("�����ʲô��");
    }
    /********* end *********/
}

// Dog��̳���Pet�� ��װ����color
// ���캯����ʼ��name��sex��color
// ʵ���Լ���talk()������eat()����
// talk()���'���ƣ�name���Ա�sex����ɫ��color��������'
// eat()���'name�Թ�ͷ'
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
        System.out.println(name + "�Թ�ͷ��");
    }

    @Override
    void talk()
    {
        super.talk();
        System.out.println("����ɫ��" + color + "��������");
    }
    /********* end *********/
}

// Cat��̳���Pet�� ��װ����weight
// ���캯����ʼ��name��sex��weight
// ʵ���Լ���talk()������eat()����
// talk()���'���ƣ�name���Ա�sex�����أ�weight kg��������'
// eat()���'name����'
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
        System.out.println(name + "���㣡");
    }

    @Override
    void talk()
    {
        super.talk();
        System.out.println("�����أ�" + weight + "kg��������");
    }
    /********* end *********/
}