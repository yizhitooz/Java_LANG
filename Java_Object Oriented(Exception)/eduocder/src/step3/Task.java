package step3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task {
    /********* Begin *********/
    //���ں��ʵĲ�λ��Ӵ���
    public static void main(String[] args) throws FileNotFoundException
    {
        test();
    }
    public static void test() throws FileNotFoundException
    {
        File file = new File("abc");
        if(!file.exists()){		//�ж��ļ��Ƿ����
            //�ļ������ڣ��� �׳� �ļ��������쳣
            throw new FileNotFoundException("���ļ�������");
        }else{
            FileInputStream fs = new FileInputStream(file);
        }
    }
    /********* End *********/
}



