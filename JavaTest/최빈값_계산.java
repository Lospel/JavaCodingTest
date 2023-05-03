public class 최빈값_계산 {
	
	public static int solution(int[] array) {
        int[] countArray = new int[1000];
        for (int i = 0; i < array.length; i++) {
            countArray[array[i]]++; // 입력 값의 개수 ++
        }


        int answer = 0;
        int max = 0;

        for (int i = 0; i < countArray.length; i++) {
           if(countArray[i] > max){
                max = countArray[i];
                answer = i;
           }
        }

        int count = 0;
        for (int i = 0; i < countArray.length; i++) {
            if(countArray[i]==max){
                count++;
            }
            if(count > 1){
                return -1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] array =  {1, 2, 3, 3, 3, 4};

        int[] countArray = new int[1000];
        for (int i = 0; i < array.length; i++) {
            countArray[array[i]]++;
            System.out.print(countArray[array[i]]);
        }
        System.out.println();
        System.out.print(countArray[3]);
    }
	
}