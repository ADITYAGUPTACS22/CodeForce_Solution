import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[] a = new int[n];
        int[] res = new int[n];
        int minTotal = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            res[i] = (a[i] + 1) / 2;
            minTotal += res[i];
        }

        if (minTotal > w) {
            System.out.println(-1);
            return;
        }

        w -= minTotal;
        List<Integer> idx = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            idx.add(i);
        }

        Collections.sort(idx, (x, y) -> a[y] - a[x]);

        for (int i : idx) {
            int add = Math.min(w, a[i] - res[i]);
            res[i] += add;
            w -= add;
            if (w == 0) break;
        }

        for (int r : res) {
            System.out.print(r + " ");
        }
        sc.close();
    }
}
