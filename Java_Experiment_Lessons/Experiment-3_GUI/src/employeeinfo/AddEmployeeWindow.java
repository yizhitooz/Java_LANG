package employeeinfo;

import java.awt.GridLayout;
import java.util.Calendar;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class AddEmployeeWindow extends JFrame
{
    JLabel jl = null;
    JLabel jlname = null;
    JLabel jlborn = null;
    JLabel jlsalary = null;
    JLabel jlemail = null;

    JTextField jtfname = null;
    JTextField jtfborn = null;
    JTextField jtfsalary = null;
    JTextField jtfemail = null;
    JPanel jp1 = null;
    JPanel jp2 = null;
    JPanel jp3 = null;
    JPanel jp4 = null;
    JButton queren = null;

    public void init()
    {
        jl = new JLabel("  ��������Ա����Ϣ��");
        jlname = new JLabel("������");
        jtfname = new JTextField(20);
        jlborn = new JLabel("�������£�");
        jtfborn = new JTextField(20);
        jlsalary = new JLabel("���ʣ�");
        jtfsalary = new JTextField(20);
        jlemail = new JLabel("Email��");
        jtfemail = new JTextField(20);
        queren = new JButton("ȷ�����");
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        jp4 = new JPanel();

        jp1.add(jlname);
        jp1.add(jtfname);
        jp2.add(jlborn);
        jp2.add(jtfborn);
        jp3.add(jlsalary);
        jp3.add(jtfsalary);
        jp4.add(jlemail);
        jp4.add(jtfemail);

        this.setLayout(new GridLayout(6, 1, 0, 3));
        this.add(jl);
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);
        this.add(jp4);
        this.add(queren);

        queren.addActionListener(new Listeners());

        this.setSize(400, 300);
        this.setTitle("���ְ��");
        this.setLocationRelativeTo(null); //���ô��������ʾ

        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }

    public void addEmployee()
    {
        System.out.println("ȷ�����ѧ������");
        String name = null;
        String born = null;
        double salary = 0;
        String email = null;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        Operatefile.showUserList();
        System.out.println("������" + Employee.persons + "\n***************************************\n");

        if (jtfborn.getText().equals(""))
        {
            System.out.println("����������");
        } else
        {
            name = jtfname.getText();
            flag1 = true;
        }
        if (jtfborn.getText().equals(""))
        {
            System.out.println("����������");
        } else
        {
            born = jtfborn.getText();
            flag2 = true;
        }
        if (jtfsalary.getText().equals(""))
        {
            System.out.println("�����빤��");
        } else
        {
            salary = Double.parseDouble(jtfsalary.getText());
            flag3 = true;
        }
        if (jtfemail.getText() == null)
        {
            System.out.println("������Email");
        } else
        {
            email = jtfemail.getText();
            flag4 = true;
        }
        if (flag1 && flag2 && flag3 && flag4)
        {
            List<Employee> userlist = Operatefile.readEm();
            int lastIndex;
            String strindex;

            Calendar now = Calendar.getInstance();
            int year = now.get(Calendar.YEAR);
            int month = now.get(Calendar.MONTH) + 1;
            String strmonth;
            if (month < 10)
            {
                strmonth = "0" + String.valueOf(month);
            } else
                strmonth = String.valueOf(month);
            if (userlist.size() == 0)
                strindex = String.valueOf(year) + strmonth + "00";
            else
            {
                strindex = userlist.get(userlist.size() - 1).getID();
                strindex = String.valueOf(Integer.parseInt(strindex) + 1);
            }

            //���ְ��
            if (Employee.checkEmail(email))
            {
                Employee em = new Employee(strindex, name, born, salary, email);
                Operatefile.appendEm(em);
            } else JOptionPane.showMessageDialog(null, "email�������", "��Ϣ��Ϣ��ʾ��", JOptionPane.INFORMATION_MESSAGE);


            //����
            Operatefile.showUserList();
            System.out.println("������" + Employee.persons + "\n***************************************\n");
        }
    }
}
