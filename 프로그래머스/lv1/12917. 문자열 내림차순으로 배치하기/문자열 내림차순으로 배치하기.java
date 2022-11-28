import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] s_arr = s.split("");
        ArrayList<String> smallList = new ArrayList<>();
        ArrayList<String> bigList = new ArrayList<>();
        for(String e : s_arr){
            if(e == e.toUpperCase()) {
                bigList.add(e);
            }   else {
                smallList.add(e);
            }    
        }
        
        Collections.sort(bigList, Collections.reverseOrder());
        Collections.sort(smallList, Collections.reverseOrder());
        
        for(String e : bigList) {
            smallList.add(e);
        }
        
        answer = String.join("", smallList);
        
        return answer;
    }
}