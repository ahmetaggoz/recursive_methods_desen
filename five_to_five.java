package RecursiveMethods;

import java.util.Scanner;

public class five_to_five {

    static void besEksilt(int sayi) {
        System.out.print(sayi+" ");
        if (sayi>0){
            besEksilt(sayi-5);
        }
        System.out.print(sayi+" ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı girin: ");
        int sayi = scanner.nextInt();
        besEksilt(sayi);
    }
}
