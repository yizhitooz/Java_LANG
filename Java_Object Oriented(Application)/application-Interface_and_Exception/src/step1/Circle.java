package step1;

import java.util.Scanner;

//Circle.java,�����������������������Ҫ���Բ��Circle�Ķ��塣
public class Circle implements IShape
{
    double r;

    @Override
    public double getArea()
    {
        return 3.14 * r * r;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * 3.14 * r;
    }

    @Override
    public void input(Scanner sc) throws ShapeException
    {
        this.r = sc.nextDouble();
        if (this.r < 0)
        {
            throw new ShapeException("��������һ������");
        }
    }


}
