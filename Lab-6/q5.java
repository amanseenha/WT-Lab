import java.util.Scanner;

class student {

  String name;
  int roll;
  float cgpa;

  Scanner input = new Scanner(System.in);

  student() {
    System.out.println();
    System.out.print("Enter Name: ");
    name = input.nextLine();
    System.out.print("Enter Roll No.: ");
    roll = input.nextInt();
    System.out.print("Enter CGPA: ");
    cgpa = input.nextFloat();
  }
}

public class q5 {

  public static void main(String[] args) {
    int lowestCGPA = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of student: ");
    int n = sc.nextInt();
    student[] stu = new student[n];
    for (int i = 0; i < n; i++) {
      stu[i] = new student();
    }
    
    for (int i = 0; i < n; i++) {
      System.out.println();
      System.out.println("Name: "+stu[i].name);
      System.out.println("Roll No.: "+stu[i].roll);
      System.out.println("CGPA: "+stu[i].cgpa);
    }
    for (int i = 0; i < n-1; i++) {
      for (int j = i+1; j < n; j++) {
        if (stu[j].cgpa<stu[i].cgpa) {
          lowestCGPA=j;
        }
      }
    }
    System.out.println();
    System.out.println("Lowest CGPA student details: ");
    System.out.println(stu[lowestCGPA].name);
    System.out.println(stu[lowestCGPA].roll);
    System.out.println(stu[lowestCGPA].cgpa);
    sc.close();
  }
}