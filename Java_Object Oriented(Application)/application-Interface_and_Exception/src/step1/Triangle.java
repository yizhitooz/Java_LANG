package step1;

import java.util.Scanner;

//Triangle.java ,���ڴ��ļ��и�������������Ҫ�����������Triangle���������塣
public class Triangle implements IShape
{
    double a, b, c;

    @Override
    public double getArea()
    {
        double p = (a + b + c) * 0.5;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));//���׹�ʽ
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
            throw new ShapeException("��������һ������");
        }
        if (a + b <= c || a + c <= b || b + c <= a)
        {
            throw new ShapeException("���ܹ���������");
        }
    }
}
