class rectangle{
    float length;
    float breadth;
    void getData(float len, float bre){
        length=len;
        breadth=bre;
    }
    float area(){
        return length*breadth;
    }
    float perimeter(){
        return 2*length*breadth;
    }
    void show(){
        System.out.println("Area of rectangle: "+area());
        System.out.println("Perimeter of rectangle: "+perimeter());
    }
}
public class q4 {
    public static void main(String[] args) {
        rectangle rec = new rectangle();
        rec.getData(4.5f, 5.5f);
        rec.show();
    }
}
