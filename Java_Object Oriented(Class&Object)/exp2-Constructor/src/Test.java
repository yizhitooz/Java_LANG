package step2;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String sex = sc.next();
        /********** Begin **********/
        //�ֱ�ʹ�����ֹ�����������Person����
        Person P1 = new Person();
        Person P2 = new Person(name,sex);

        /********** End **********/

    }
}

//����Person���󣬲��������ֹ��췽��
/********** Begin **********/
class Person
{
    String name;
    String sex;
    public Person()
    {
        System.out.println("һ���˱�������");
    }
    public Person(String Pname,String Psex)
    {
        name = Pname;
        sex = Psex;
        System.out.println("������"+name+"���Ա�"+sex+"����������");
    }
}

/********** End **********/
