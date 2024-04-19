public class MyException extends Exception
{
    String message;

    public MyException(MyTriangleFrame mtf, String message)
    {
        mtf.jtf_message.setText(message);
        this.message = message;
        mtf.jtf_circumference.setText(null);
        mtf.jtf_area.setText(null);
    }
}
