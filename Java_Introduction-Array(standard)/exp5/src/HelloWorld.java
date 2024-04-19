package step4;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args)
    {
        /********** Begin **********/
        //int a = 2,b = 6;
        //int[][] numbers = new int[a][b];
        //Scanner input = new Scanner(System.in);
        int[][] numbers = {{92,85,91,65,90,33},{1,2,1,2,1,2}};
        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = 0; j < numbers[i].length; j++)
            {
                System.out.println(numbers[i][j]);
            }
        }
        /********** End **********/
    }
}
