/********** Begin **********/
//��������Ӱ���  step4
package step4;

import java.sql.SQLOutput;

//������ ������Ժͷ���
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
        WMF_type = "����";
        WMF_amount = 2;
        WMF_isWithSoup = true;
    }

    void check()
    {
        System.out.println("���룺" + WMF_type + "���۵ķ�����" + WMF_amount + "�����Ƿ������" + WMF_isWithSoup);
    }
}


/********** End **********/