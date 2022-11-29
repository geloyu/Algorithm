import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int count = 0; 
        String answer = "";
        while (count < a) {
            answer += "*";
            count++;
        }
        
        int height = 0;
        while (height < b) {
            System.out.println(answer);
            height++;
        }
    }
}