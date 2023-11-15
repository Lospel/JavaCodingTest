class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] rail = new int[200]; // -100 ~ 100 == 0 ~ 200;
        for (int[] line : lines) {
            for (int j = (line[0] + 100); j < (line[1] + 100); j++) { // 100 < 101
                rail[j]++; // rail[100]++; == 1;
            }
        }

        for (int value : rail) { // rail[j] 값이 2 이상이면 두번 선이 그어졌다는 뜻, 즉 겹친다.
            if (value > 1) answer++; // 겹치는 구간만큼 값을 증가시킴.
        }
        return answer;
    }
}