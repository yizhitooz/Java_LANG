package step1;

import java.util.Scanner;

//Triangle.java ,请在此文件中给出满足程序输出要求的三角形类Triangle的完整定义。
public class Triangle implements IShape
{
    double a, b, c;

    @Override
    public double getArea()
    {
        double p = (a + b + c) * 0.5;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));//海伦公式
    }

    @Override
    public double getPerimeter()
    {
        return a + b + c;
    }

    @Override
    public void input(Scanner sc) throws ShapeException
    {
        this.a = sc.nextDouble();
        this.b = sc.nextDouble();
        this.c = sc.nextDouble();
        if (this.a < 0 || this.b < 0 || this.c < 0)
        {
            throw new ShapeException("你输入了一个负数");
        }
        if (a + b <= c || a + c <= b || b + c <= a)
        {
            throw new ShapeException("不能构成三角形");
        }
    }
}
