import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int x = sc.nextInt();
            int digit = x % 10;
            int length = String.valueOf(x).length();
            int totalKeyPresses = 0;
            
            for (int i = 1; i < digit; i++) {
                totalKeyPresses += 1 + 2 + 3 + 4; 
            }
            
            for (int i = 1; i <= length; i++) {
                totalKeyPresses += i;
            }
            System.out.println(totalKeyPresses);
        }
    }
}
