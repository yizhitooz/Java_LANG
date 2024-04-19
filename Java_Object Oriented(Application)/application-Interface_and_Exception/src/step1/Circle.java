package step1;

import java.util.Scanner;

//Circle.java,请在下面完成能满足程序输出要求的圆形Circle的定义。
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
            throw new ShapeException("你输入了一个负数");
        }
    }


}
