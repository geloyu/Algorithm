class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        int half = 0;
        
        if(length % 2 != 0) {
            half = (int) Math.floor(length / 2);
            answer = s.substring(half, half+1);
        } else {
            half = length / 2;
            answer = s.substring(half-1, half) + s.substring(half, half + 1);
        }
        
        return answer;
    }
}