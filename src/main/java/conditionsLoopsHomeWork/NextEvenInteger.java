package conditionsLoopsHomeWork;

import java.util.Scanner;

public class NextEvenInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + 2);
        } else {
            System.out.println(n + 1);
        }
    }
}
