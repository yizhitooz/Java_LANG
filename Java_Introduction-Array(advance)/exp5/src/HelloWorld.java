package step5;

import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //��̬��������
        int[] arr = new int[sc.nextInt()];
        for(int i = 0 ; i< arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        /********** Begin **********/
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length-i-1; j++)
            {
                if (arr[j] >=arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        /********** End **********/
    }
}
