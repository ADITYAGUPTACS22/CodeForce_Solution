import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        String[] units = {
            "zero", "one", "two", "three", "four", 
            "five", "six", "seven", "eight", "nine", 
            "ten", "eleven", "twelve", "thirteen", "fourteen", 
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
        };
        String[] tens = {
            "", "", "twenty", "thirty", "forty", 
            "fifty", "sixty", "seventy", "eighty", "ninety"
        };
        
        String result = "";
        if (s < 20) {
            result = units[s];
        } else {
            result = tens[s / 10];
            if (s % 10 != 0) {
                result += "-" + units[s % 10];
            }
        }
        System.out.println(result);
    }
}
