import java.util.Scanner;
public class Q4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int num = sc.nextInt();
    int rev = 0, n = num;
    while (n > 0) {
      int rem = n % 10;
      rev = rev * 10 + rem;
      n /= 10;
    }
    if (rev == num) {
      System.out.println("Palindrome Successfully detected");
    } else System.out.println("The input number is not a palindrome");
    sc.close();
  }
}