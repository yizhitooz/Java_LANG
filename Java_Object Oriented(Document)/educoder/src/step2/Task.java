package step2;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Arrays;


public class Task
{
    public static void dcFile() throws IOException
    {

        /********* Begin *********/

        File file = new File("src/test2");
        file.mkdir();
        file = new File("src/test2/helloworld.txt");
        file.createNewFile();
        file = new File("src/test2/step2.txt");
        file.createNewFile();
        file = new File("src/output/test2.txt");
        file.delete();

        System.out.println("outputĿ¼�ṹΪ��");
        File dir = new File("src/output");
        File[] files = dir.listFiles();
        for (File _file : files)
        {
            System.out.println(_file.getName());
        }
        System.out.println("test2Ŀ¼�ṹΪ��");
        dir = new File("src/test2");
        files = dir.listFiles();
        for (File _file : files)
        {
            System.out.println(_file.getName());
        }

        /********* End *********/
    }
}
