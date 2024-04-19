package step1;

public class Test
{
    public static void main(String[] args)
    {
        /********** Begin **********/
        //创建Dog对象
        //设置Dog对象的属性
        Dog wuhuarou = new Dog();
        wuhuarou.name = "五花肉";
        wuhuarou.color = "棕色";
        wuhuarou.breed = "阿拉斯加";
        //输出小狗的属性
        System.out.println("名字：" + wuhuarou.name + "，毛色：" + wuhuarou.color + "，品种：" + wuhuarou.breed);

        //调用方法
        wuhuarou.act_eatBond();
        wuhuarou.act_runWithBond();

        /********** End **********/

    }
}

//在这里定义Dog类

/********** Begin **********/
class Dog
{
    String name;
    String color;
    String breed;

    void act_eatBond()
    {
        System.out.println("啃骨头");
    }

    void act_runWithBond()
    {
        System.out.println("叼着骨头跑");
    }
}


/********** End **********/