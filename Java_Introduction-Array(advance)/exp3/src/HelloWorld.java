package step3;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        /********** Begin **********/
        //��a��ֵ����b   b��ֵ����a
        int temp;
        temp = a;
        a = b;
        b = temp;
        /********** End **********/
        System.out.println(a);
        System.out.println(b);
    }

}
