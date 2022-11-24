class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        String[] phone_number_arr = phone_number.split("");
        
        for(int i=0; i < phone_number_arr.length; i++) {
            if(i < phone_number_arr.length-4) {
                answer += "*";
            } else {
                answer += phone_number_arr[i];
            }
        }
        
        return answer;
    }
}