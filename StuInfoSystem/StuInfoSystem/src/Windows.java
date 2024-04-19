import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.*;

public class Windows {
    void init(ArrayList<Student> sList) {
        String ss = "学号\t姓名\t成绩\n";
        for (Student s : sList) {
            ss += s.toString() + "\n";
        }
        final String ssJTA = String.valueOf(ss);
        JFrame frame = new JFrame("Student Info System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 100);

        JPanel panel = new JPanel();
        frame.add(panel);
        JButton button1 = new JButton("查看所有学生的信息");
        panel.add(button1);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame textFrame = new JFrame("Info");
                textFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                textFrame.setSize(300, 300);

                JTextArea textArea = new JTextArea(ssJTA);
                textFrame.add(textArea);

                textFrame.setVisible(true);
            }
        });

        JButton button2 = new JButton("对学生进行操作");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Operation");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(800, 100);
                frame.setLayout(new FlowLayout());

                JPanel panel1 = new JPanel();
                panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
                JLabel label1 = new JLabel("学号");
                JTextField textField1 = new JTextField(10);
                panel1.add(label1);
                panel1.add(textField1);
                frame.add(panel1);

                JPanel panel2 = new JPanel();
                panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
                JLabel label2 = new JLabel("姓名");
                JTextField textField2 = new JTextField(10);
                panel2.add(label2);
                panel2.add(textField2);
                frame.add(panel2);

                JPanel panel3 = new JPanel();
                panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
                JLabel label3 = new JLabel("成绩");
                JTextField textField3 = new JTextField(10);
                panel3.add(label3);
                panel3.add(textField3);
                frame.add(panel3);

                JButton button1 = new JButton("按学号查询");
                button1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String text1 = textField1.getText();
                        Student s1 = Student.selectStuInfo(text1, sList);
                        textField2.setText(s1.name);
                        textField3.setText(s1.grade);
                    }
                });
                frame.add(button1);

                JButton button2 = new JButton("修改");
                button2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String text1 = textField1.getText();
                        String text2 = textField2.getText();
                        String text3 = textField3.getText();
                        Student s1 = Student.selectStuInfo(text1, sList);
                        if ((!text1.equals(s1.sno)) && sList.contains(Student.selectStuInfo(text1, sList))) {
                            JOptionPane.showMessageDialog(frame, "你想修改学号，但学号已重复，请检查", "Warning",
                                    JOptionPane.WARNING_MESSAGE);
                        } else {
                            Student.editStuInfo(sList.indexOf(s1), sList, text2, text3);
                        }
                        Student.saveStuInfo(sList);
                    }
                });
                frame.add(button2);

                JButton button3 = new JButton("删除");
                button3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String text1 = textField1.getText();
                        textField1.setText("");
                        textField2.setText("");
                        textField3.setText("");
                        Student s1 = Student.selectStuInfo(text1, sList);
                        Student.delectStuInfo(sList.indexOf(s1), sList);
                        Student.saveStuInfo(sList);
                    }
                });
                frame.add(button3);

                frame.setVisible(true);
            }
        });
        panel.add(button2);

        JButton button3 = new JButton("新增学生信息");
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Operation");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(600, 100);
                frame.setLayout(new FlowLayout());

                JPanel panel1 = new JPanel();
                panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
                JLabel label1 = new JLabel("学号");
                JTextField textField1 = new JTextField(10);
                panel1.add(label1);
                panel1.add(textField1);
                frame.add(panel1);

                JPanel panel2 = new JPanel();
                panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
                JLabel label2 = new JLabel("姓名");
                JTextField textField2 = new JTextField(10);
                panel2.add(label2);
                panel2.add(textField2);
                frame.add(panel2);

                JPanel panel3 = new JPanel();
                panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
                JLabel label3 = new JLabel("成绩");
                JTextField textField3 = new JTextField(10);
                panel3.add(label3);
                panel3.add(textField3);
                frame.add(panel3);

                JButton button1 = new JButton("新增");
                button1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String text1 = textField1.getText();
                        String text2 = textField2.getText();
                        String text3 = textField3.getText();
                        if (sList.contains(Student.selectStuInfo(text1, sList))) {
                            JOptionPane.showMessageDialog(frame, "已有相同学号的信息，请检查", "Warning",
                                    JOptionPane.WARNING_MESSAGE);
                        } else {
                            Student.insertStuInfo(sList, text1, text2, text3);
                            Student.saveStuInfo(sList);
                        }
                    }
                });
                frame.add(button1);
                frame.setVisible(true);
            }

        });
        panel.add(button3);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        ArrayList<Student> stuList = Student.readStuInfo();
        Windows w = new Windows();
        w.init(stuList);
    }
}
