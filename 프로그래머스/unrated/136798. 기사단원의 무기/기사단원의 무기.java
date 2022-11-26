import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {        
        int answer = 0;
        ArrayList<Integer> powerList = new ArrayList<>();

        for(int i=1; i <= number; i++) {
            // 무기 공격력 = 약수의 갯수 
            int measurePower = measureCount(i);
            
            if(measurePower > limit) {
                answer += power;
            } else {
                answer += measurePower;   
            }
        }
        
        return answer;
    }
    
    // 약수 갯수 구하기
    public int measureCount (int number) {
        int count = 0;
        for (int i = 1; i * i <= number; i++) {
            if (i * i == number) {
                count++;
            } else if(number % i == 0) {
                count += 2;
            }
        }
        return count;
    }
}