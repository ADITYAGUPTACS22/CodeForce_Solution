import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
        String b = sc.nextLine();
        int n = a.length();
        
        int count_4_to_7 = 0;
        int count_7_to_4 = 0;

        for (int i = 0; i < n; i++) {
            if (a.charAt(i) == '4' && b.charAt(i) == '7') {
                count_4_to_7++;
            } else if (a.charAt(i) == '7' && b.charAt(i) == '4') {
                count_7_to_4++;
            }
        }
        
        int minOperations = Math.max(count_4_to_7, count_7_to_4);
        
        System.out.println(minOperations);
    }
}
