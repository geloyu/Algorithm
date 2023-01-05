class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int matched = 0;
        
        for (int lottos_e : lottos) {
            if(lottos_e == 0) {
                zero++;
            } else {
                for (int win_e : win_nums) {
                    if(lottos_e == win_e) {
                        matched++;
                        break;
                    }
                }
            }
        }
        
        int min = matched;
        int max = matched + zero;
        
        int[] answer = {Math.min(7 - max, 6), Math.min(7 - min, 6)};
        return answer;
    }
}