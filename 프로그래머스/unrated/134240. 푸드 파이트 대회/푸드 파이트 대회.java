class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for(int i=1; i < food.length; i++) {
            if(food[i] >= 2) {
                int count = 0;
                int maxCount = food[i] / 2;
                while (count < maxCount) {
                    answer += Integer.toString(i);
                    count++;
                }
            }
        }
        
        StringBuffer sb = new StringBuffer(answer);
        String reverse = sb.reverse().toString();
             
        answer += "0" + reverse;
        
        return answer;
    }
}