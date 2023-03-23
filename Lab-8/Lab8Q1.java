import java.util.*;

abstract class student {

  int rollNo, regNo;
  abstract void course(String courseName);
  abstract void branch(String branchName);
}

class generic extends student {

  String course, branch;
  
  void course(String courseName) {
    course = courseName;
  }

  void branch(String branchName) {
    branch = branchName;
  }

  void display() {
    System.out.println("Course: " + course);
    System.out.println("Branch: " + branch);
  }
}

public class Lab8Q1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter course name");
    String course = sc.nextLine();
    System.out.println("Enter branch name");
    String branch = sc.nextLine();
    generic stu1 = new generic();
    stu1.course(course);
    stu1.branch(branch);
    stu1.display();
    sc.close();
  }
}