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
            Thread.sleep(50);//���Ʋ�Ʒ�������ٶ�
        } catch (InterruptedException e1)
        {
            //throw new RuntimeException(e);
        }
        totalNum++;
        this.prgBar.setValue(this.prgBar.getValue() + 1);
        this.txtTotal.setText("һ����������Ʒ����:" + Integer.toString(totalNum));
        this.txtCout.setText("���:" + this.prgBar.getValue());
        System.out.println("����ing");
        this.notifyAll();
        while (this.prgBar.getValue() > this.keepStock)
        {
            try
            {
                System.out.println("������˯��ing");
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
                System.out.println("������˯��ing");
                this.wait();
            } catch (InterruptedException e)
            {
                //throw new RuntimeException(e);
            }
        }
        this.prgBar.setValue(this.prgBar.getValue() - 1);
        this.txtCout.setText("���:" + this.prgBar.getValue());
        System.out.println("����ing");
        this.notifyAll();
        //System.out.println("������:����������");
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
