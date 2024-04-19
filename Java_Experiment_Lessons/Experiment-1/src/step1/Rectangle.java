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
        System.out.println("R1已构造，请输入R2的参数");
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        Rectangle r2 = new Rectangle(width, height);
        System.out.println("无参默认构造R1");
        System.out.println("r1的面积：" + r1.getArea() + ",R1的周长：" + r1.getPerimeter());
        System.out.println("含参指定值构造R2");
        System.out.printf("r2的面积：%.1f,R2的周长：%.1f", r2.getArea(), r2.getPerimeter());
    }

}
