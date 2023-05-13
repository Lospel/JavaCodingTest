class Solution {
    static boolean[] check;
    static int count = 0;

    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        check = new boolean[dungeons.length];
        dfs(0, k, dungeons);
        answer = count;
        return answer;
    }

    public void dfs(int depth, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (dungeons[i][0] > k || check[i]) {
                continue;
            }
            check[i] = true;
            dfs(depth + 1, k - dungeons[i][1], dungeons);
            check[i] = false;
        }
        count = Math.max(count, depth);
    }
}