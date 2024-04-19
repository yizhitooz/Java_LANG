package step1;

import java.util.Scanner;

public class Rectangle
{
    public double width;
    public double height;

    public Rectangle()
    {
        width = 4;
        height = 40;
    }

    public Rectangle(double w, double h)
    {
        this.height = h;
        this.width = w;
    }

    double getArea()
    {
        return this.height * this.width;
    }

    double getPerimeter()
    {
        return 2 * (this.width + this.height);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        System.out.println("R1�ѹ��죬������R2�Ĳ���");
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        Rectangle r2 = new Rectangle(width, height);
        System.out.println("�޲�Ĭ�Ϲ���R1");
        System.out.println("r1�������" + r1.getArea() + ",R1���ܳ���" + r1.getPerimeter());
        System.out.println("����ָ��ֵ����R2");
        System.out.printf("r2�������%.1f,R2���ܳ���%.1f", r2.getArea(), r2.getPerimeter());
    }

}
