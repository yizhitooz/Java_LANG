package step1;

import java.io.File;
import java.io.IOException;

public class Task
{
    /********* Begin *********/
    public void solution()
    {
        try
        {
            File file = new File("src/output/hello.txt");
            file.createNewFile();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        /********* End *********/
    }
}
