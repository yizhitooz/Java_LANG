package step1_ProducerAndConsumer;

import javax.swing.*;
import java.awt.*;

public class MainWPC
{
    public static void main(String[] args)
    {
        JTextField infoCout = new JTextField("库存:00");
        //infoCout.setSize(20,100);
        JProgressBar jpb = new JProgressBar();
        JTextField infoTotal = new JTextField("一共生产的商品个数:000");
        //infoTotal.setSize(20,100);
        Product product = new Product(infoCout, infoTotal, jpb);
        //product.run();
        JFrame windowsPC = new JFrame("消费生产演示程序");
        windowsPC.setSize(500,700);
        windowsPC.setLayout(new GridLayout(1, 2));
        //左侧
        Panel pLeft = new Panel();
        pLeft.setLayout(new FlowLayout());
        product.setTxtCout(product.txtCout);
        pLeft.add(product.txtCout);
        JProgressBar jpbv = new JProgressBar(SwingConstants.VERTICAL);
        jpbv.setPreferredSize(new Dimension(200,500));
        product.setPrgBar(jpbv);
        pLeft.add(product.prgBar);
        product.setTxtTotal(product.txtTotal);
        pLeft.add(product.txtTotal);
        windowsPC.add(pLeft);
        //右侧
        Panel pRight = new Panel();
        pRight.setLayout(new FlowLayout(FlowLayout.LEFT,10,80));
        JButton p = new JButton("生产者开始生产");
        Producer producer1 = new Producer(product);
        pRight.add(p);
        p.addActionListener(e -> producer1.start());

        JButton c1 = new JButton("消费者1开始消费");
        Consumer consumer1 = new Consumer(product);
        pRight.add(c1);
        c1.addActionListener(e -> consumer1.start());

        JButton c2 = new JButton("消费者2开始消费");
        Consumer consumer2 = new Consumer(product);
        pRight.add(c2);
        c2.addActionListener(e -> consumer2.start());

        pRight.add(c2);
        JButton c3 = new JButton("消费者3开始消费");
        Consumer consumer3 = new Consumer(product);
        pRight.add(c3);
        c3.addActionListener(e -> consumer3.start());

        windowsPC.add(pRight);

        windowsPC.setVisible(true);
    }
}
