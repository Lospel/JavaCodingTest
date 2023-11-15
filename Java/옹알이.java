class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizzaOne = 6;

        int min = (n < pizzaOne) ? n : pizzaOne;
		int gcd = 0;
		for (int i = 1; i <= min; i++) {
			if (n % i == 0 && pizzaOne % i == 0)
				gcd = i;
		}
        answer = (n * pizzaOne / gcd)/pizzaOne;

        return answer;
    }
}