class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x1 = 0; int y1 = 0;
        
        for(int i = 1; i < 4; i++) {
            if((dots[0][0] != dots[i][0]) && (dots[0][1] != dots[i][1])) {
                x1 = dots[i][0];
                y1 = dots[i][1];
                break;
            }
        }
        // 넓이 공식 = 루트 (x1 - x2)제곱 * 루트 (y1 - y2) 제곱;
        int xdistance = (int)Math.sqrt((int)(Math.pow(dots[0][0] - x1, 2)));
        int ydistance = (int)Math.sqrt((int)(Math.pow(dots[0][1] - y1, 2)));
        answer = xdistance * ydistance;

        return answer;
    }
}