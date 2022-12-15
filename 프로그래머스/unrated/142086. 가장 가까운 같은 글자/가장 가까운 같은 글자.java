import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String s) {
        int[] answer = {};
        String[] s_arr = s.split("");
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        
        for(int i=0; i < s_arr.length; i++) {
           
            if(map.containsKey(s_arr[i]) == true) {
                list.add(i - map.get(s_arr[i]));
            } else {
                list.add(-1);
            }
            
             map.put(s_arr[i], i);
        }
     
        return list;
    }
}