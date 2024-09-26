import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long[] a = new long[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        
        
        if (n == 1) {
            System.out.println(1);
            return;
        }
        if (n == 2) {
            System.out.println(2);
            return;
        }
        
        int maxLength = 2; 
        int currentLength = 2; 

        for (int i = 2; i < n; i++) {
            if (a[i] == a[i - 1] + a[i - 2]) {
                currentLength++;
            } else {
              
                currentLength = 2; 
            }
            maxLength = Math.max(maxLength, currentLength);
        }
        System.out.println(maxLength);
        
    }
}
