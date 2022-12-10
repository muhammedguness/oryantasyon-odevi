import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int sayi1,sayi2;
       System.out.println("1. sayıyı giriniz: ");
       sayi1 = input.nextInt();
       System.out.println("2.sayıyı giriniz: ");
       sayi2 = input.nextInt();
        int total1 = 0;
        int total2 = 0;
        System.out.println("1.sayı = " + sayi1);
        System.out.println("-------------");
        System.out.println("2.sayı = " + sayi2);
        System.out.println("-------------");
        System.out.println("1. sayının bölenleri : ");
        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                System.out.println(i);
                total1 = total1 + i;
            }
        }
        System.out.println("1.sayının bölenleri toplamı: " + total1);
        System.out.println("-------------");
        System.out.println("2.sayının bölenleri : ");
        for (int j = 1; j < sayi2; j++) {
            if (sayi2 % j == 0) {
                System.out.println(j);
                total2 = total2 + j;
            }
        }
        System.out.println("2.sayının bölenleri toplamı: " + total2);
        System.out.println("--------------");
        if (total1 == sayi2 && total2 == sayi1) {
            System.out.println("Arkadaş sayıdırlar.");
        } else {
            System.out.println("Arkadaş sayı değiller.");
        }
    }
}