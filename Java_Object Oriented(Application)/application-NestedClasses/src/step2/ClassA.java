package step2;

public class ClassA
{
    private String memberA;

    public ClassA()
    {
        System.out.println("����ClassA����");
        this.memberA = "member1";
    }

    public class ClassB
    {
        public ClassB()
        {
            System.out.println("����ClassA�е��ڲ���ClassB�Ķ���");
            System.out.println("memberA=" + memberA);
        }
    }

}
