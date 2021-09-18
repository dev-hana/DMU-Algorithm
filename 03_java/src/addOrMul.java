import java.util.Scanner;

public class addOrMul {

  public static void main(String[] args) {
    Scanner scann = new Scanner(System.in);
    String str = scann.next();

    long result = str.charAt(0) - '0';
    for (int i = 1; i < str.length(); i++){
      int num = str.charAt(i) - '0';
      if(num <= 1 || result <= 1) result += num;
      else result *= num;
    }
    System.out.println(result);
  }

}
