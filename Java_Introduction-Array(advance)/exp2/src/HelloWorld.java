package step2;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //strΪҪ���ҵ��ַ���
        String str = sc.next();
        /********** Begin **********/
        //��������   arr  �����鸳ֵ {"����","������","���޼�","��������","�Ÿ���"}
        String arr[] = {"����","������","���޼�","��������","�Ÿ���"};
        for (int i = 0; i < arr.length; i++)
        {
            if(str.equals(arr[i]))
            {
                System.out.println(str+"������ĵ�"+(i+1)+"��λ��");
                break;
            }
            else if (i == arr.length -1)
            {
                System.out.println("not found");
            }
        }
        /********** End **********/
    }
}
