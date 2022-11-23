class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int value1 = common[1] - common[0];
        int value2 = common[2] - common[1];
        
        if(value1 == value2) {
            answer = common[common.length-1] + value1;
        } else {
            answer = common[common.length-1] * (common[2] / common[1]);
        }
        
        return answer;
    }
}