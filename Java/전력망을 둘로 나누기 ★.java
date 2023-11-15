import java.util.*;

class Solution {
    static boolean[] check;
    static Queue<Integer> queue = new LinkedList<>();
    static int[][] map;

    public int solution(int n, int[][] wires) {
        int answer = n;

        map = new int[n + 1][n + 1];

        for (int i = 0; i < wires.length; i++) {
            int a = wires[i][0];
            int b = wires[i][1];
            map[a][b] = 1;
            map[b][a] = 1;
        }

        for (int i = 0; i < wires.length; i++) {
            int a = wires[i][0];
            int b = wires[i][1];

            map[a][b] = 0;
            map[b][a] = 0;

            answer = Math.min(answer, dfs(n, i + 1));

            map[a][b] = 1;
            map[b][a] = 1;
        }

        return answer;
    }

    public int dfs(int n, int start) {
        int count = 1;
        check = new boolean[n + 1];
        queue.add(start);
        check[start] = true;
        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (int i = 1; i <= n; i++) {
                if (map[now][i] == 1 && !check[i]) {
                    queue.add(i);
                    check[i] = true;
                    count++;
                }
            }
        }
        return (int) Math.abs(n - 2 * count);
    }
}