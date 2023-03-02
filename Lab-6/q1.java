class Box{
    float length;
    float width;
    float height;
    float volume(){
        return length*width*height;
    }
}

class Demo extends Box{
    float volume(float len, float wid, float hei){
        length=len;
        width=wid;
        height=hei;
        return length*width*height;
    }
}
public class q1{
    public static void main(String[] args) {
        Demo cuboid = new Demo();
        System.out.println(cuboid.volume(5.2f,6.0f,10.5f));
    }
}