package step1;

import java.util.Scanner;

//Rectangle.java�������·���������������Ҫ���Rectangle�ࣨ�����Σ����������塣
public class Rectangle implements IShape
{
    double x, y;

    @Override
    public double getArea()
    {
        return x * y;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * (x + y);
    }

    @Override
    public void input(Scanner sc) throws ShapeException
    {
        this.x = sc.nextDouble();
        this.y = sc.nextDouble();
        if (this.x < 0 || this.y < 0)
        {
            throw new ShapeException("��������һ������");
        }
    }
}
