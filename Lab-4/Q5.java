import java.util.Scanner;

public class Q5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first name: ");
    String fName = sc.next();
    System.out.print("Enter last name: ");
    String lName = sc.next();
    System.out.print(lName + " " + fName);
    sc.close();
  }
}
