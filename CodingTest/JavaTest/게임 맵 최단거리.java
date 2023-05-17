import java.util.LinkedList;
import java.util.Queue;

class Solution {
    
    int[] dx = {1, 0, -1, 0}; // 아래, 오른쪽, 위, 왼쪽
    int[] dy = {0, 1, 0, -1}; 
    
    public int solution(int[][] maps) {
        int answer = 0;
        
        int[][] visited = new int[maps.length][maps[0].length];
        
        bfs(maps, visited);
        
        answer = visited[maps.length-1][maps[0].length-1];
        
        if(answer == 0){
            answer = -1;
        }
        
        return answer;
    }
    
    public void bfs(int[][] maps, int[][] visited){
        int x = 0;
        int y = 0;
        visited[x][y] = 1;
        
        Queue<int[]> queue = new LinkedList<>(); // 위치값을 배열로 받음 (1,1)
        queue.add(new int[]{x, y}); // 큐 = {0,0};
        
        while(!queue.isEmpty()){
            int[] current = queue.poll(); // {0,0}
            int cX = current[0]; // 0
            int cY = current[1]; // 0
            
            for(int i = 0; i < 4; i++){
                int nX = cX + dx[i]; // 0 + 1
                int nY = cY + dy[i]; // 0 + 0
                
                if(nX < 0 || nX > maps.length-1 || nY < 0 || nY > maps[0].length-1)
                    continue;
                
                if(visited[nX][nY] == 0 && maps[nX][nY] == 1){
                    visited[nX][nY] = visited[cX][cY] + 1;
                    queue.add(new int[]{nX, nY});
                }
            }
            
        }
        
        
    }
}