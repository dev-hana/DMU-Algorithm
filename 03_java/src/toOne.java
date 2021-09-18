import java.util.Scanner;

public class toOne {

  public static void main(String[] args) {
    Scanner scann = new Scanner(System.in);

    int n = scann.nextInt();
    int k = scann.nextInt();
    int result = 0;

    while (true){
      int target = (n / k) * k;
      result += (n - target);
      n = target;

      if(n < k) break;

      result += 1;
      n /= k;
    }

    result += ( n - 1);
    System.out.println(result);
  }
}
