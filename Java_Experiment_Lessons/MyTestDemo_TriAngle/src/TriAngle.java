public class TriAngle
{
    double a;
    double b;
    double c;
    double circumference;//�ܳ�
    double area;//���
    Boolean tri_able;
    String message;

    void getCircumference()
    {
        this.circumference = 2 * (a + b + c);
    }

    void getArea()
    {
        double p = 0.5 * (a + b + c);
        this.area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
