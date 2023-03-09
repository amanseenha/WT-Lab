public class Lab_5_Q4 {
	static int count(int[] arr,int x,int[] check) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				count++;
				check[i]=1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int[] arr = new int[n];
		int[] check=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(args[i+1]);
		}
		for(int i=0;i<n;i++) {
			if(check[i]!=1) {
				System.out.println(arr[i]+":"+count(arr,arr[i],check));
			}
		}
	}
}