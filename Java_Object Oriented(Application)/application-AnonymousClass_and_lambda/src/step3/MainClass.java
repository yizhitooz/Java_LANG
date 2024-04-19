package step3;

public class MainClass
{

    public static void main(String[] args)
    {
        //请在（1）（2）处补充代码，使得下面第12行可以输出 f(x)=sin(x)在[0,pi/2]上的积分
        //这里必须采用匿名类对象方式
        IFun fun1 = new IFun()
        {
            @Override
            public double fun(double x)
            {
                return Math.sin(x);
            }
        };
        Integrator integrator = new Integrator(fun1);
        double res = integrator.compute(0, Math.PI / 2.0);
        System.out.printf("%.3f\n", res);
        //请补充（3）处的代码，必须用lambda表达式，关于lambda表达式，课堂派或智慧树教学平台都提供了学习资料，务必自学。
        //补充代码务必确保最后一条代码输出f(x)=sin(x*x+10)在[0,3*pi]上的定积分
        IFun fun2 = x ->
        {
            return Math.sin(x * x + 10);
        };
        integrator = new Integrator(fun2);
        res = integrator.compute(0, 3 * Math.PI);
        System.out.printf("%.4f\n", res);
    }

}

