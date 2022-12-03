import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int e : arr) {
            if(!list.get(list.size()-1).equals(e)) {
                list.add(e);
            }
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        // System.out.println(list.get(list.size()-1));

        return list;
    }
}