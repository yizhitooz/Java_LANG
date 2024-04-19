import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Hello world!");
        int length = scanner.nextInt();
        int[] numbers=new int[length];
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i]=scanner.nextInt();
        }
        //System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        int sum=0;
        for (int item:
             numbers)
        {
            if (item < 0)
            {
                sum+=-(item);
            }else
            {
                sum+=item;
            }
        }
        System.out.println(sum);
    }
}