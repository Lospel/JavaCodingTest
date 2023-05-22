class Solution {
    public int solution(int a, int b) {
        int newB = b / gcd(a, b); // 최대공약수 값으로 분모를 나눔.

        while (newB != 1) {
            if (newB % 2 == 0) {
                newB /= 2;
            } else if (newB % 5 == 0) {
                newB /= 5;
            } else {
                return 2;
            }
        }

        return 1;
    }

    private int gcd(int a, int b) { // 분모와 분자의 최대공약수 구하기
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}