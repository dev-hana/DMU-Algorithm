import java.util.Scanner;
import java.util.stream.Stream;

public class ATM {

  public static void main(String[] args) {
    Scanner scann = new Scanner(System.in);
    int n = scann.nextInt();

    int[] p = new int[n];
    p = Array.sort(p);

    for (int i = 0; i < n; i++){
      p[i] = scann.nextInt();
    }

    int result = 0;
    int temp = 0;

    for (int i = 0; i <n; i++){

      temp += p[i];
      result += temp;
    }
    System.out.println(result);
  }

}
