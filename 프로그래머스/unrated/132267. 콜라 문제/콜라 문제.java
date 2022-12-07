class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        // 마트에 빈병 a개를 줬을때 b를 받는다.
        // 빈병 n개를 줬을때 받는 갯수는 ?
        
        while(n >= a) {
            n -= a;
            n += b;
            answer += b;
        }
        
        return answer;
    }
}