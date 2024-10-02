import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long r = sc.nextLong();
        long avg = sc.nextLong();
        long totalRequired = n * avg;
        long currentTotal = 0;
        List<long[]> grades = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            long ai = sc.nextLong();
            long bi = sc.nextLong();
            grades.add(new long[]{ai, bi});
            currentTotal += ai;
        }
        
        long pointsNeeded = totalRequired - currentTotal;
        if (pointsNeeded <= 0) {
            System.out.println(0);
            return;
        }
    
        grades.sort((g1, g2) -> Long.compare(g1[1], g2[1]));
        
        long essaysNeeded = 0;
        
        for (long[] grade : grades) {
            long currentGrade = grade[0];
            long essaysPerPoint = grade[1];
            
            long maxIncrease = r - currentGrade;
            long increase = Math.min(maxIncrease, pointsNeeded);
            
            essaysNeeded += increase * essaysPerPoint;
            pointsNeeded -= increase;
            
            if (pointsNeeded <= 0) {
                break;
            }
        }
        
        System.out.println(essaysNeeded);
    }
}
