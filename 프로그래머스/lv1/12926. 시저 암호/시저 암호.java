import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String[] lowerAlphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] upperAlphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] s_arr = s.split("");
        
        for(int i=0; i < s_arr.length; i++) {
            int index = 0;
            int checkIndex = 0;
            
            if(s_arr[i].isBlank()) {
                answer += " ";
                
            } else if(s_arr[i].equals(s_arr[i].toUpperCase())) {
                checkIndex = Arrays.asList(upperAlphabet).indexOf(s_arr[i]);
                index = checkIndex + n > 25 ? checkIndex + n - 26 : checkIndex + n;
                answer += upperAlphabet[index];
                
            } else if(s_arr[i].equals(s_arr[i].toLowerCase())) {
                checkIndex = Arrays.asList(lowerAlphabet).indexOf(s_arr[i]);
                index = checkIndex + n > 25 ? checkIndex + n - 26 : checkIndex + n;
                answer += lowerAlphabet[index];
                
            } 
        }
        return answer;
    }
}