package step1;

//import java.text.DecimalFormat;

public class Student
{
    //public static Scanner input = new Scanner(System.in);
    String name;
    int sno;
    double usual_grade;
    double exp_grade;
    double test_grade;
    double final_grade;
    String Grade;

    public void updateGrade()
    {
        this.final_grade = 0.3 * this.exp_grade + 0.3 * this.usual_grade + 0.4 * this.test_grade;
        if (this.final_grade >= 90)
        {
            this.Grade = "A";
        } else if (final_grade >= 80)
        {
            this.Grade = "B";
        } else if (final_grade >= 70)
        {
            this.Grade = "C";
        } else if (final_grade >= 60)
        {
            this.Grade = "D";
        } else
        {
            this.Grade = "E";
        }
    }

    public void outputInfo()
    {
        System.out.println("ѧ��=����=ƽʱ�ɼ�=ʵ��ɼ�=��ĩ����=" + this.name + "(" + this.sno + ")�Ŀγ�\"Java�������������\"�ĳɼ���������:");
        System.out.println("ƽʱ�ɼ�:" + String.format("%.2f", this.usual_grade));
        System.out.println("ʵ��ɼ�:" + String.format("%.2f", this.exp_grade));
        System.out.println("��ĩ����:" + String.format("%.2f", this.test_grade));
        System.out.println("����:" + String.format("%.2f", this.final_grade) + ",�ȼ���" + this.Grade);
    }
}
