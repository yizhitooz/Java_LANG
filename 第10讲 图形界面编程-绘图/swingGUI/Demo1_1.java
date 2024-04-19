package swingGUI;
/*
 *    图形用户界面 - 窗体
 *    import javax.swing.*;
 *    具体：新建窗体，设置窗体标题，设置窗体大小，让窗体可见，设置窗体背景色，设置窗体图标
 */

import java.awt.*;
import javax.swing.*; //后面要使用JFrame类

public class Demo1_1
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        //JFrame是一个顶层容器类（可以添加其他swing组件的类）
        JFrame jf = new JFrame();

        //设置窗体标题
        jf.setTitle("Swing窗体");

        //设置窗体图标
        //注意下局中双引号中的图像文件目录，从当前java文件的上级目录的上级目录名（这里是src）开始写
        jf.setIconImage(new ImageIcon("src/swingGUI/images/Animal11.jpg").getImage());

        //设置窗体大小，(宽，高)按像素
        jf.setSize(300, 200);

        //设置窗体初始位置，如不设置初始位置，窗体的原点为屏幕左上角
        jf.setLocation(100, 100);

        //jf.getContentPane().setVisible(false);		//将窗体的内容面板设置为不可见
        jf.setBackground(Color.BLACK);           //设置窗体背景颜色为黑色

        //显示窗体
        jf.setVisible(true);

        //关闭窗体的时候，保证jvm也退出。
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
