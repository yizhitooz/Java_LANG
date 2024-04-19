/**
 * 任务：已知圆柱的底面半径为 20，高为 50，求该圆柱的体积。
 */


// 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码

/********** Begin **********/

// 定义一个圆类，类名为 Circle
class  Circle
{
    // 定义两个量，分别为半径和π值
    double radius;
    double PI = 3.1415926;

    // 有参构造器
    public Circle(double r)
    {
        radius = r;
    }

    // 定义一个方法，实现求圆面积，将圆面积返回，返回类型为double
    double getArea()
    {
        return radius*radius*PI;
    }
}
// 定义一个公开的圆柱类 Cylinder
public class Cylinder
{
    // 定义圆柱中的高
    double height;
    // 引用圆类
    double radius;
    double PI;

    // 有参构造
    public Cylinder(Circle c,double h)
    {
        height = h;
        radius = c.radius;
        PI = c.PI;
    }
    /**
     * 定义一个方法，该方法实现计算圆柱的体积，返回值为double
     */
    double getVolume()
    {
        return PI * radius * radius * height;
    }




/********** End **********/


    // 定义主方法
    public static void main(String[] args)
    {
// 通过有参构造创建圆对象，将底面半径设置为 20
        Circle c1 = new Circle(20);
// 通过有参构造创建圆柱对象，将圆柱的高设置为 50，将圆对象传入
        Cylinder c2 = new Cylinder(c1, 50);
// 调用计算圆柱积的方法
        double volume = c2.getVolume();
// 四舍五入格式化不换行输出圆柱的体积，输出格式：圆柱的体积为xx
            System.out.printf("圆柱的体积为%.2f", volume);
    }
}