import javax.swing.*;
import java.awt.*;

public class MyTriangleFrame extends JFrame
{
    JLabel jl_a = new JLabel("其中一边：");
    JTextField jtf_a = new JTextField(5);
    JLabel jl_b = new JLabel("其中一边：");
    JTextField jtf_b = new JTextField(5);
    JLabel jl_c = new JLabel("其中一边：");
    JTextField jtf_c = new JTextField(5);
    JButton jb = new JButton("确认");
    JTextField jtf_message = new JTextField(40);
    JLabel jl_circumference = new JLabel("周长:");
    JLabel jl_area = new JLabel("面积");
    JTextField jtf_circumference = new JTextField(5);
    JTextField jtf_area = new JTextField(5);

    MyTriangleFrame()
    {
        setTitle("计算三角形相关参数");
        setSize(500, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel p1 = new JPanel();
        p1.add(jl_a);
        p1.add(jtf_a);
        p1.add(jl_b);
        p1.add(jtf_b);
        p1.add(jl_c);
        p1.add(jtf_c);
        p1.add(jb);
        this.add(p1);
        JPanel p2 = new JPanel();
        p2.add(jl_circumference);
        p2.add(jtf_circumference);
        p2.add(jl_area);
        p2.add(jtf_area);
        this.jb.addActionListener(e ->
        {
            TriAngle t = new TriAngle();
            try
            {
                t.a = Double.parseDouble(jtf_a.getText());
                t.b = Double.parseDouble(jtf_b.getText());
                t.c = Double.parseDouble(jtf_c.getText());
                if (t.a > 0 && t.b > 0 && t.c > 0)
                {
                    if (t.a + t.b <= t.c || t.a + t.c <= t.b || t.b + t.c <= t.a)
                    {
                        throw new MyException(this, "提示:三边不满足构建三角形的要求");
                    } else
                    {
                        t.getCircumference();
                        jtf_circumference.setText(String.format("%.2f", t.circumference));
                        t.getArea();
                        jtf_area.setText(String.format("%.2f", t.area));
                        jtf_message.setText(null);
                    }
                } else
                {
                    try
                    {
                        throw new MyException(this, "提示:输入了负数");
                    } catch (MyException ex)
                    {
                        throw new RuntimeException(ex);
                    }
                }
            }catch (NumberFormatException n)
            {
                jtf_message.setText("提示:输入了非数字");
            } catch (MyException ex)
            {
                throw new RuntimeException(ex);
            }

        });
        Panel p3 = new Panel();
        p3.add(jtf_message);
        p1.add(jb);
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.setVisible(true);
    }
}
