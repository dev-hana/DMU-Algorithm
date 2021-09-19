import java.util.Arrays;
import java.util.Scanner;

public class ATM {

  public static void main(String[] args) {
    Scanner scann = new Scanner(System.in);
    int n = scann.nextInt();

    Integer[] p = new Integer[n];


    for (int i = 0; i < n; i++){
      p[i] = scann.nextInt();
    }
    Arrays.sort(p);

    int result = 0;
    int temp = 0;

    for (int i = 0; i <n; i++){

      temp += p[i];
      result += temp;
    }
    System.out.println(result);
  }

}
