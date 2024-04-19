package employeeinfo;

import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

public class ShowEmployeeWindow extends JFrame
{
    JLabel jl = null;
    JLabel jlSearchID = null;
    JTextField jtfSearchID = null;
    JButton jbSearchID = null;
    JLabel jlSearchName = null;
    JTextField jtfSearchName = null;
    JButton jbSearchName = null;
    JButton jbModify = null;
    JButton jbStatics = null;
    JTextArea jtaArea = null;
    JScrollPane jsp = null;

    //��ʼ���������
    public ShowEmployeeWindow()
    {
        //jtaArea.setVisibleRowCount(10);  //��������ʾsetVisibleRowCount(?)?Ϊ��ʾ����
        jlSearchID = new JLabel("������ID");
        jtfSearchID = new JTextField(20);
        jbSearchID = new JButton("��ID����");

        jlSearchName = new JLabel("����������");
        jtfSearchName = new JTextField(20);
        jbSearchName = new JButton("����������");

        jbModify = new JButton("�޸�");
        jbStatics = new JButton("ͳ��");

        jtaArea = new JTextArea(50, 20);

        List<Employee> userlist = Operatefile.readEm();
        jl = new JLabel("  ���ְ����Ϣ,��������" + String.valueOf(Employee.persons));

        String emstring = "";
        for (Employee em : userlist)
        {
            emstring = "  " + em.getID() + "\n" + "  " + em.getName() + "\n" + "  " + em.getBorn() + "\n" + "  " + String.valueOf(em.getSalary()) + "\n" + "  " + em.getEmail();
            //System.out.println(emstring+"\n");
            jtaArea.append("-----------------\n" + emstring + "\n");
        }
        //���ñ߿�
        Border border = BorderFactory.createBevelBorder(1);
        jtaArea.setBorder(border);

        jsp = new JScrollPane(jtaArea);
        this.setLayout(null);
        jlSearchID.setBounds(10, 10, 80, 30);
        jtfSearchID.setBounds(90, 10, 100, 30);
        jbSearchID.setBounds(220, 10, 160, 30);
        jlSearchName.setBounds(10, 50, 80, 30);
        jtfSearchName.setBounds(90, 50, 100, 30);
        jbSearchName.setBounds(220, 50, 160, 30);

        jl.setBounds(2, 95, 590, 20);
        jsp.setBounds(1, 120, 595, 330);
        this.add(jlSearchID);
        this.add(jtfSearchID);
        this.add(jbSearchID);
        this.add(jlSearchName);
        this.add(jtfSearchName);
        this.add(jbSearchName);
        this.add(jl);
        this.add(jsp);

        jbSearchID.addActionListener(new Listeners());
        /********* ע�ᰴ�������� �¼�������  begin  *********
         ********* ע�ᰴ�������� �¼�������  end  *********/

        this.setSize(605, 500);
        this.setTitle("���ְ����Ϣ");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);

    }

    //������ʾ���
    public void updateEmployee()
    {
        List<Employee> userlist = Operatefile.readEm();
        jl.setText("  ���ְ����Ϣ, ��������" + String.valueOf(Employee.persons));
        String emstring = "";
        jtaArea.setText(null); //���
        for (Employee em : userlist)
        {
            emstring = "  " + em.getID() + "\n" + "  " + em.getName() + "\n" + "  " + em.getBorn() + "\n" + "  " + String.valueOf(em.getSalary()) + "\n" + "  " + em.getEmail();
            //System.out.println(emstring+"\n");
            jtaArea.append("-----------------\n" + emstring + "\n");
        }
    }
}
