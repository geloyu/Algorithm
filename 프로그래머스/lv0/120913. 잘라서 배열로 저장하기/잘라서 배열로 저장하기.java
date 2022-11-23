import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        
        String[] my_str_arr = my_str.split("");
        int resultLength = (int) Math.ceil((double) my_str_arr.length / n);       
        String[] answer = new String[resultLength];
        
        int startIndex = 0; 
        int endIndex = 0;
        
        for(int i=0; i < resultLength; i++){
            
            if(i == resultLength-1) {
                endIndex = startIndex + my_str_arr.length - startIndex;
            } else {
                endIndex = startIndex + n;
            }
            
            String[] arr = Arrays.copyOfRange(my_str_arr, startIndex, endIndex);
            String arrString = String.join("", arr);
            
            answer[i] = arrString;  
            startIndex += n;
        }

        return answer;
    }
}