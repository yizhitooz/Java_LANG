package step1;
//ShapeException.java,�����������ShapeException�Ķ���,��ʾ�����쳣�������Exception��Ϊ�丸�࣬�Ӷ����ٴ��롣
//��Ҫ��ϲ���MainClass.java�еĴ���
public class ShapeException extends Exception
{
    public ShapeException()
    {
        System.out.println("�û���С����λ");
    }

    public ShapeException(String msg)
    {
        super(msg);
    }
}
