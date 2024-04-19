package step1;


import java.util.Scanner;

public class MainClass
{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("��������������");
        System.out.println("0-Բ����\n1-������\n2-������");
        IShape bottom = null;
        switch (sc.nextInt())
        {
            //����begin=end֮�䲹����룬�����ط����������޸���������һ����0�֡�
/***************begin*************************************/
            case 0:
                bottom = new Circle();
                break;
            case 1:
                bottom = new Triangle();
                break;
            case 2:
                bottom = new Rectangle();
                break;
/***************end*************************************/
            default:
                System.out.println("�ݲ�֧����������!");
                sc.close();
                return;
        }
        System.out.println("������������������ֵ:");
        //��������쳣����ȷ�����������ֵ���ǺϷ���ֵ��������������������˵���������ܹ��������Σ�������Ҫ����������
        while (true)
        {
            try
            {
                bottom.input(sc);
                break;
            } catch (ShapeException exp)
            {
                System.out.println(exp.getMessage());
                System.out.println("��������������ֵ:");
            }
        }
        System.out.println("����������ĸ߶�:");
        double height = sc.nextDouble();
        //�������壬�������
        Cylinder cylinder = new Cylinder(bottom, height);
        String s = String.format("���=%.2f,�����=%.2f", cylinder.getVolume(),
                cylinder.getSurfaceArea());
        System.out.printf(s);
        sc.close();
    }

}
