class Solution {
    public int solution(String s) {
        int answer = 0;
        String fixCharacter = "";
        int count1 = 0;
        int count2 = 0;
        String[] s_arr = s.split("");
        
        for(String e : s_arr) {
            if(fixCharacter.isEmpty()) {
                fixCharacter = e;
            }
            
            if (fixCharacter.equals(e)) {
                count1++;
            } else {
                count2++;
            }

            if(count1 == count2) {
                answer++;
                count1 = 0; 
                count2 = 0;
                fixCharacter = "";
            }
        }
    
        if(!fixCharacter.isEmpty()) {
            answer++;
        }
        
        return answer;
    }
}
