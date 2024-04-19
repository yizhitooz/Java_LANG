package step3;

import java.io.File;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Task task = new Task();
        Scanner sc = new Scanner(System.in);
        String dir = sc.next();
        //String dir = "src/step3/root";
        File file = new File(dir);
        task.showDirStructure(file);
    }
}
