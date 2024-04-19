package step1_ProducerAndConsumer;

import javax.swing.*;

public class Product extends Thread
{
    JTextField txtCout;
    JTextField txtTotal;
    JProgressBar prgBar;
    int totalNum = 0;
    int keepStock=50;


    public synchronized void produce()
    {
        try
        {
            Thread.sleep(50);//控制产品的生产速度
        } catch (InterruptedException e1)
        {
            //throw new RuntimeException(e);
        }
        totalNum++;
        this.prgBar.setValue(this.prgBar.getValue() + 1);
        this.txtTotal.setText("一共生产的商品个数:" + Integer.toString(totalNum));
        this.txtCout.setText("库存:" + this.prgBar.getValue());
        System.out.println("生产ing");
        this.notifyAll();
        while (this.prgBar.getValue() > this.keepStock)
        {
            try
            {
                System.out.println("生产者睡觉ing");
                this.wait();
            } catch (InterruptedException e1)
            {
                //throw new RuntimeException(e);
            }
        }
    }

    public synchronized void consume()
    {
        while (this.prgBar.getValue() < this.keepStock)
        {
            try
            {
                System.out.println("消费者睡觉ing");
                this.wait();
            } catch (InterruptedException e)
            {
                //throw new RuntimeException(e);
            }
        }
        this.prgBar.setValue(this.prgBar.getValue() - 1);
        this.txtCout.setText("库存:" + this.prgBar.getValue());
        System.out.println("消费ing");
        this.notifyAll();
        //System.out.println("消费者:可以生产了");
    }

    public Product(JTextField txtCout, JTextField txtTotal, JProgressBar prgBar)
    {
        this.setTxtCout(txtCout);
        this.setTxtTotal(txtTotal);
        this.setPrgBar(prgBar);

    }

    public void setTxtCout(JTextField txtCout)
    {
        this.txtCout = txtCout;
    }

    public void setPrgBar(JProgressBar prgBar)
    {
        this.prgBar = prgBar;
    }

    public void setTxtTotal(JTextField txtTotal)
    {
        this.txtTotal = txtTotal;
    }

}
