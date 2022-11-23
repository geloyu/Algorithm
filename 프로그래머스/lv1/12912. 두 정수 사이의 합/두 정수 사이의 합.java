class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int maxNumber = 0;
        int minNumber = 0;
        if (a == b) {
            return a;
        } else if (a > b) {
            maxNumber = a;
            minNumber = b;
        } else {
            maxNumber = b;
            minNumber = a;
        }
        
        for(int i=minNumber; i <= maxNumber; i++) {
            answer += i;
        }
        
        return answer;
    }
}