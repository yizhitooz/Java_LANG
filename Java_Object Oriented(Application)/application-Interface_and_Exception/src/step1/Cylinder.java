/**
 * Cylinder:柱体
 *
 * @author guet.imagan
 */
package step1;

/**
 * 柱体类
 *
 * @author Administrator
 */
public class Cylinder
{
    /**
     * 柱体底部形状
     */
    private IShape bottom;
    /**
     * 柱体的高度
     */
    private double height;

    /**
     * 构造方法
     *
     * @param bottom 柱体底部，必须是一个实现了IShape接口的类的对象
     * @param height 柱体的高度
     */
    public Cylinder(IShape bottom, double height)
    {
        this.bottom = bottom;
        this.height = height;
    }

    /**
     * 计算并返回柱体的表面积
     *
     * @return 柱体表面积
     */
    public double getSurfaceArea()
    {
        //begin
        return bottom.getPerimeter() * height + 2 * bottom.getArea();
        //end

    }

    /**
     * 计算并返回柱体的体积
     *
     * @return 柱体体积
     */
    public double getVolume()
    {
        //begin
        return bottom.getArea() * height;
        //end

    }

}
