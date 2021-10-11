import java.util.*;

public class DFS {
  public static boolean[] visited = new boolean[9];
  static int[][] graph = {{}, {2,3,8}, {1,7}, {1,4,5}, {3,5}, {3,4}, {7}, {2,6,8}, {1,7}};

  public static void dfs(int x) {

    visited[x] = true;
    System.out.print(x + " ");
//    System.out.println("graph[x]: " + Arrays.toString(graph[x]));
    for (int node : graph[x]) {
//      System.out.println("node: " + node);
      if (!visited[node]) {
        dfs(node);
      }
    }
  }

  public static void main(String[] args) {
    dfs(1);
  }
}
