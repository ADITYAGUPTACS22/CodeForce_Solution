import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            int[] plays = new int[n];
            int[] clears = new int[n];
            for (int i = 0; i < n; i++) {
                plays[i] = sc.nextInt();
                clears[i] = sc.nextInt();
            }
            System.out.println(isValidRecord(n, plays, clears) ? "YES" : "NO");
        }
    }

    private static boolean isValidRecord(int n, int[] plays, int[] clears) {
        for (int i = 0; i < n; i++) {
            if (clears[i] > plays[i]) {
                return false;
            }
            if (i > 0) {
                if (plays[i] < plays[i - 1] || clears[i] < clears[i - 1]) {
                    return false; 
                }
                if ((plays[i] - plays[i - 1]) < (clears[i] - clears[i - 1])) {
                    return false;
                }
            }
        }
        return true;
    }
}
