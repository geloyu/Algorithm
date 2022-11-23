import java.util.*;
class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String A2 = A;
        for(int i=0; i < A.length(); i++) {
            if(A2.equals(B)) {
                return answer;
            }
            
            String a = A2.substring(A2.length()-1);
            A2 = a + A2.substring(0, A2.length()-1);
            answer++;
        }
        return -1;
    }
}