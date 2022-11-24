import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int count = 0;
        
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        while (count < 10) {
            if(!list.contains(count)) {
                answer += count;
            }
            
            count++;
        }
        
        return answer;
    }
}