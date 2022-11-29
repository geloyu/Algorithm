class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;

        int i = 1;
        long totalCost = 0; 
        while(i <= count) {
            totalCost += price * i;
            i++;
        }
        
        if(totalCost <= money){
            return 0;
        } 
        
        answer = totalCost - money;
        return answer;
    }
}