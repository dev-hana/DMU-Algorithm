import java.util.Arrays;
import java.util.Scanner;

//베열 값 중 0값을 찾아 배열 뒤로 배치시키기
public class zeroToBack {
  public static void toBack(int[] arr){
    int j = 0;
    for(int n : arr){
      if(n != 0){
        arr[j] = n;
        j++;
      }
    }

    for(int i = j; i < arr.length; i++)
      arr[i] = 0;
    System.out.println(Arrays.toString(arr));
  }

  public static void main(String[] args) {
    Scanner scann = new Scanner(System.in);
    String input = scann.nextLine();
    String[] inputArray = input.replaceAll("\\{", "")
        .replaceAll("}", "").split(", ");

    int[] intArray = new int[inputArray.length];
    for (int i = 0; i < inputArray.length; i++){
      try{
        intArray[i] = Integer.parseInt(inputArray[i]);
      }
      catch(Exception e){
        System.out.println("숫자형으로 변경이 불가합니다." + e.getMessage());
      }
    }

    toBack(intArray);

  }
}
