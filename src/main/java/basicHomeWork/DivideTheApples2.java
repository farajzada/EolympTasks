package basicHomeWork;

import java.util.Scanner;

public class DivideTheApples2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(k % n);
    }
}
