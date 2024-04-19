package swingGUI;
/*
 * 利用JTable类实现表格
 * 创建可以滚动的表格
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
		
		//定义表格的列名
		String[] columnNames={"A","B"};
		//定义表格数据数组
		String[][] tableValues={{"A1","B1"},{"A2","B2"},{"A3","B3"},{"A4","B4"},{"A5","B5"},{"A6","B6"},{"A7","B7"}};
		//创建指定列名和数据的表格
		JTable table=new JTable(tableValues,columnNames);
		//创建显示表格的滚动面板
		JScrollPane scrollPane=new JScrollPane(table);
		
		//将滚动条添加到容器中间
		this.add(scrollPane,BorderLayout.CENTER);
		
		//设置窗体属性
		this.setTitle("可以滚动的表格");
		this.setBounds(100, 100, 240, 150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
		this.setResizable(false); //禁止用户改变窗口大小		
		//显示窗体
		this.setVisible(true);	
	}

}
