import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine(); 
            char[][] grid = new char[n][m];

            for (int i = 0; i < n; i++) {
                grid[i] = sc.nextLine().toCharArray();
            }

            int minRow = n, minCol = m;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == 'R') {
                        if (i < minRow) {
                            minRow = i;
                        }
                        if (j < minCol) {
                            minCol = j;
                        }
                    }
                }
            }
            if (grid[minRow][minCol] == 'R') {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
