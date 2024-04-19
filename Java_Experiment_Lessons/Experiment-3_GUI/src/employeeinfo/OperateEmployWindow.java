package employeeinfo;
/*
 * ��ѯ���
 * �޸�
 * ɾ��
 */

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class OperateEmployWindow extends JFrame
{
    JLabel jl = null;
    JLabel jlID = null;
    JLabel jlname = null;
    JLabel jlborn = null;
    JLabel jlsalary = null;
    JLabel jlemail = null;
    JTextField jtfID = null;
    JTextField jtfname = null;
    JTextField jtfborn = null;
    JTextField jtfsalary = null;
    JTextField jtfemail = null;
    JPanel jp1 = null;
    JPanel jp2 = null;
    JPanel jp3 = null;
    JPanel jp4 = null;
    JPanel jp5 = null;
    JButton modify = null;
    JButton remove = null;

    public OperateEmployWindow(Employee em, String ID, String name)
    {
        if (em == null)
        {
            jl = new JLabel("  ��ѯ�����");
            String message = "  ������ ID Ϊ  " + ID + "  ��ְ��.";
            JOptionPane.showMessageDialog(null, message, "��Ϣ��Ϣ��ʾ��", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            jl = new JLabel("  ����޸�ְ����Ϣ��������Ա������Ϣ��");
            jlID = new JLabel("ID:");
            jtfID = new JTextField(20);
            jtfID.setText(em.getID());
            jtfID.setEnabled(false);

            jlname = new JLabel("������");
            jtfname = new JTextField(20);
            jtfname.setText(em.getName());

            jlborn = new JLabel("�������£�");
            jtfborn = new JTextField(20);
            jtfborn.setText(em.getBorn());

            jlsalary = new JLabel("���ʣ�");
            jtfsalary = new JTextField(20);
            jtfsalary.setText(String.valueOf(em.getSalary()));

            jlemail = new JLabel("Email��");
            jtfemail = new JTextField(20);
            jtfemail.setText(em.getEmail());


            modify = new JButton("ȷ���޸�");
            remove = new JButton("ȷ��ɾ��");
            jp1 = new JPanel();
            jp2 = new JPanel();
            jp3 = new JPanel();
            jp4 = new JPanel();
            jp5 = new JPanel();

            jp1.add(jlID);
            jp1.add(jtfID);
            jp2.add(jlname);
            jp2.add(jtfname);
            jp3.add(jlborn);
            jp3.add(jtfborn);
            jp4.add(jlsalary);
            jp4.add(jtfsalary);
            jp5.add(jlemail);
            jp5.add(jtfemail);

            this.setLayout(new GridLayout(7, 1, 0, 3));
            this.add(jl);
            this.add(jp1);
            this.add(jp2);
            this.add(jp3);
            this.add(jp4);
            this.add(jp5);
            JPanel jp = new JPanel();
            jp.add(modify);
            jp.add(remove);
            this.add(jp);
            modify.addActionListener(new Listeners());
            remove.addActionListener(new Listeners());

            this.setSize(400, 300);
            this.setTitle("�޸ġ�ɾ��ְ����Ϣ");
            this.setLocationRelativeTo(null); //���ô��������ʾ

            this.setVisible(true);
            this.setResizable(false);
            this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        }
    }
}
