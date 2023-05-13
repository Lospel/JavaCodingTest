import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0;
        Queue<Integer> going = new LinkedList<>();

        for(int i=0; i<truck_weights.length; i++){
            int truck = truck_weights[i];
            while(true){
                if(going.isEmpty()){
                    going.add(truck);
                    sum += truck;
                    answer++;
                    break;
                }else if(going.size() == bridge_length){
                    sum -= going.poll();
                }else{
                    if(sum + truck <= weight){
                        going.add(truck);
                        sum += truck;
                        answer++;
                        break;
                    }else{
                        going.add(0);
                        answer++;
                    }
                }
            }
        }
        
        return answer + bridge_length;
    }
}