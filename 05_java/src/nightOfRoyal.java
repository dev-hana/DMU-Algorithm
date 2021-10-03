import java.util.Scanner;

public class nightOfRoyal {

  public static void main(String[] args) {
    Scanner scann = new Scanner(System.in);

    String input_data = scann.nextLine();
    int row = input_data.charAt(1) - '0';
    int column = input_data.charAt(0) - 'a' + 1;

    int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    int[] dy = {-1, -2, -2, -1, 1, 2, 2, 3};

    int result = 0;
    for (int i = 0; i < 8; i++){
      int nexRow = row + dx[i];
      int nextColumn = column + dy[i];

      if(nexRow >= 1 && nexRow <= 8 && nextColumn >=1 && nextColumn <= 8)
        result += 1;
    }
    System.out.println(result);
  }
}
