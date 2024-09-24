public class Triangle extends Shape
{
    @Override
    public void calculateArea()
    {
        System.out.println("(X*Y)/2");
    }

    @Override
    public void calculatePerimeter()
    {
        System.out.println("X+Y+Z");
    }
}
