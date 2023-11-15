class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        boolean landmine[][] = new boolean[board.length][board.length];
        
        for(int i = 0; i < landmine.length; i++) {
            for(int j = 0; j < landmine.length; j++) {
                if(board[i][j] == 1) Destroy(i, j, board.length, landmine);
            }
        }
        
        for(int i = 0; i < landmine.length; i++) {
            for(int j = 0; j < landmine.length; j++) {
                if(landmine[i][j] == false) answer++;
            }
        }
        
        return answer;
    }
    
    private static void Destroy(int i, int j, int n, boolean[][] landmine) { // ex) 3, 2, 5, boolean[][] -> r=2 ~ 4, c= 1 ~ 3, landmine[2][1]... [4][3] = true;
        for(int r = i-1; r < i+2; r++) { // -1 , 0 , 1 (좌, 가운데, 우)
            if(r < 0 || r >= n) continue; // 왼쪽 끝을 넘거나 오른쪽 끝을 넘는 값일 때.
            else {
                for(int c = j-1; c < j+2; c++) { // -1, 0 , 1
                    if(c < 0 || c >= n) continue;
                    else landmine[r][c] = true;
                } // 2줄만 비교하는 이유는, 최소 1*1 배열이므로, 재귀함수로 계산하면 밑에 3번째 줄도 계산되며, 중복값에도 문제 없음. 왜? 트루값이 유지되기 때문.
            }
        }
    }
    
}