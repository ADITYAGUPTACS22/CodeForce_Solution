import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int t = sc.nextInt();
        Set<String> waste = new HashSet<>();
        for (int i = 0; i < k; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            waste.add((a - 1) * m + (b - 1) + "");
        }
        String[] res = new String[t];
        for (int i = 0; i < t; i++) {
            int r = sc.nextInt(), c = sc.nextInt();
            int idx = (r - 1) * m + (c - 1);
            if (waste.contains(idx + "")) {
                res[i] = "Waste";
            } else {
                int wc = 0;
                for (String w : waste) {
                    if (Integer.parseInt(w) < idx) wc++;
                }
                int ci = idx - wc;
                switch (ci % 3) {
                    case 0: res[i] = "Carrots"; break;
                    case 1: res[i] = "Kiwis"; break;
                    case 2: res[i] = "Grapes"; break;
                }
            }
        }
        for (String r : res) {
            System.out.println(r);
        }
    }
}
