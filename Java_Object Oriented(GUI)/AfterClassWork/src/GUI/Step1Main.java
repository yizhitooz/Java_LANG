package GUI;

import javax.swing.*;
import java.awt.*;

public class Step1Main
{
    public static void main(String[] args)
    {
        //��д�˹��췽��
        JavaWindows jw = new JavaWindows(500, 300,/*,Color.white*/"�������");
        //Ϊ�˱�ݲ������������������鲢��ʼ��
        Panel[] panel = new Panel[4];
        for (int i = 0; i < panel.length; i++)
        {
            panel[i] = new Panel();
        }
        //������һ������
//        Label label1_1 = new Label("�ı���");
//        Label label1_2 = new Label("��ť");
//        TextField tf1 = new TextField(25);
//        Button but1_1 = new Button("ȷ��");
        panel[0].add(new Label("�ı���"));
        panel[0].add(new TextField(25));
        panel[0].add(new Label("��ť"));
        panel[0].add(new Button("ȷ��"));
        //�����ڶ�������
        //Label[] label2 = new Label[3];
        String hobby[] = {"ϲ������", "ϲ������", "ϲ������"};
        panel[1].add(new Label("��ѡ��"));
        ButtonGroup buttonGroup = new ButtonGroup();
        for (int i = 0; i < hobby.length; i++)
        {
            //label2[i] = new Label(hobby[i]);
            panel[1].add(new Checkbox(hobby[i]));
            //panel[1].add(label2[i]);
        }
        //�������������
        panel[2].add(new Label("��ѡ��ť"));
        ButtonGroup bg = new ButtonGroup();
        String[] sex = {"��", "Ů"};
        for (int i = 0; i < sex.length; i++)
        {
            JRadioButton jrb = new JRadioButton(sex[i]);
            panel[2].add(jrb);
            bg.add(jrb);
        }
        panel[2].add(new Label("�����б�"));
        Choice choice = new Choice();
        String[] clist = {"�������", "����֮��", "������ֲ�"};
        for (int i = 0; i < clist.length; i++)
        {
            choice.add(clist[i]);
        }
        panel[2].add(choice);
        //������ĸ�����
        panel[3].add(new Label("�ı���"));
        panel[3].add(new TextArea(5, 20));
        //�����������ײ�����
//        jw.add(panel[0]);
//        jw.add(panel[1]);
//        jw.add(panel[2]);
        for (int i = 0; i < panel.length; i++)
        {
            jw.add(panel[i]);
        }
        jw.setVisible(true);
    }
}