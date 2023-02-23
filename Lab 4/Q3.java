import java.util.Scanner;
public class Q3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter date: ");
    int date = sc.nextInt();
    switch (date) {
      case 1, 8, 15, 22:
        System.out.println("Wednesday");
        break;
      case 2, 9, 16, 23:
        System.out.println("Thursday");
        break;
      case 3, 10, 17, 24:
        System.out.println("Friday");
        break;
      case 4, 11, 18, 25:
        System.out.println("Saturday");
        break;
      case 5, 12, 19, 26:
        System.out.println("Sunday");
        break;
      case 6, 13, 20, 27:
        System.out.println("Monday");
        break;
      case 7, 14, 21, 28:
        System.out.println("Tuesday");
        break;
      default:
        System.out.println("Wrong Input!! Enter between 1-28");
        break;
    }
    sc.close();
  }
}