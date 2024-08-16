import java.util.*;

public class Main {
    
    static void solve(int count) {
        if (count == 0) {
            System.out.println(0);
        } else if (count <= 3) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            int onesCount = 0;
            for (int i = 0; i < 4; i++) {
                if (sc.nextInt() == 1) {
                    onesCount++;
                }
            }
            solve(onesCount);
        }
    }
}
