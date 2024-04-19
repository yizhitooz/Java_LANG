package swingGUI;
/*
 * ����JTable��ʵ�ֱ��
 * �������Թ����ı��
 */

import javax.swing.JTable;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class TableDemo1 extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableDemo1 mytable=new TableDemo1();
	}
	
	public TableDemo1(){
		
		//�����������
		String[] columnNames={"A","B"};
		//��������������
		String[][] tableValues={{"A1","B1"},{"A2","B2"},{"A3","B3"},{"A4","B4"},{"A5","B5"},{"A6","B6"},{"A7","B7"}};
		//����ָ�����������ݵı��
		JTable table=new JTable(tableValues,columnNames);
		//������ʾ���Ĺ������
		JScrollPane scrollPane=new JScrollPane(table);
		
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
