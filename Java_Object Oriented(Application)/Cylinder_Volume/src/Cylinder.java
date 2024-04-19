/**
 * ������֪Բ���ĵ���뾶Ϊ 20����Ϊ 50�����Բ���������
 */


// ���������Begin-End֮�䰴��ע���и�������ʾ��д��ȷ�Ĵ���

/********** Begin **********/

// ����һ��Բ�࣬����Ϊ Circle
class  Circle
{
    // �������������ֱ�Ϊ�뾶�ͦ�ֵ
    double radius;
    double PI = 3.1415926;

    // �вι�����
    public Circle(double r)
    {
        radius = r;
    }

    // ����һ��������ʵ����Բ�������Բ������أ���������Ϊdouble
    double getArea()
    {
        return radius*radius*PI;
    }
}
// ����һ��������Բ���� Cylinder
public class Cylinder
{
    // ����Բ���еĸ�
    double height;
    // ����Բ��
    double radius;
    double PI;

    // �вι���
    public Cylinder(Circle c,double h)
    {
        height = h;
        radius = c.radius;
        PI = c.PI;
    }
    /**
     * ����һ���������÷���ʵ�ּ���Բ�������������ֵΪdouble
     */
    double getVolume()
    {
        return PI * radius * radius * height;
    }




/********** End **********/


    // ����������
    public static void main(String[] args)
    {
// ͨ���вι��촴��Բ���󣬽�����뾶����Ϊ 20
        Circle c1 = new Circle(20);
// ͨ���вι��촴��Բ�����󣬽�Բ���ĸ�����Ϊ 50����Բ������
        Cylinder c2 = new Cylinder(c1, 50);
// ���ü���Բ�����ķ���
        double volume = c2.getVolume();
// ���������ʽ�����������Բ��������������ʽ��Բ�������Ϊxx
            System.out.printf("Բ�������Ϊ%.2f", volume);
    }
}