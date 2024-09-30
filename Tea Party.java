import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[] a = new int[n];
        int[] tea = new int[n];
        int totalMinTea = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            tea[i] = (a[i] + 1) / 2;
            totalMinTea += tea[i];
        }

        if (totalMinTea > w) {
            System.out.println(-1);
            return;
        }
        int remainingTea = w - totalMinTea;

        for (int i = 0; i < n; i++) {
            int maxPour = a[i] - tea[i];
            if (remainingTea > 0) {
                int pourAmount = Math.min(maxPour, remainingTea);
                tea[i] += pourAmount;
                remainingTea -= pourAmount;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(tea[i] + " ");
        }
        
        sc.close();
    }
}
