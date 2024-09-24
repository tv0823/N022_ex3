public class Circle extends Shape
{
    @Override
    public void calculateArea()
    {
        System.out.println("pie * r^2");
    }

    @Override
    public void calculatePerimeter()
    {
        System.out.println("pie * 2 * r");
    }
}
