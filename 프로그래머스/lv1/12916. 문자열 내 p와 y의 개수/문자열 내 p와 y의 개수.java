class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int pCount = 0;
        int yCount = 0;
        
        String[] s_arr = s.split("");
        
        for(String e : s_arr) {
            if("P".equals(e) || "p".equals(e)) {
                pCount++;
            } else if("Y".equals(e) || "y".equals(e)) {
                yCount++;
            }
        }
        
        answer = pCount == yCount ? true : false;

        return answer;
    }
}