import java.util.*;

abstract class interest{
	int p,r,t;
	abstract void display();
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principle amount");
		p=sc.nextInt();
		System.out.println("Enter rate: ");
		r=sc.nextInt();
		System.out.println("Enter time: ");
		t=sc.nextInt();
	}
}
class simpleInterest extends interest{
	
	void display() {
		System.out.println("Interest: "+(double)p*r*t/100);
	}
}

class compoundInterest extends interest{
	
	void display() {
		System.out.println("Interest: "+(p*Math.pow(1+(double)r/100, t)-p));
	}
}

public class q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for simple interest");
		System.out.println("Enter 2 for compound interest");
		int n=sc.nextInt();
		if(n==1) {
			interest obj=new simpleInterest();
			obj.input();
			obj.display();	
		}
		else {
			interest obj=new compoundInterest();
			obj.input();
			obj.display();
		}

	}

}
