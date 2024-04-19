import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
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