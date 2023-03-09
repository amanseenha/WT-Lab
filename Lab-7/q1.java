import java.util.*;

class twoD{
	void calculate(int l,int b) {
		System.out.println("Cost: "+40*l*b);
	}
}
class threeD extends twoD{
	void calculate(int l,int b,int h) {
		System.out.println("Cost: "+60*l*b*h);
	}
}

public class q1 {

	public static void main(String[] args) {
		int l,b,h;
		threeD box=new threeD();
		box.calculate(5, 6);
		box.calculate(5, 6,7);
	}

}
