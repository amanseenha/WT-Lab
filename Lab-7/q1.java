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
		threeD box=new threeD();
		box.calculate(6, 5);
		box.calculate(5, 8,7);
	}

}
