package step1;
public class AmericanPeople extends People {
    //������2����дpublic void speakHello()���������"How do you do"
    //������3�� ��дpublic void averageHeight()���������"American's average height:176 cm"
    public void averageWeight() {
        weight = 75;
        System.out.println("American's average weight:"+weight+" kg");
    }
    public void americanBoxing() {
        System.out.println("ֱȭ����ȭ�����ȭ");
    }

    @Override
    public void speakHello()
    {
        System.out.println("How do you do");
    }

    @Override
    public void averageHeight()
    {
        System.out.println("American's average height:176 cm");
    }
}

