public class Circle extends Shape
{
    private int r;

    @Override
    public void calculateArea()
    {
        System.out.println(Math.PI * Math.pow(this.r,2));
    }

    @Override
    public void calculatePerimeter()
    {
        System.out.println(Math.PI * 2 * this.r);
    }
}
