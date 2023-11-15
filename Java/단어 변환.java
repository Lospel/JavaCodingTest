import java.util.*;

class Solution {
    static boolean[] visited;
    static int answer = 0;
    
    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        
        dfs(begin, target, words, 0);
        
        return answer;
    }
    
    public static void dfs(String begin, String target, String[] words, int cnt) {
        if (begin.equals(target)) {
            answer = cnt;
            return;
        }
        
        for (int i = 0; i < words.length; i++) {
            if (visited[i]) {
                continue;
            }

            int k = 0;    // 같은 스펠링 몇개인지 세기
            for (int j = 0; j < begin.length(); j++) {
                if (begin.charAt(j) == words[i].charAt(j)) {
                    k++;
                }
            }

            if (k == begin.length() - 1) {  // 한글자 빼고 모두 같은 경우
                visited[i] = true;
                dfs(words[i], target, words, cnt + 1);
                visited[i] = false;
            }
        }
    }
}


class StringANDIdx {
    String str;
    int idx;
    
    StringANDIdx(String str, int idx) {
        this.str = str;
        this.idx = idx;
    }
}


class Solution2 {
    
    public static boolean[] visited;
    public static int[] dis ;
    public static int answer = 0;
    public int solution(String begin, String target, String[] words) {
    
        visited = new boolean[words.length];
        dis = new int[words.length+1];
        
        if(Arrays.asList(words).contains(target)){
            bfs(begin, target, words);
            return answer;   
        } else {
            return 0;
        }
        
    }
    
    static void bfs(String begin, String target, String[] words) {
        Queue<StringANDIdx> queue = new LinkedList<>();
        queue.add(new StringANDIdx(begin, 0)); //단어와 idx를 함께 나타낸다.
        
        while(!queue.isEmpty()) {
            StringANDIdx output = queue.poll();
            
            if(output.str.equals(target)) 
                return ;
            
             for(int i=0; i< words.length; i++) {
                int cnt = 0;
                String next = words[i];
                 
                if(visited[i]) continue;
                else {
                    for(int j=0; j<output.str.length(); j++) {
                        if(next.charAt(j) == output.str.charAt(j)){
                            cnt++;
                        } 
                    }
                    
                    if(cnt == output.str.length()-1) {
                        visited[i] = true;
                        queue.add(new StringANDIdx(words[i], i+1)); //단어와 idx를 함께 나타낸다.
                        dis[i+1] = dis[output.idx] + 1; //이것을 위해 StringANDIdx 의 형태로 단어와 idx를 함께 queue에 저장해두었다.
                        answer = dis[i+1];
                    }
                         
                }
            }
        }
    }
}