package employeeinfo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

public class Listeners implements ActionListener
{
    static AddEmployeeWindow addEmUI = null;
    static ShowEmployeeWindow showEmUI = null;
    static OperateEmployWindow modfyEmUI = null;

    @Override
    public void actionPerformed(ActionEvent e)
    {
        // TODO Auto-generated method stub
        if (e.getActionCommand().equals("���"))
        {
            addEmUI = new AddEmployeeWindow();
            addEmUI.init();
            System.out.println("���ְ��");
        }
        if (e.getActionCommand().equals("ȷ�����"))
        {
            System.out.println("ȷ�����ְ��");
            addEmUI.addEmployee();
        }
        if (e.getActionCommand().equals("���"))
        {
            System.out.println("���ְ����Ϣ");
            showEmUI = new ShowEmployeeWindow();
        }
        if (e.getActionCommand().equals("��ID����"))
        {
            String ID = showEmUI.jtfSearchID.getText().trim();
            Employee em = Operatefile.searchObjID(ID);
            System.out.println("��ID����ְ����Ϣ,ID:" + ID);
            modfyEmUI = new OperateEmployWindow(em, ID, null);
        }
        /************ ���������� begin ************
         ************* ���������� end   ***********/

        if (e.getActionCommand().equals("ȷ���޸�"))
        {
            /*****  �޸��ļ�����  begin 	******
             *****  �޸��ļ�����  begin 	******/
        }
        if (e.getActionCommand().equals("ȷ��ɾ��"))
        {
            List<Employee> userlist = Operatefile.readEm();
            String ID = showEmUI.jtfSearchID.getText().trim();
            int index = Operatefile.searchIndexID(ID);
            if (index != -1)
            {
                userlist.remove(index);
                Employee.persons--;
                Operatefile.writeEm(userlist);
                showEmUI.updateEmployee(); //������ʾ���
                JOptionPane.showMessageDialog(null, "ɾ���ɹ�", "��Ϣ��Ϣ��ʾ��", JOptionPane.INFORMATION_MESSAGE);


                System.out.println("ɾ��Ա����ţ�" + (index + 1)); //����
            }
        }
    }
}
