import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Test = sc.nextInt();
        
        for (int t = 0; t < Test; t++) {
            int n = sc.nextInt();
            boolean valid = true;
            int prev_P = 0, prev_C = 0;
            
            for (int i = 0; i < n; i++) {
                int p = sc.nextInt();
                int c = sc.nextInt();
                
                if (p < prev_P || c < prev_C || c > p || (p - prev_P) < (c - prev_C)) {
                    valid = false;
                }
                
                prev_P = p;
                prev_C = c;
            }
            
            if (valid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
