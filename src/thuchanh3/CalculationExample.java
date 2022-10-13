package thuchanh3;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap x: ");
        int x = scanner.nextInt();
        System.out.println("Hay nhap y: ");
        int y = scanner.nextInt();
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculate(x, y);
    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tong a va b la: " + a);
            System.out.println("Hieu a va b la: " + b);
            System.out.println("Tich a va b la: " + c);
            System.out.println("Thuong 2 va b la: " + d);
        } catch (Exception e) {
            System.out.println("Xay ra ngoai le");
        }
    }
}
