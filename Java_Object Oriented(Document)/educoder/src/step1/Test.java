package step1;

import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.List;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    static final List<String> strings = new ArrayList<String>(){{
        add("a.txt");add("b.txt");add("c.txt");add("test2.txt");
    }};

    public static void main(String[] args)throws Exception {
        String path = "src/output";
        File files = new File(path);
        if (!files.exists()){
            files.mkdirs();
        }

        for (String file:strings){
            if (!Arrays.asList(files.list()).contains(file)){
                File files1 = new File(path+"/"+file);
                files1.mkdirs();
            }
        }

        files.listFiles(new FileFilter(){

            @Override
            public boolean accept(File pathname) {

                if (!strings.contains(pathname.getName()))
                    pathname.delete();
                return true;
            }});

        Task task = new Task();

        task.solution();

        File file1 = new File("src/output/hello.txt");
        File file2 = new File("src/output/test.txt");
        if (file1.exists()) {
            System.out.println("hello.txt文件创建成功");
        }
        if (file2.exists()) {
            System.out.println("test.txt文件创建成功");
        }
    }

}