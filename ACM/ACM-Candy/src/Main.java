import java.util.Scanner;

// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ע�� hasNext �� hasNextLine ������
        int length = in.nextInt();
        String str = in.next();

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i)=='N' ||str.charAt(i)== 'n')
            {
                System.out.print("Yes");
            }
            else
                System.out.print(str.charAt(i));
        }
    }
}