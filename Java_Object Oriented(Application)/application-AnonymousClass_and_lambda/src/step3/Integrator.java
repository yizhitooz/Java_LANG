package step3;

public class Integrator
{

    private double precision = 1e-3;
    private IFun func;

    public Integrator(IFun func)
    {
        // TODO Auto-generated constructor stub
        this.func = func;
    }

    /**
     * 计算区间[down , up]上的定积分，请根据提示在begin-end之间完成代码补充
     */
    public double compute(double down, double up)
    {
        double res = 0;
        double x = down;
        double val0 = func.fun(x);

        while (x < up)
        {
            x += this.precision;
            //begin
            //setPrecision(1e-3);
            val0= func.fun(x);
            res+=(val0+func.fun(down))*precision/2;
            down = x;
            //end
        }
        return res;
    }

    public double getPrecision()
    {
        return precision;
    }

    public void setPrecision(double precision)
    {
        assert precision > 1e-6;
        this.precision = precision;
    }

}

