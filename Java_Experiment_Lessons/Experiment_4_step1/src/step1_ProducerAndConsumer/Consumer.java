package step1_ProducerAndConsumer;

public class Consumer extends Thread
{
    Product product;
    Boolean isTerminated = false;

    public Consumer(Product P)
    {
        this.product = P;
    }


    public void run()
    {
        while (true/*isTerminated == false*/)
        {
            this.product.consume();
        }
    }
}
