import java.util.*;

class Solution {
    public int solution(int N, int number) {
        int answer = 0;

        List<Set<Integer>> countList = new ArrayList<>(); // Set : list형식의 중복값 허용 x null 생성 허용

        for (int i = 0; i < 9; i++) {
            countList.add(new HashSet<>()); // HashSet : 중복 허용 x null 생성 허용 HashMap
        } // countList : 1~9 로 구성됨

        countList.get(1).add(N); // N을 1개 쓴 값은 N 혼자이다.

        for (int i = 2; i < 9; i++) {
            Set<Integer> countSet = countList.get(i); // 2~8

            for (int j = 1; j < i; j++) {
                Set<Integer> preSet = countList.get(j);
                Set<Integer> postSet = countList.get(i - j);

                for (int preNum : preSet) {
                    for (int postNum : postSet) {
                        countSet.add(preNum + postNum);
                        countSet.add(preNum - postNum);
                        countSet.add(preNum * postNum);

                        if (preNum != 0 && postNum != 0) { // Null 값은 나누기할 경우 오류 발생 따라서 예외 처리함
                            countSet.add(preNum / postNum);
                        }

                    }
                }
            }
            countSet.add(Integer.parseInt(String.valueOf(N).repeat(i)));
        }

        for (Set<Integer> sub : countList) {
            if (sub.contains(number)){
                return countList.indexOf(sub);
            }
            if(countList.indexOf(sub) > 8 || countList.indexOf(sub) <= 0){
                answer = -1; // 최솟값 > 8
            }
        }

        return answer;
    }
}