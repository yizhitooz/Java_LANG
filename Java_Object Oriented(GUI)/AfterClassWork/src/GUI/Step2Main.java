package GUI;

import java.awt.*;

public class Step2Main
{
    public static void main(String[] args)
    {
        JavaWindows jw = new JavaWindows(400, 150,/*,Color.white*/"��Ա��¼ϵͳ");
        jw.setLayout(new GridLayout(4, 1));
        Panel[] panels = new Panel[3];
        for (int i = 0; i < panels.length; i++)
        {
            panels[i] = new Panel();
        }
        panels[0].add(new Label("����Ա"));
        panels[0].add(new TextField(25));
        panels[1].add(new Label("����"));
        panels[1].add(new TextField(25));
        panels[2].add(new Button("ȷ��"));
        panels[2].add(new Button("ȡ��"));
        for (int i = 0; i < panels.length; i++)
        {
            jw.add(panels[i]);
        }
        jw.setVisible(true);
    }
}
