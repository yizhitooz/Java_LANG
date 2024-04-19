package GUI;

import javax.swing.*;
import java.awt.*;

public class Step1Main
{
    public static void main(String[] args)
    {
        //重写了构造方法
        JavaWindows jw = new JavaWindows(500, 300,/*,Color.white*/"常用组件");
        //为了便捷操作，创建了容器数组并初始化
        Panel[] panel = new Panel[4];
        for (int i = 0; i < panel.length; i++)
        {
            panel[i] = new Panel();
        }
        //构建第一个容器
//        Label label1_1 = new Label("文本框：");
//        Label label1_2 = new Label("按钮");
//        TextField tf1 = new TextField(25);
//        Button but1_1 = new Button("确定");
        panel[0].add(new Label("文本框："));
        panel[0].add(new TextField(25));
        panel[0].add(new Label("按钮"));
        panel[0].add(new Button("确定"));
        //构建第二个容器
        //Label[] label2 = new Label[3];
        String hobby[] = {"喜欢音乐", "喜欢旅游", "喜欢篮球"};
        panel[1].add(new Label("单选框："));
        ButtonGroup buttonGroup = new ButtonGroup();
        for (int i = 0; i < hobby.length; i++)
        {
            //label2[i] = new Label(hobby[i]);
            panel[1].add(new Checkbox(hobby[i]));
            //panel[1].add(label2[i]);
        }
        //构造第三个容器
        panel[2].add(new Label("单选按钮"));
        ButtonGroup bg = new ButtonGroup();
        String[] sex = {"男", "女"};
        for (int i = 0; i < sex.length; i++)
        {
            JRadioButton jrb = new JRadioButton(sex[i]);
            panel[2].add(jrb);
            bg.add(jrb);
        }
        panel[2].add(new Label("下拉列表"));
        Choice choice = new Choice();
        String[] clist = {"音乐天地", "旅游之家", "篮球俱乐部"};
        for (int i = 0; i < clist.length; i++)
        {
            choice.add(clist[i]);
        }
        panel[2].add(choice);
        //构造第四个容器
        panel[3].add(new Label("文本区"));
        panel[3].add(new TextArea(5, 20));
        //添加容器进入底层容器
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