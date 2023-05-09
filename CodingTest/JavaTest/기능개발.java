import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>(); // answer 배열 크기 조정
        Queue<Integer> q = new LinkedList<>(); // 큐 형식 FIFO 선입선출
        for(int i=0; i<progresses.length; i++){
            if((100-progresses[i]) % speeds[i] == 0){
                q.add((100-progresses[i]) / speeds[i]); // 7일 걸림
            } else{ // 70 % 30 == 10 이 경우
                q.add((100-progresses[i]) / speeds[i] +1); // ex) 3일 걸림
            }
        }
        
        int x = q.poll();
        int count = 1;
        
        while(!q.isEmpty()){ // 7일 vs 3일 count = 2 -> 7일 vs 9일 -> 9일 count = 1
            if(x >= q.peek()){
                count++;
                q.poll();
            }else {
                list.add(count);
                count = 1;
                x = q.poll();
            }
        }
        
        list.add(count); // 마지막 카운트 리스트에 추가
        
        answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}