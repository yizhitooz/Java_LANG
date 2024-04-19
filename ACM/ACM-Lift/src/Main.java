import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int testGroup = scanner.nextInt();
        Lift A[] = new Lift[testGroup];
        Lift B[] = new Lift[testGroup];
        for (int i = 0; i < testGroup; i++)
        {
            A[i]=new Lift();
            A[i].start = scanner.nextInt();
            A[i].target = scanner.nextInt();
            A[i].getDistance();
            B[i]=new Lift();
            B[i].start = scanner.nextInt();
            B[i].target = scanner.nextInt();
            B[i].getDistance();
        }
        for (int i = 0; i < testGroup; i++)
        {
            if (A[i].distance < B[i].distance)
            {
                System.out.println('1');
            } else if (A[i].distance > B[i].distance)
            {
                System.out.println('2');
            } else
                System.out.println('0');
        }
    }

}

class Lift
{
    int start;
    int target;
    int distance;

    Lift(int s, int t)
    {
        this.start = s;
        this.target = t;
    }
    Lift()
    {
        this.start=-1;
        this.target=-1;
    }

    void getDistance()
    {
        if (start==-1)
        {
            distance=target;
        }else if(start>target)
        {
            distance=start;
        } else if (start<target)
        {
            distance=2*target-start;
        }
    }

    enum state
    {keep, up, down}

}

