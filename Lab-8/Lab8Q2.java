interface Motor {
  float capacity = 7.5f;
  void run();
  void consume();
}

class washingMachine implements Motor {

  public void run() {
    System.out.println("Washing Machine is running.");
  }

  public void consume() {
    System.out.println("Washing Machine consumes 750W electricity.");
  }
}

public class Lab8Q2 {

  public static void main(String[] args) {
    washingMachine whirlpool = new washingMachine();
    whirlpool.run();
    whirlpool.consume();
  }
}