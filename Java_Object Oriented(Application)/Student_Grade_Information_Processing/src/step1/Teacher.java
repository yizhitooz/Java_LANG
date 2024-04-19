package step1;

import java.util.Scanner;

public class Teacher
{
    public static void inputInfo(Student student, Scanner sc)
    {
        student.sno = sc.nextInt();
        student.name = sc.next();
        student.usual_grade = sc.nextDouble();
        student.exp_grade = sc.nextDouble();
        student.test_grade = sc.nextDouble();

    }

}
