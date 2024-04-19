package step3;

import java.io.File;
import java.util.Arrays;

public class Task
{
    /********** Begin **********/
    static int depth = 0;

    public void showDirStructure(File file)
    {
        int temp = depth;
        for (int i = 0; i < depth; i++)
        {
            System.out.print("  ");
        }
        System.out.println("+--" + file.getName());
        File[] files = file.listFiles();
        Arrays.sort(files);
        for (File f : files)
        {
            if (f.isDirectory())
            {
                depth += 1;
                Task t = new Task();
                t.showDirStructure(f);
                depth = temp;
            } else
            {
                for (int i = 0; i < depth + 1; i++)
                {
                    System.out.print("  ");
                }
                System.out.println("--" + f.getName());
            }
        }
    }


    /********** End **********/
}
