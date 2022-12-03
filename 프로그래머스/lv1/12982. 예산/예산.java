import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int sum = 0;
        int count = 0;
        Arrays.sort(d);

        for(Integer e : d) {
            sum += e;
            if(sum > budget) {
                break;
            }
            count++;
        }
        
        return count;
    }
}