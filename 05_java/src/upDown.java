import java.io.*;
import java.util.StringTokenizer;

public class upDown {
  static int[] dx = {0, 0, -1, 1}; // L, R, U, D
  static int[] dy = {-1, 1, 0, 0};
  static String[] move_types = {"L", "R", "U", "D"};
  public static int[] move(String[] plan, int n) {
    int curX = 1;
    int curY = 1;
    int nx = 0;
    int ny = 0;

    for (int i = 0; i < plan.length; i++) {
      String element = plan[i];
      for(int j=0 ; j<move_types.length ; j++) {

        // 이동 후 좌표 구하기
        if (element.equals(move_types[j])){
          nx = curX + dx[j];
          ny = curY + dy[j];
        }

        // 공간을 벗어나는 경우 무시
        if(nx < 1 || ny < 1 || nx > n || ny > n)
          continue;

        // 이동 수행
        curX = nx;
        curY = ny;

      }

    }

    return new int[]{nx, ny};
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine()); // N개 입력

    StringTokenizer st = new StringTokenizer(br.readLine());
    String[] plan = new String[st.countTokens()]; // 계획
    int index = 0;
    while (st.countTokens() != 0) {
      plan[index] = st.nextToken();
      index++;
    }

    int[] result = move(plan, n);
    System.out.println(result[0] + " " + result[1]);

    br.close();
    bw.close();
  }


}
