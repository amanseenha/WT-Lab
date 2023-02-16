import java.util.Scanner;
public class Q2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter marks out of 100");
    int marks = sc.nextInt();
    if (marks >= 90) {
      System.out.println("A - Excellent");
    } else if (marks >= 80 && marks < 90) {
      System.out.println("B - Very Good");
    } else if (marks >= 70 && marks < 80) {
      System.out.println("C - Good");
    } else if (marks >= 60 && marks < 70) {
      System.out.println("D - Satisfactory");
    } else if (marks >= 50 && marks < 60) {
      System.out.println("E - Work Hard");
    } else if (marks >= 40 && marks < 50) {
      System.out.println("F - Just Passed");
    } else {
      System.out.println("Failed");
    }
    sc.close();
  }
}
