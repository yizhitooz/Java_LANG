import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Student implements Comparable<Student> {
    String sno;
    String name;
    String grade;

    // 读学生信息
    public static ArrayList<Student> readStuInfo() {
        ArrayList<Student> stuList = new ArrayList<Student>();
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get("file.txt"));
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
        String[][] array = new String[lines.size()][];
        for (int i = 0; i < lines.size(); i++) {
            array[i] = lines.get(i).split(" ");
        }
        for (int i = 0; i < array.length; i++) {
            stuList.add(new Student(array[i][0], array[i][1], array[i][2]));
        }
        return stuList;
    }

    // 保存学生信息
    static void saveStuInfo(ArrayList<Student> stuList) {
        try {
            FileWriter writer = new FileWriter("file.txt", StandardCharsets.UTF_8);
            writer.write("");
            for (Student student : stuList) {
                writer.write(student.sno + " " + student.name + " " + student.grade + '\n');
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 选择学生
    static int selectStuInfo(Student s, ArrayList<Student> stuList) {
        return stuList.indexOf(s);
    }
    static Student selectStuInfo(String sno,ArrayList<Student> stuList)
    {
        for (Student stu : stuList) {
            if (stu.sno.equals(sno)) {
                return stu;
            }else{
                //do nothing
            }
        }
        return null;    
    }

    // 插入学生信息
    static void insertStuInfo(ArrayList<Student> stuList) {
        Collections.sort(stuList);
        System.out.println("请输入新学生的信息");
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");
        List<String> list = Arrays.asList(array);
        System.out.println(list.size());
        if (list.size() != 3) {
            System.out.println("你输入的参数数量有误，无法修改");
        } else {
            Student s = new Student(list.get(0), list.get(1), list.get(2));
            stuList.add(s);
            System.out.println("新增学生信息：");
            System.out.println(s.sno + " " + s.name + " " + s.grade + "\n");
        }
    }
    static void insertStuInfo(ArrayList<Student> stuList,String sno,String name,String grade)
    {
        Student s = new Student(sno, name, grade);
        stuList.add(s);
    }

    // 删除学生信息
    static void delectStuInfo(int index, ArrayList<Student> stuList) {
        stuList.remove(index);
    }

    // 修改学生信息
    static void editStuInfo(int index, ArrayList<Student> stuList) {
        System.out.println("请输入修改后的结果");
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");
        List<String> list = Arrays.asList(array);
        if (list.size() != 3) {
            System.out.println("你输入的参数数量有误，无法修改");
        } else {
            stuList.get(index).sno = list.get(0);
            stuList.get(index).name = list.get(1);
            stuList.get(index).grade = list.get(2);
            System.out.println("修改完成\n修改后的学生信息如下：");
            System.out.println(stuList.get(index).sno + " " + stuList.get(index).name + " " + stuList.get(index).grade);
        }
    }
    static void editStuInfo(int index, ArrayList<Student> stuList,String s1,String s2){
        stuList.get(index).name = s1;
        stuList.get(index).grade = s2;
    }

    // 构造方法
    Student(String sno, String name, String grade) {
        this.sno = sno;
        this.name = name;
        this.grade = grade;
    }

    // 重写比较方法
    @Override
    public int compareTo(Student s) {
        if (Integer.parseInt(this.sno) > Integer.parseInt(s.sno)) {
            return 1;
        } else if (Integer.parseInt(this.sno) > Integer.parseInt(s.sno)) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return (this.sno+"\t"+this.name+"\t"+this.grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎来到学生成绩管理系统！");

        ArrayList<Student> stuList = Student.readStuInfo();

        int choice = 0;
        do {
            System.out.println("功能如下：\n1.查看所有学生信息\n2.查找特定学生（学号）\n3.增加学生\n4.关闭系统");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("你选择了功能1");
                    for (Student student : stuList) {
                        System.out.println(student.sno + " " + student.name + " " + student.grade);
                    }
                    System.out.println("-------------------------");
                    break;

                case 2:
                    System.out.println("你选择了功能2");
                    System.out.println("输入特定学生的学号:");
                    String snoSelect;
                    Scanner s2 = new Scanner(System.in);
                    snoSelect = s2.nextLine();
                    for (Student student : stuList) {
                        // System.out.println(student.sno);
                        if (snoSelect.equals(student.sno)) {
                            System.out.println("找到了,该学生的信息如下：");
                            System.out.println(student.sno + " " + student.name + " " + student.grade);
                            int index = stuList.indexOf(student);
                            int choice2 = 0;

                            do {
                                System.out.println("功能选择：\n5.删除\n6.修改\n7.离开");
                                Scanner s22 = new Scanner(System.in);
                                choice2 = s22.nextInt();
                                switch (choice2) {
                                    case 5:
                                        Student.delectStuInfo(index, stuList);
                                        break;
                                    case 6:
                                        Student.editStuInfo(index, stuList);
                                        break;

                                    default:
                                        break;
                                }
                            } while (choice2 != 7);
                        } else {
                            // System.out.println("没有找到这个学生，重开吧");
                        }
                    }
                    Student.saveStuInfo(stuList);
                    System.out.println("-------------------------");

                    break;
                case 3:
                    System.out.println("你选择了功能3");
                    Student.insertStuInfo(stuList);
                    Student.saveStuInfo(stuList);
                    System.out.println("-------------------------");
                    break;
                default:
                    break;
            }

        } while (choice != 4);
        System.out.println("系统已关闭");

        scanner.close();
    }

}
