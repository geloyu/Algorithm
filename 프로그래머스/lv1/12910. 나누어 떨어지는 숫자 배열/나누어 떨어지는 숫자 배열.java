import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int e : arr) {
            if(e % divisor == 0) {
                list.add(e);
            }
        }
        
        if(list.size() == 0) {
            list .add(-1);
        }
        
        return list;
    }
}