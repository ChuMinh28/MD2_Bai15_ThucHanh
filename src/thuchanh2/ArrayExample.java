package thuchanh2;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random random = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sach phan tu cua mang: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner scanner= new Scanner(System.in);
        System.out.println("Vui long nhap chi so cua 1 phan tu bat ky: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Gia tri cu phan tu co chi so "+x+" la: "+arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("Chi so vuuot qua gioi han");
        }
    }
}
