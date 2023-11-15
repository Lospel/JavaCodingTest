class Solution { // 깊이우선탐색(DFS)
    public int solution(int n, int[][] computers) {
      int answer = 0;
      boolean[] check = new boolean[n];
  
      for (int i = 0; i < n; i++) {
        if (!check[i]) { //check[i] == false
          dfs(computers, i, check);
          answer++;
        }
      }
  
      return answer;
    }
  
    boolean[] dfs(int[][] computers, int i, boolean[] check) { // 재귀함수
      check[i] = true;
  
      for (int j = 0; j < computers.length; j++) {
        if (i != j && computers[i][j] == 1 && check[j] == false) {
          check = dfs(computers, j, check);
        }
      }
      return check;
    }
}