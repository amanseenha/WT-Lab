class objectCreator{
	static int objCounter=0;
	objectCreator(){
		objCounter++;
	}
}

public class Lab_5_Q6 {

	public static void main(String[] args) {
		objectCreator s1=new objectCreator();
		objectCreator s2=new objectCreator();
		objectCreator s3=new objectCreator();
		System.out.println(objectCreator.objCounter);
	}
}