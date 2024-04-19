package step1_ProducerAndConsumer;

public class Producer extends Thread
{
    Product product;
    Boolean isTerminated = false;

    public Producer(Product P)
    {
        this.product=P;
    }


    public void run()
    {
        while (true/*isTerminated == false*/)
        {
            this.product.produce();
        }
    }

    public void setProduct(Product product)
    {
        this.product = product;
    }

    void Terminate()
    {
        this.isTerminated = true;
    }
}
