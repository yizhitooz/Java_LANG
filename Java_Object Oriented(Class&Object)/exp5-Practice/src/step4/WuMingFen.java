/********** Begin **********/
//在这里添加包名  step4
package step4;

import java.sql.SQLOutput;

//创建类 添加属性和方法
class WuMingFen
{
    String WMF_type;
    int WMF_amount;
    boolean WMF_isWithSoup;

    public WuMingFen(String type, int amount, boolean soup)
    {
        WMF_type = type;
        WMF_amount = amount;
        WMF_isWithSoup = soup;
    }

    public WuMingFen(String type, int amount)
    {
        WMF_type = type;
        WMF_amount = amount;
        WMF_isWithSoup = false;
    }

    public WuMingFen()
    {
        WMF_type = "酸辣";
        WMF_amount = 2;
        WMF_isWithSoup = true;
    }

    void check()
    {
        System.out.println("面码：" + WMF_type + "，粉的份量：" + WMF_amount + "两，是否带汤：" + WMF_isWithSoup);
    }
}


/********** End **********/