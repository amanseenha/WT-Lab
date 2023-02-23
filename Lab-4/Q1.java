import java.util.Scanner;
public class Q1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name,section,branch;
    int roll;
    for (int i = 0; i < 3; i++) {
      System.out.print("Enter your Name: ");
      name = sc.next();
      System.out.print("Enter your Roll No: ");
      roll = sc.nextInt();
      System.out.print("Enter your Section: ");
      section = sc.next();
      System.out.print("Enter your Branch: ");
      branch = sc.next();
      System.out.println();
      System.out.println("Your name is : "+name);
      System.out.println("Your Roll No. is: "+roll);
      System.out.println("Your Section is: "+section);
      System.out.println("Your Branch is: "+branch);
      System.out.println();
    }
    sc.close();
  }
}