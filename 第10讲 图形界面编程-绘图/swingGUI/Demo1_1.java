package swingGUI;
/*
 *    ͼ���û����� - ����
 *    import javax.swing.*;
 *    ���壺�½����壬���ô�����⣬���ô����С���ô���ɼ������ô��屳��ɫ�����ô���ͼ��
 */

import java.awt.*;
import javax.swing.*; //����Ҫʹ��JFrame��

public class Demo1_1
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        //JFrame��һ�����������ࣨ�����������swing������ࣩ
        JFrame jf = new JFrame();

        //���ô������
        jf.setTitle("Swing����");

        //���ô���ͼ��
        //ע���¾���˫�����е�ͼ���ļ�Ŀ¼���ӵ�ǰjava�ļ����ϼ�Ŀ¼���ϼ�Ŀ¼����������src����ʼд
        jf.setIconImage(new ImageIcon("src/swingGUI/images/Animal11.jpg").getImage());

        //���ô����С��(����)������
        jf.setSize(300, 200);

        //���ô����ʼλ�ã��粻���ó�ʼλ�ã������ԭ��Ϊ��Ļ���Ͻ�
        jf.setLocation(100, 100);

        //jf.getContentPane().setVisible(false);		//������������������Ϊ���ɼ�
        jf.setBackground(Color.BLACK);           //���ô��屳����ɫΪ��ɫ

        //��ʾ����
        jf.setVisible(true);

        //�رմ����ʱ�򣬱�֤jvmҲ�˳���
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
