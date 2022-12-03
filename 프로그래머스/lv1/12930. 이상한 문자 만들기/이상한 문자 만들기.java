class Solution {
  public String solution(String s) {

        String answer = "";
        int count = 0;
        String[] s_arr = s.split("");

        for(String e : s_arr) {
            count = e.contains(" ") ? 0 : count + 1;
            answer += count % 2 == 0 ? e.toLowerCase() : e.toUpperCase(); 
        }
      return answer;
  }
}