import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] points = new long[n];
        for (int i = 0; i < n; i++) {
            points[i] = scanner.nextLong();
        }
        Arrays.sort(points);
        long optimalPoint;
        if (n % 2 == 1) {
            
            optimalPoint = points[n / 2];
        } else {
            
            optimalPoint = points[n / 2 - 1];
        }
        System.out.println(optimalPoint);
    }
}
