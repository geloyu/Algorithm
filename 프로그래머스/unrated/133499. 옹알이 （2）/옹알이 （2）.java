class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] wordList = {"aya", "ye", "woo", "ma"};
        String[] repeatList = {"ayaaya", "yeye", "woowoo", "mama"};
        
        for(String e : babbling) {
            for(String repeatWord :repeatList) {
                e = e.replace(repeatWord, "X");
            }
            
            for(String word : wordList) {
                e = e.replace(word, "?");
            }
            
            int sign = 0;
            
            for(int i=0; i < e.length(); i++) {
                if(!e.subSequence(i, i+1).equals("?")) {
                    sign = 1;
                    break;
                }
            }
            
            if(sign == 0) {
                answer++;
            }
        }
        return answer;
    }
}