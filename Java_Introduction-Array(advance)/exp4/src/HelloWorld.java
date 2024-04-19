package step4;

import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //动态创建数组
        int[] arr = new int[sc.nextInt()];
        for(int i = 0 ; i< arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        /********** Begin **********/
        for (int i = 0; i < arr.length; i++)
        {
            int max_num = arr[i];
            int max_index = i;
            for (int j = i; j < arr.length; j++)
            {
                if (arr[j] > max_num)
                {
                    max_num = arr[j];
                    max_index = j;
                }
            }
            //System.out.println(min_index+":"+max_num);
            int temp = arr[i];
            arr[i] = arr[max_index];
            arr[max_index] = temp;
        }
        System.out.println(Arrays.toString(arr));
        /********** End **********/
    }
}
