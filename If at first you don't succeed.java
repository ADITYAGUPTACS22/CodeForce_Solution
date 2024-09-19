import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); 
        int B = sc.nextInt(); 
        int C = sc.nextInt(); 
        int N = sc.nextInt(); 

        int result = calculateNonPassStudents(A, B, C, N);
        System.out.println(result);
    }

    private static int calculateNonPassStudents(int A, int B, int C, int N) {
        if (C > A || C > B || A + B - C >= N || A < 0 || B < 0 || C < 0 || N < 0) {
            return -1;
        }

        int nonPassStudents = N - (A + B - C);
        return nonPassStudents > 0 ? nonPassStudents : -1;
    }
}
