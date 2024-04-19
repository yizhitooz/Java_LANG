/**
 * Cylinder:����
 *
 * @author guet.imagan
 */
package step1;

/**
 * ������
 *
 * @author Administrator
 */
public class Cylinder
{
    /**
     * ����ײ���״
     */
    private IShape bottom;
    /**
     * ����ĸ߶�
     */
    private double height;

    /**
     * ���췽��
     *
     * @param bottom ����ײ���������һ��ʵ����IShape�ӿڵ���Ķ���
     * @param height ����ĸ߶�
     */
    public Cylinder(IShape bottom, double height)
    {
        this.bottom = bottom;
        this.height = height;
    }

    /**
     * ���㲢��������ı����
     *
     * @return ��������
     */
    public double getSurfaceArea()
    {
        //begin
        return bottom.getPerimeter() * height + 2 * bottom.getArea();
        //end

    }

    /**
     * ���㲢������������
     *
     * @return �������
     */
    public double getVolume()
    {
        //begin
        return bottom.getArea() * height;
        //end

    }

}
