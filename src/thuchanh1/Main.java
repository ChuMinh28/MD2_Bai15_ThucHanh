package thuchanh1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a: ");
        float a = scanner.nextInt();
        System.out.println("Enter number b: ");
        float b = scanner.nextInt();
        float div = a/b;
        System.out.println("Div of a and b is: "+div);
    }
}
