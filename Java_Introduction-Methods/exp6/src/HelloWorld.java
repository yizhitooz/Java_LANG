//package setp15;

/**
 * @author tangzhiqiang
 * @date 2018-04-25 22:31
 */
public class HelloWorld {
    public static void main(String[] args) {

        /********** Begin **********/
        // �����޲εķ���
        print();
        // ���ô���һ���ַ��������ķ���
        print("educoder");
        // ���ô���һ�����Ͳ����ķ���
        print(666);
        /********** End **********/
    }

    /********** Begin **********/
    // �޲�print�����Ķ���
    public static void print()
    {
        System.out.println("�޲ε�print����");
    }
    // �ַ���print�����Ķ���
    public static void print(String parameter)
    {
        System.out.println("����һ���ַ���������print����������ֵΪ��"+parameter);
    }
    // ����print�����Ķ���
    public static void print(int parameter)
    {
        System.out.println("����һ�����Ͳ�����print����������ֵΪ��"+parameter);
    }
    /********** End **********/
}