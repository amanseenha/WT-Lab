public class Lab_5_Q2 {

  public static void main(String[] args) {
    int[] arr = new int[10];
    int odd = 0, even = 0, n = 10;
    for (int i = 0; i < n; i++) {
      try {
        arr[i] = Integer.parseInt(args[i]);
        if (arr[i] % 2 == 0) {
          even++;
        } else {
          odd++;
        }
      } catch (NumberFormatException err) {
        System.out.println("Enter valid integer inputs");
      }
    }

    System.out.println(even + " even numbers: ");
    for (int i = 0; i < n; i++) {
      if (arr[i] % 2 == 0) System.out.print(arr[i] + " ");
    }
    System.out.println();
    System.out.println(odd + " odd numbers: ");
    for (int i = 0; i < n; i++) {
      if (arr[i] % 2 != 0) System.out.print(arr[i] + " ");
    }
  }
}