public class Rectangle extends Shape
{
    private int X;
    private int Y;

    @Override
    public void calculateArea()
    {
        System.out.println(X*Y);
    }

    @Override
    public void calculatePerimeter()
    {
        System.out.println(2*X + 2*Y);
    }
}
