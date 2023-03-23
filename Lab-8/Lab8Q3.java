import java.util.Scanner;

interface finance{
    void earnings(int basic);
    void deductions(int basic);
    void bonus(int basic);
}
abstract class Manager implements finance{
    public void earnings(int basic){
        System.out.println("Earnings: "+(basic+ 0.8*basic + 0.15*basic));
    }
    public void deductions(int basic){
        System.out.println("Deductions: "+0.12*basic);
    }
}
class Substaff extends Manager{
    public void bonus(int basic){
        System.out.println("Bonus: "+0.5*basic);
    }
}
public class Lab8Q3 {
    public static void main(String[] args) {
        Substaff emp1 = new Substaff();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic Salary: ");
        int basic = sc.nextInt();
        emp1.earnings(basic);
        emp1.deductions(basic);
        emp1.bonus(basic);
        sc.close();
    }
}
