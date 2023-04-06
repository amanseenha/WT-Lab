import java.util.Scanner;

public class q2 {
    public static void ProcessInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        try {
            if (num < 0) {
                throw new IllegalArgumentException("NegativeNumberException");
            }    
            System.out.println("Double value: "+num*2);
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        ProcessInput();
    }
} 