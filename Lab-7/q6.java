class acc{
	String name;
	int accNo;
	acc(String n,int a){
		name=n;
		accNo=a;
	}
}
class savings extends acc{
	int minBalance;
	savings(String n,int a,int b){
		super(n, a);
		minBalance=b;
	}
	void display() {
		System.out.println("Name:"+name);
		System.out.println("Account No:"+accNo);
		System.out.println("Min Balance:"+minBalance);
	}
}

public class q6 {

	public static void main(String[] args) {
		savings s=new savings("Aman",121,1000);
		s.display();
	}

}
