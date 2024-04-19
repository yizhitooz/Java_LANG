package employeeinfo;
/*
 * 对文件（数据库）的增、删、改、查、显示操作
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class Operatefile
{
    static String filename = "D:/Employee.txt";
    static List<Employee> userlist = new ArrayList<Employee>();

    public static void writeEm(List<Employee> userlist)
    {
        try
        {
            ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(filename));
            oout.writeObject(userlist); //对象的序列化
            oout.close();
        } catch (Exception e)
        {
            System.out.println("写对象错误");
        }
    }

    public static List<Employee> readEm()
    {
        try
        {
            ObjectInputStream oin = new ObjectInputStream(new FileInputStream(filename));
            userlist = (List<Employee>) oin.readObject(); //将输入流转换为对象(对象的反序列化)
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        Employee.persons = userlist.size();
        return userlist;
    }

    public static void appendEm(Employee em)
    {
        userlist = readEm();
        userlist.add(em);
        try
        {
            ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(filename));
            oout.writeObject(userlist); //对象的序列化
            oout.close();
        } catch (Exception e)
        {
            System.out.println("写对象错误");
        }
    }

    public static Employee searchObjID(String ID)
    {
        System.out.println("searchObjID");
        userlist = readEm();
        System.out.println("现有人数：" + userlist.size());
        for (int index = 0; index < userlist.size(); index++)
        {
            if (userlist.get(index) != null)
            {
                System.out.println(userlist.get(index).getID());
                if (userlist.get(index).getID() != null && userlist.get(index).getID().equals(ID))
                    return userlist.get(index);
            }
        }
        System.out.println("没找到");
        return null;
    }

    public static int searchIndexID(String ID)
    {
        userlist = readEm();
        int i;
        for (i = 0; i < userlist.size(); i++)
        {
            if (userlist.get(i).getID().equals(ID))
                return i;
        }
        return -1;
    }

    public static void showUserList()
    {
        userlist = readEm();
        if (userlist != null)
        {
            for (Employee em : userlist)
            {
                em.showEmployee();
            }
        }
    }
}
