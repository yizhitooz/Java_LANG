package step2;

public class Test
{
    // Main method
    public static void main(String[] args)
    {
        // Create two comparable circles
        Circle1 circle1 = new Circle1(5);
        Circle1 circle2 = new Circle1(4);

        // Display the max circle
        Circle1 circle = (Circle1) GeometricObject1.max(circle1, circle2);
        System.out.println("The max circle's radius is " +
                circle.getRadius());
        System.out.println(circle);
    }
}

abstract class GeometricObject1 implements Comparable
{
    public static Object max(Circle1 circle1, Circle1 circle2)
    {
        if (circle1.compareTo(circle2) > 0)
        {
            return circle1;
        } else if (circle1.compareTo(circle2) < 0)
        {
            return circle2;
        }
        return 0;
    }
}

// Circle.java: The circle class that extends GeometricObject
class Circle1 extends GeometricObject1
{
    // Implement it
    private double radius;

    public Circle1(double i)
    {
        this.radius = i;
    }

    public double getRadius()
    {
        return this.radius;
    }

    @Override
    public int compareTo(Object o)
    {
        Circle1 c = (Circle1) o;
        if (this.radius > c.radius)
        {
            return 1;
        } else if (this.radius < c.radius)
        {
            return -1;
        } else
        {
            return 0;
        }
    }

    @Override
    public String toString()
    {
        String s = "这是一个半径为" + this.radius + "的圆";
        return s;
    }
}

