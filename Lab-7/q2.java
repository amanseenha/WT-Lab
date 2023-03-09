import java.util.*;
class plate{
	void platearea(int length,int breadth) {
		System.out.println("Length is: "+length);
		System.out.println("Breadth is: "+breadth);
	}
}
class box1 extends plate{
	int length,breadth,height;
	void boxarea(int length, int breadth, int height) {
		System.out.println("Length is: "+length);
		System.out.println("Breadth is: "+breadth);
		System.out.println("Height is: "+height);
	}
}
class woodbox extends box1 {
	int length,breadth,height,thickness;
	void woodboxarea(int length, int breadth, int height, int thickness) {
		System.out.println("Length is: "+length);
		System.out.println("Breadth is: "+breadth);
		System.out.println("Height is: "+height);
		System.out.println("Thickness is: "+thickness);
	}
}
public class q2 {
	public static void main(String[] args) {
		woodbox obj=new woodbox();
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		int height=sc.nextInt();
		int thickness=sc.nextInt();
		obj.platearea(length,breadth);
		obj.boxarea(length,breadth,height);
		obj.woodboxarea(length,breadth,height,thickness);
	}
}