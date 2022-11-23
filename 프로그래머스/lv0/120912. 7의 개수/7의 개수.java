class Solution {
    public int solution(int[] array) {

        String num = "";
		
		for(int i = 0; i<array.length; i++) {
			num += array[i];
		}
		System.out.println(num);
		
        char[] strChar = num.toCharArray();
		int answer = 0;
		for(int i = 0; i<strChar.length; i++) {
			if( strChar[i] == '7') {
				answer++;
			}
		}

        return answer;
    }
}