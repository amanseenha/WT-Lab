class plate{
	int length,width;
	plate(){
		System.out.println("Plate constructor called");
	}
}
class box extends plate{
	int height;
	box(){
		System.out.println("Box constructor called");
	}
}
class woodBox extends box{
	int thick;
	woodBox(){
		System.out.println("Wood Box constructor called");
	}
}


public class q2 {

	public static void main(String[] args) {
		woodBox b=new woodBox();
	}

}
