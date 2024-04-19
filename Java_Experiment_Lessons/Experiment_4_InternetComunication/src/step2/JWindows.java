package step2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;

public class JWindows extends JFrame
{
    static JTextArea display=new JTextArea();
    JTextArea write=new JTextArea();
    Date date = new Date();
    JWindows(String title)
    {
        this.setSize(600,300);
        this.setTitle(title);
        this.setLayout(new GridLayout(2,1));
        this.add(display);
        write.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyTyped(KeyEvent e)
            {
                if ((char)e.getKeyChar()==KeyEvent.VK_ENTER)
                {

                }
            }
        });
        this.add(write);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setDisplay(String s)
    {
        String st = display.getText();
        display.setText(st+"\n"+date+"\n"+s);
    }
}
