import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] my_string_arr = my_string.split("");
        Arrays.sort(my_string_arr, String.CASE_INSENSITIVE_ORDER);
        
        for(int i=0; i < my_string_arr.length; i++) {
            if(my_string_arr[i].equals(my_string_arr[i].toUpperCase())) {
                answer += my_string_arr[i].toLowerCase();
            } else {
                answer += my_string_arr[i];
            }
        }
        
        return answer;
    }
}