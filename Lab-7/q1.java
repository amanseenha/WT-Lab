class TwoD
{
    float cost_sq_ft=40;
    float cost_cb_ft=60;
    float length;
    float breadth;
    float height;
    float side;
    public void dimensions(float a,float l,float b,float h)
    {
        side=a;
        length=l;
        breadth=b;
        height=h;
    }
    public void square()
    {
        float area=side*side;
        float price=area*cost_sq_ft;
        System.out.println("Price of 2D square is "+price);
    }
    public void rectangle()
    {
        float area=length*breadth;
        float price=area*cost_sq_ft;
        System.out.println("Price of 2D rectangle is "+price);
    }
}
class ThreeD extends TwoD
{
    public void cube()
    {
        float volume=side*side*side;
        float price=volume*cost_cb_ft;
        System.out.println("Price of 3D cube is "+price);
    }
    public void cuboid()
    {
        float volume=length*breadth*height;
        float price=cost_cb_ft*volume;
        System.out.println("Price of 3D cuboid is "+price);
    }
}
public class q1{
    public static void main(String[] args) {
        ThreeD obj=new ThreeD();
        obj.dimensions(3,4,5,60);
        obj.square();
        obj.rectangle();
        obj.cube();
        obj.cuboid();

    }
}
