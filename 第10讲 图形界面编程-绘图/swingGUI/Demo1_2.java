package swing.layout;
/*
*    ͼ���û����� - ����
*    import javax.swing.*;
*/
import java.awt.*;
import javax.swing.*; //����Ҫʹ��JFrame��

/*
 * ͨ���������ǣ�ʹҪ������������ΪJFrame�������࣬���������Ϳ��Դ�������
 */
public class Demo1_2 extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1_2 window=new Demo1_2();
	}
	
	public Demo1_2(){
		this.setTitle("swing����");
		this.setSize(800, 600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
