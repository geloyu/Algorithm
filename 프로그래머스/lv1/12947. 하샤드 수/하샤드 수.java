class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String x_string = Integer.toString(x);
        String[] x_string_arr = x_string.split("");
        int sum = 0;
        
        for(String e : x_string_arr) {
            sum += Integer.parseInt(e);
        }
        
        answer = x % sum == 0 ? true : false;
        
        return answer;
    }
}