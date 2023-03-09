public class Lab_5_Q5 {

	public static void main(String[] args) {
		int[][] mat=new int[3][3];
		int k=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
			mat[i][j]=Integer.parseInt(args[k++]);
		}
		int rSum=0,lSum=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==j) {
					rSum+=mat[i][j];
				}
				if(i+j==2) {
					lSum+=mat[i][j];
				}
			}
		}
		System.out.println(rSum+" "+lSum);
	}

}