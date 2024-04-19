package swingGUI;

import javax.swing.*;import java.awt.*;
import java.awt.event.*;
public class JTableExample {
   public static void main(String args[]) {
       WinTable Win=new WinTable();  
   }
}
class WinTable extends JFrame implements ActionListener {
   JTable table;Object a[][];
   Object name[]={"姓名","英语成绩","数学成绩","总成绩"};
   JButton button;
   WinTable() {
      a=new Object[8][4];
      for(int i=0;i<8;i++) {
        for(int j=0;j<4;j++) {
           if(j!=0)
              a[i][j]="0";
           else
              a[i][j]="姓名";
        }
     }
     button=new JButton("计算每人总成绩");
     table=new JTable(a,name);  //第一个参数是表中各记录，是一个二维数组；第二个参数是各列的名称（及各属性名称），是一个一维数组
     button.addActionListener(this);
     Container con=getContentPane();
     con.add(new JScrollPane(table),BorderLayout.CENTER);
     
     JPanel jp=new JPanel(new GridLayout(2,1));
     JLabel mention=new JLabel("           修改或录入数据后,需回车确认");
     jp.add(new JPanel());
     jp.add(mention);    
     con.add(jp,BorderLayout.NORTH);
     
     con.add(button,BorderLayout.SOUTH);
     setSize(400,600);
     setVisible(true);
     validate();
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  } 
  public void actionPerformed(ActionEvent e) {
     for(int i=0;i<8;i++) {
        double sum=0;
        boolean boo=true;
        for(int j=1;j<=2;j++){
             try{  sum=sum+Double.parseDouble(a[i][j].toString());
             }
             catch(Exception ee){
                  boo=false;
                  table.repaint();
             }
             if(boo==true) {
                a[i][3]=""+sum;
                table.repaint();
             }
        }
     } 
  }
}
