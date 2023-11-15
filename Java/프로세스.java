import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        Queue<Integer> process = new LinkedList<>();
        Queue<Integer> process2 = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            process.add(priorities[i]);
            process2.add(i);
        }
        
        int max = Collections.max(process);

        while (!process.isEmpty()) {
            int x = process.poll();
            int y = process2.poll();

            if (x == max && y == location) {
                return answer;
            } else if (x == max) {
                answer++;
                max = Collections.max(process);
            } else {
                process.add(x);
                process2.add(y);
            }
        }

        return answer;
    }
}