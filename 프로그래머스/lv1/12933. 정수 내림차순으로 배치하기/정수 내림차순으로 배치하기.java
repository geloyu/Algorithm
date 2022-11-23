import java.util.*;

class Solution {
    public long solution(long n) {
        String answer_string = "";
        long answer = 0;
        
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list, Collections.reverseOrder());
        
        for(String e : list) {
            answer_string += e;   
        }
        answer = Long.parseLong(answer_string);
        return answer;
    }
}