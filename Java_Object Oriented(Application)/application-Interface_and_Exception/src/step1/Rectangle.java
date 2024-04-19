package step1;

import java.util.Scanner;

//Rectangle.java，请在下方给出满足程序输出要求的Rectangle类（长方形）的完整定义。
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
            throw new ShapeException("你输入了一个负数");
        }
    }
}
