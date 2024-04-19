package step1;
//ShapeException.java,请在其中完成ShapeException的定义,提示，该异常类可以用Exception作为其父类，从而减少代码。
//主要结合参阅MainClass.java中的代码
public class ShapeException extends Exception
{
    public ShapeException()
    {
        System.out.println("用户名小于三位");
    }

    public ShapeException(String msg)
    {
        super(msg);
    }
}
