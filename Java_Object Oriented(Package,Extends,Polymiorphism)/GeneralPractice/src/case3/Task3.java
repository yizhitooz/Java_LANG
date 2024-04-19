package case3;

import java.util.Scanner;

public class Task3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String pppName = sc.next();
        int pppAge = sc.nextInt();
        String bpName = sc.next();
        int bpAge = sc.nextInt();
        String ppcName = sc.next();
        int ppcAge = sc.nextInt();
        String bcName = sc.next();
        int bcAge = sc.nextInt();
        // �����˶�Ա(ƹ�����˶�Ա�������˶�Ա)
        // ƹ�����˶�Ա
        // ͨ�����ι��캯��ʵ����PingPangPlayer����ppp
        // ���'name---age'
        // �ֱ����sleep()��eat()��study()��speak()����
        /********* begin *********/
        PingPangPlayer ppp = new PingPangPlayer(pppName, pppAge);
        System.out.println(ppp.name + "---" + ppp.age);
        ppp.sleep();
        ppp.eat();
        ppp.study();
        ppp.speak();
        /********* end *********/
        System.out.println("----------------");
        // �����˶�Ա
        // ͨ�����ι��캯��ʵ����BasketballPlayer����bp
        // ���'name---age'
        // �ֱ����sleep()��eat()��study()����
        /********* begin *********/
        BasketballPlayer bp = new BasketballPlayer(bpName, bpAge);
        System.out.println(bp.name + "---" + bp.age);
        bp.sleep();
        bp.eat();
        bp.study();
        /********* end *********/
        System.out.println("----------------");
        // ���Խ���(ƹ����������������)
        // ƹ�������
        // ͨ�����ι��캯��ʵ����PingPangCoach����ppc
        // ���'name---age'
        // �ֱ����sleep()��eat()��teach()��speak()����
        /********* begin *********/
        PingPangCoach ppc = new PingPangCoach(ppcName, ppcAge);
        System.out.println(ppc.name + "---" + ppc.age);
        ppc.sleep();
        ppc.eat();
        ppc.teach();
        ppc.speak();
        /********* end *********/
        System.out.println("----------------");
        // �������
        // ͨ�����ι��캯��ʵ����BasketballCoach����bc
        // ���'name---age'
        // �ֱ����sleep()��eat()��teach()����
        /********* begin *********/
        BasketballCoach bc = new BasketballCoach(bcName, bcAge);
        System.out.println(bc.name + "---" + bc.age);
        bc.sleep();
        bc.eat();
        bc.teach();
        /********* end *********/
        System.out.println("----------------");
    }
}

// ˵Ӣ��ӿ� �������󷽷�speak()
interface SpeakEnglish
{
    /********* begin *********/
    void speak();
    /********* end *********/
}

// �����˵ĳ�����Person ��װname��age
// �޲ι��캯��
// �вι��캯����ʼ��name��age
// ������巽��sleep() ���'�˶���Ҫ˯����'
// ���󷽷�eat()���ԵĲ�һ����
abstract class Person
{
    /********* begin *********/
    String name;
    int age;

    void sleep()
    {
        System.out.println("�˶���Ҫ˯����");
    }

    abstract void eat();
    /********* end *********/
}

// �����˶�ԱPlayer�������ࣩ�̳���Person��
// �޲ι��캯��
// �вι��캯����ʼ��name��age
// �˶�Աѧϰ���ݲ�һ������ȡΪ���� ������󷽷�study()
abstract class Player extends Person
{
    /********* begin *********/
    Player()
    {
        ;
    }

    Player(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    abstract void study();
    /********* end *********/
}

// �������Coach�������ࣩ�̳���Person��
// �޲ι��캯��
// �вι��캯����ʼ��name��age
// �����̵Ĳ�һ�� ������󷽷�teach()
abstract class Coach extends Person
{
    /********* begin *********/
    Coach()
    {
        ;
    }

    Coach(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    /********* end *********/
}

// ����ƹ�����˶�Ա������PingPangPlayer �̳���Player�ಢʵ��SpeakEnglish�ࣨ�������˶�Ա��Ҫ˵Ӣ�
// �޲ι��캯��
// �вι��캯����ʼ��name��age
// ʵ���Լ���eat()���� ���'ƹ�����˶�Ա�Դ�ײˣ���С����'
// ʵ���Լ���study()���� ���'ƹ�����˶�Աѧϰ��η���ͽ���'
// ʵ���Լ���speak()���� ���'ƹ�����˶�Ա˵Ӣ��'
class PingPangPlayer extends Player implements SpeakEnglish
{
    PingPangPlayer()
    {
        ;
    }

    PingPangPlayer(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    /********* begin *********/
    @Override
    void eat()
    {
        System.out.println("ƹ�����˶�Ա�Դ�ײˣ���С����");
    }

    @Override
    void study()
    {
        System.out.println("ƹ�����˶�Աѧϰ��η���ͽ���");
    }

    @Override
    public void speak()
    {
        System.out.println("ƹ�����˶�Ա˵Ӣ��");
    }

    /********* end *********/
}

// ���������˶�Ա������BasketballPlayer �̳���Player�� ����Ҫ�̳нӿڣ���Ϊ������Ҫ˵Ӣ��
// �޲ι��캯��
// �вι��캯����ʼ��name��age
// ʵ���Լ���eat()���� ���'�����˶�Ա��ţ�⣬��ţ��'
// ʵ���Լ���study()���� ���'�����˶�Աѧϰ��������Ͷ��'
class BasketballPlayer extends Player
{
    BasketballPlayer()
    {
        ;
    }

    BasketballPlayer(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    /********* begin *********/
    @Override
    void eat()
    {
        System.out.println("�����˶�Ա��ţ�⣬��ţ��");
    }

    @Override
    void study()
    {
        System.out.println("�����˶�Աѧϰ��������Ͷ��");
    }
    /********* end *********/
}

// ����ƹ������������� PingPangCoach �̳���Coach�ಢʵ��SpeakEnglish�ࣨ�����������Ҫ˵Ӣ�
// �޲ι��캯��
// �вι��캯����ʼ��name��age
// ʵ���Լ���eat()���� ���'ƹ���������С�ײˣ��ȴ�����'
// ʵ���Լ���teach()���� ���'ƹ�����������η���ͽ���'
// ʵ���Լ���speak()���� ���'ƹ�������˵Ӣ��'
class PingPangCoach extends Coach implements SpeakEnglish
{
    /********* begin *********/
    PingPangCoach()
    {
        ;
    }

    PingPangCoach(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    void eat()
    {
        System.out.println("ƹ���������С�ײˣ��ȴ�����");
    }

    void teach()
    {
        System.out.println("ƹ�����������η���ͽ���");
    }

    @Override
    public void speak()
    {
        System.out.println("ƹ�������˵Ӣ��");
    }
    /********* end *********/
}

// �����������������BasketballCoach �̳���Coach�� ����Ҫ�̳нӿڣ���Ϊ������Ҫ˵Ӣ��
// �޲ι��캯��
// �вι��캯����ʼ��name��age
// ʵ���Լ���eat()���� ���'������������⣬������'
// ʵ���Լ���teach()���� ���'�����������������Ͷ��'
class BasketballCoach extends Coach
{
    /********* begin *********/
    BasketballCoach()
    {
        ;
    }

    BasketballCoach(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    void eat()
    {
        System.out.println("������������⣬������");
    }

    void teach()
    {
        System.out.println("�����������������Ͷ��");
    }
    /********* end *********/
}
