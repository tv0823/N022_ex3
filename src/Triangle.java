public class Triangle extends Shape
{
    private int x;
    private int y;
    private int z;
    private int h; //height

    @Override
    public void calculateArea()
    {
        System.out.println((this.x * this.h)/2);
    }

    @Override
    public void calculatePerimeter()
    {
        System.out.println(this.x + this.y + this.z);
    }
}
