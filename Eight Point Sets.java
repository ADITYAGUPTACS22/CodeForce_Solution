import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Point> points = new HashSet<>();

        for (int i = 0; i < 8; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            points.add(new Point(x, y));
        }
        
        List<Integer> xCoords = new ArrayList<>();
        List<Integer> yCoords = new ArrayList<>();
        
        for (Point p : points) {
            if (!xCoords.contains(p.x)) {
                xCoords.add(p.x);
            }
            if (!yCoords.contains(p.y)) {
                yCoords.add(p.y);
            }
        }
        
        if (xCoords.size() != 3 || yCoords.size() != 3) {
            System.out.println("ugly");
            return;
        }

        Collections.sort(xCoords);
        Collections.sort(yCoords);
        
        Set<Point> expectedPoints = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                expectedPoints.add(new Point(xCoords.get(i), yCoords.get(j)));
            }
        }

        expectedPoints.remove(new Point(xCoords.get(1), yCoords.get(1)));
        
        if (points.equals(expectedPoints)) {
            System.out.println("respectable");
        } else {
            System.out.println("ugly");
        }
            }

    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()){
                 return false;
            }
            Point point = (Point) obj;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
