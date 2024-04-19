package step3;

public class MainClass
{

    public static void main(String[] args)
    {
        //���ڣ�1����2����������룬ʹ�������12�п������ f(x)=sin(x)��[0,pi/2]�ϵĻ���
        //�������������������ʽ
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
        //�벹�䣨3�����Ĵ��룬������lambda���ʽ������lambda���ʽ�������ɻ��ǻ�����ѧƽ̨���ṩ��ѧϰ���ϣ������ѧ��
        //����������ȷ�����һ���������f(x)=sin(x*x+10)��[0,3*pi]�ϵĶ�����
        IFun fun2 = x ->
        {
            return Math.sin(x * x + 10);
        };
        integrator = new Integrator(fun2);
        res = integrator.compute(0, 3 * Math.PI);
        System.out.printf("%.4f\n", res);
    }

}

