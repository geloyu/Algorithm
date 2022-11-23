public class Solution {
    public int solution(int n) {
        int answer = 0;

        String n_string = Integer.toString(n);
        String[] n_string_arr = n_string.split("");
        
        for(String e : n_string_arr) {
            answer += Integer.parseInt(e);
        }

        return answer;
    }
}