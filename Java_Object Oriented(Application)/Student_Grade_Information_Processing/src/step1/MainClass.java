package step1;

import java.util.Scanner;

public class MainClass
{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Student stu = new Student();
        //�ӿ���̨����ѧ����Ϣ
        Teacher.inputInfo(stu, sc);
        //���������ѧ����Ϣ���д������������ɼ�����Ӧ�ȼ�
        stu.updateGrade();
        //��������Ľ��
        stu.outputInfo();
        sc.close();
    }

}
