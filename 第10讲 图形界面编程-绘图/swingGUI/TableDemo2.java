package swingGUI;
import java.awt.BorderLayout;

/*
 * ���ñ��ģ��DefaultTableModel�������
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class TableDemo2 extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableDemo2 tableFrame=new TableDemo2();
	}

	public TableDemo2(){
		
		//�����������
		String[] columnNames={"A","B"};
		//��������������
		String[][] tableValues={{"A1","B1"},{"A2","B2"},{"A3","B3"},{"A4","B4"},{"A5","B5"},{"A6","B6"},{"A7","B7"}};
		//����ָ�����������ݵı��ģ��
		DefaultTableModel tableModel=new DefaultTableModel(tableValues, columnNames);
		//����ָ�����ģ�͵ı��
		JTable table=new JTable(tableModel);
		
		//������ʾ���Ĺ������
		JScrollPane scrollPane=new JScrollPane(table);
		//��ʾ���������   û��������䣬������ʾ���������
		scrollPane.setViewportView(table);
		
		//����������ӵ������м�
		this.add(scrollPane,BorderLayout.CENTER);
		
		
		
		//���ô�������
		this.setTitle("���Թ����ı��");
		this.setBounds(100, 100, 240, 150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
		this.setResizable(false); //��ֹ�û��ı䴰�ڴ�С		
		//��ʾ����
		this.setVisible(true);	
	}
}
