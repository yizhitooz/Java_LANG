package GUI;

import java.awt.*;
import javax.swing.*;

public class JavaWindows extends JFrame
{
    JavaWindows(int width, int height,/*Color color,*/String title)
    {
        this.setSize(width, height);
        //this.setVisible(true);
        //this.setBackground(color);
        this.setTitle(title);
        FlowLayout fl = new FlowLayout();
        fl.setAlignment(FlowLayout.CENTER);
        this.setLayout(fl);
//        this.setLayout(new GridLayout(4, 1));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
