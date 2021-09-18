import java.util.Scanner;
import java.util.stream.Stream;

public class ATM {

  public static void main(String[] args) {
    Scanner scann = new Scanner(System.in);
    int n = scann.nextInt();

    int result = 0;
    int temp = 0;

    for (int i = 0; i <n; i++){
      int p = scann.nextInt();
      temp += p;
      result += temp;
    }
    System.out.println(result);
  }

}
