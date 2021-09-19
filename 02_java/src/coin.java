// 거스름 돈: 최소한의 동전 개수
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class coin {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("동전 종류의 개수를 입력해주세요: ");
    int coin_cnt = scan.nextInt();

    System.out.print("금액을 입력해주세요: ");
    int n = scan.nextInt();

    Integer [] type_array = new Integer [coin_cnt];

    for (int i = 0; i < coin_cnt; i++){
      System.out.print("동전의 종류를 입력해주세요: ");
      type_array[i] = scan.nextInt();
    }
    Arrays.sort(type_array, Collections.reverseOrder());

    int cnt = 0;
    for (int k : type_array) {
      cnt += n / k;
      n %= k;
    }
    System.out.println("최소 동전 개수: "+cnt);
  }
}
