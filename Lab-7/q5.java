import java.util.Scanner;

class Account{
	int accNo,balance;
	void display() {
		System.out.println("Account No: "+accNo);
		System.out.println("Balance: "+balance);
	}
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account number: ");
		accNo=sc.nextInt();
		System.out.println("Enter balance: ");
		balance=sc.nextInt();
	}
}

class person extends Account{
	String name;
	int aadhar_no;
	void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter aadhar number: ");
		aadhar_no=sc.nextInt();
	}
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Aadhar number: "+aadhar_no);
		System.out.println("Account No: "+accNo);
		System.out.println("Balance: "+balance);
	}
}

public class q5 {

	public static void main(String[] args) {
		person[] p=new person[5];
		for(int i=0;i<5;i++) {
			p[i]=new person();
			p[i].input();
		}
		for(int i=0;i<5;i++) {
			p[i].display();
		}

	}

}
