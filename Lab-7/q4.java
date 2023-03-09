import java.util.*;

class Shape{
	double area;
	void showArea() {
		System.out.println("Area: "+area);
	}
}
class circle extends Shape{
	int r;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");
		r=sc.nextInt();
		area=3.14*r*r;
	} 
	void showArea() {
		System.out.println("Area of circle: "+area);
	}
}
class rectangle extends Shape{
	int l,b;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth");
		l=sc.nextInt();
		b=sc.nextInt();
		area=l*b;
	} 
	void showArea() {
		System.out.println("Area of rectangle: "+area);
	}
}

public class q4 {

	public static void main(String[] args) {
		circle c=new circle();
		c.input();
		c.showArea();
		rectangle r=new rectangle();
		r.input();
		r.showArea();
	}

}
