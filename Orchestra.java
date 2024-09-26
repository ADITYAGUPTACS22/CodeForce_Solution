import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int r = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[][] violas = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            violas[i][0] = sc.nextInt() - 1; 
            violas[i][1] = sc.nextInt() - 1; 
        }
        
        int validPhotographs = 0;
        for (int top = 0; top < r; top++) {
            for (int bottom = top; bottom < r; bottom++) {
                for (int left = 0; left < c; left++) {
                    for (int right = left; right < c; right++) {
                      
                        int count = 0;
                        
                        for (int i = 0; i < n; i++) {
                            if (violas[i][0] >= top && violas[i][0] <= bottom &&
                                violas[i][1] >= left && violas[i][1] <= right) {
                                count++;
                            }
                        }
                        
                        if (count >= k) {
                            validPhotographs++;
                        }
                    }
                }
            }
        }
        
        System.out.println(validPhotographs);
        
    }
}
