import java.util.*;
class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        // 1단계 소문자 변환 
        new_id = new_id.toLowerCase();
        
        // 2단계 특수문자 제거 
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        
        // 3단계 연속된 마침표 하나로 치환 
        new_id = new_id.replaceAll("[.]{2,}", ".");
        
        // 4단계 처음이나 끝에 위치한 마침표 제거
        new_id = new_id.replaceAll("^[.]|[.]$", "");
        
        // 5단계 빈 문자열이면 a로 치환 
        new_id = new_id.equals("") ? "a" : new_id;
        
        // 6단계 길이가 16이면 15로 제한 후 나머지 제거 
        new_id = new_id.length() > 15 ? new_id.substring(0, 15).replaceAll("[.]$", "") : new_id;
        
        // 7단계 길이가 2이하면 마지막 문자를 반복해서 추가 
        while (new_id.length() <= 2) {
            new_id += new_id.substring(new_id.length() - 1);
        }
        
        answer = new_id;
        
        return answer;
    }
    
}