package swingGUI;
/*
 * 利用 监听器适配器类 (***Adapter)来实现java的事件处理。
 * 点击 关闭窗口，控制台输出“关闭”
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//定义监视器类
class MyWindowAdpager extends WindowAdapter{
   //处理器	
   public void windowClosing(WindowEvent e){//窗口正处在关闭过程中时调用   
       System.out.println("关闭");
       System.exit(0);
    }
}

public class EventWindowAdapter extends JFrame
{
   public EventWindowAdapter()
   {
       //注册事件源
       addWindowListener(new MyWindowAdpager());
    }
    public static void main(String[] agrs){
        JFrame frame = new EventWindowAdapter();
        frame.setSize(400,400);
        frame.setLocation(400,300);
        frame.setVisible(true);
    }
}