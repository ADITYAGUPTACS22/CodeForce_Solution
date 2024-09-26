
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        int s = sc.nextInt();
        
        int[] arrivalTimes = new int[s + 1];
        
        for (int i = 0; i < n; i++) {
            int fi = sc.nextInt(); 
            int ti = sc.nextInt(); 
            arrivalTimes[fi] = Math.max(arrivalTimes[fi], ti); 
        }
        
        int currentTime = 0;
        
        for (int floor = s; floor >= 0; floor--) {
            if (arrivalTimes[floor] > currentTime) {
                currentTime = arrivalTimes[floor];
            }
            currentTime++;
        }
        
        System.out.println(currentTime - 1); 
    }
}
