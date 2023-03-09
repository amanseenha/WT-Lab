import java.util.*;

class Number{
	int[] arr;
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	}
	void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	void swap() {
		int minIndex=0,maxIndex=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[minIndex]) {
				minIndex=i;
			}
			if(arr[i]>arr[maxIndex]) {
				maxIndex=i;;
			}
		}
		int temp=arr[minIndex];
		arr[minIndex]=arr[maxIndex];
		arr[maxIndex]=temp;
		
	}
}


public class q7 {

	public static void main(String[] args) {
		Number n1=new Number();
		n1.input();
		n1.display();
		n1.swap();
		n1.display();

	}

}