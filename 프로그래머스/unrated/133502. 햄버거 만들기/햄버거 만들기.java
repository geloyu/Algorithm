import java.util.ArrayList;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        ArrayList<Integer> ingredient_arr = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(1);
        
        for(int i=0; i < ingredient.length; i++){
            ingredient_arr.add(ingredient[i]);
            
            if(ingredient_arr.size() >= 4) {
                ArrayList<Integer> tempList = new ArrayList<>();
                tempList.add(ingredient_arr.get(ingredient_arr.size() - 4));
                tempList.add(ingredient_arr.get(ingredient_arr.size() - 3));
                tempList.add(ingredient_arr.get(ingredient_arr.size() - 2));
                tempList.add(ingredient_arr.get(ingredient_arr.size() - 1));

                if(tempList.equals(result)) {
                    answer++;
                    ingredient_arr.remove(ingredient_arr.size()-1);
                    ingredient_arr.remove(ingredient_arr.size()-1);
                    ingredient_arr.remove(ingredient_arr.size()-1);
                    ingredient_arr.remove(ingredient_arr.size()-1);
                }
            }
        }
        
        return answer;
    }
}