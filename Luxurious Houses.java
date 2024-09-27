import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        int[] results = new int[n];
        int maxRight = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (heights[i] > maxRight) {
                results[i] = 0;
            } else {
                results[i] = maxRight - heights[i] + 1;
            }
            maxRight = Math.max(maxRight, heights[i]);
        }

        for (int result : results) {
            System.out.print(result + " ");
        }
    }
}
