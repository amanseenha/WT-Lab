public class q3{
    float area (float radius){
        return 3.14f*radius*radius;
    }
    float area (float base, float height){
        return 0.5f*base*height;
    }
    int area (int side){
        return side*side;
    }
    public static void main(String[] args) {
     q3 ar = new q3();
        System.out.println(ar.area(5.5f));
        System.out.println(ar.area(2.5f, 10.2f));
        System.out.println(ar.area(5));   
    }
}