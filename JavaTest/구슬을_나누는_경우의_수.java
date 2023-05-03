class Solution {
    public int solution(int balls, int share) {
        return combination(balls, share);
    }

    public static int combination(int balls, int share) {
        if (balls == share || share == 0) {
            return 1;
        }else{
            // nCr = n-1Cr + n-1Cr-1; (경우의 수 공식) => 1+1+1...C;
            return combination(balls - 1, share) + combination((balls - 1), (share - 1));
        }
    }
}