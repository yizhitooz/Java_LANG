//package setp15;

/**
 * @author tangzhiqiang
 * @date 2018-04-25 22:31
 */
public class HelloWorld {
    public static void main(String[] args) {

        /********** Begin **********/
        // 调用无参的方法
        print();
        // 调用带有一个字符串参数的方法
        print("educoder");
        // 调用带有一个整型参数的方法
        print(666);
        /********** End **********/
    }

    /********** Begin **********/
    // 无参print方法的定义
    public static void print()
    {
        System.out.println("无参的print方法");
    }
    // 字符串print方法的定义
    public static void print(String parameter)
    {
        System.out.println("带有一个字符串参数的print方法，参数值为："+parameter);
    }
    // 整型print方法的定义
    public static void print(int parameter)
    {
        System.out.println("带有一个整型参数的print方法，参数值为："+parameter);
    }
    /********** End **********/
}