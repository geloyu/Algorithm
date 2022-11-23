import java.util.*;
class Solution {
    public ArrayList<Integer> solution(long n) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        String n_string = Long.toString(n);
        String[] n_string_arr = n_string.split("");
        
        for(int i = n_string_arr.length-1; i >= 0; i--) {
            answer.add(Integer.parseInt(n_string_arr[i]));
        }
        
        return answer;
    }
}