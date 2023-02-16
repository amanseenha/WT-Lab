import java.util.Scanner;
public class Q4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int num = sc.nextInt();
    int newNum = 0;
    int rev = 0, n = num;
    while (n > 0) {
      int r = n % 10;
      rev = rev * 10 + r;
      n /= 10;
    }
    if (newNum == n) {
      System.out.println("Palindrome Successfully detected");
    } else System.out.println("The input number is not a palindrome");
    sc.close();
  }
}
