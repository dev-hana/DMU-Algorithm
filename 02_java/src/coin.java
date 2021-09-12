// 거스름 돈: 최소한의 동전 개수
import java.util.Scanner;

public class change {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("거스름돈의 금액을 입력하세요: ");
    int money = scan.nextInt();
//    int n = 1260;
    int cnt = 0;
    int[] coin_type = {500, 100, 50, 10};

    for (int j : coin_type) {
      cnt += money / j;
      money %= j;
    }
    System.out.println("최소 동전 개수: "+cnt);
  }
}
