import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1 = 0;
        int sayi2 = 1;
        int toplam;
        int elemanSayisi;
        Scanner input = new Scanner(System.in);
        System.out.println("Fibonacci dizimiz kaç elamanlı olsun? :  ");
        elemanSayisi = input.nextInt();
        for (int i = 1; i<=elemanSayisi; i++) {
            System.out.print(sayi1 + " , ");
            toplam = sayi1 + sayi2;
            sayi1 = sayi2;
            sayi2 = toplam;

        }
    }
}