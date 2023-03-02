public class Lab_5_Q1 {

  static int largestNum(int arr[]) {
    int max = arr[0];
    for (int i = 1; i < 3; i++) {
      if (arr[i] > max) max = arr[i];
    }
    return max;
  }

  public static void main(String[] args) {
    System.out.println("Enter 3 numbers: ");
    int arr[] = new int[3];
    for (int i = 0; i < 3; i++) {
      try {
        arr[i] = Integer.parseInt(args[i]);
      } catch (NumberFormatException err) {
        System.out.println("!!Please enter valid integers!!");
        return;
      }
    }
    System.out.println("Largest among entered 3 numbers is : " + largestNum(arr));
  }
}