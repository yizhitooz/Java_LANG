package swingGUI;

/*
 *    ��ִ��塪��JSplitPane
 */
import java.awt.*;
import javax.swing.*;

public class Dict extends JFrame{

	//�������
	JSplitPane jsp,jspr;
	JList jList1=null,jList2=null;
	JLabel jll;	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dict dict=new Dict();
	}

	public Dict(){
		//�������
		String []words={"boy","girl","bird","annoymous"};
		jList1=new JList<String>(words);
		jList2=new JList<String>(words);
		
		jll=new JLabel(new ImageIcon("src/images/veryhuo.com_28.gif"));		//�˴���images�͵�ǰjava�ļ��ĸ�Ŀ¼�ĸ�Ŀ¼ͬһ�����ļ�·������б��/�������\,��Ҫд����\\
		
		//��ִ���
		jspr=new JSplitPane(JSplitPane.VERTICAL_SPLIT,jList2,jll);  //�ұ߲��Ϊ����������
		jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jList1,jspr);  //�������ڲ��Ϊ����������
		//�����������Ҵ���
		jsp.setOneTouchExpandable(true);
		
		//������������һ��
		Container con=this.getContentPane();
		con.add(jsp);
		
		//����������������
		//this.add(jsp);
		
		//���ô�������
		this.setTitle("�е��ʵ�");
		this.setSize(400,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
		this.setResizable(false); //��ֹ�û��ı䴰�ڴ�С
				
				
		//��ʾ����
		this.setVisible(true);	
	}
}
