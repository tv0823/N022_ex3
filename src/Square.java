public class Square extends Shape
{
    private int x;

    @Override
    public void calculateArea()
    {
        System.out.println(Math.pow(this.x,2));
    }

    @Override
    public void calculatePerimeter()
    {
        System.out.println(this.x * 4);
    }
}
