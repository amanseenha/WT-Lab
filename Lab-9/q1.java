public class q1 {
    public static void main(String[] args) {
        try {
            int[] arr = {1,2,3,4};
            System.out.println(arr[4]);    
        } 
        catch (Exception e) {
            System.out.println("Exception: "+e);
        }
    }
}