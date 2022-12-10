import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Sayıyı giriniz: ");
        number = input.nextInt();
        boolean isPrime = true;
        if (number == 1) {
            System.out.println("Sayı asal değildir.");
            return;
        }

        if (number < 1) {
            System.out.println("Geçersiz sayı girdiniz.");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime == true) {
            System.out.println("Sayı asaldır.");
        } else {
            System.out.println("Sayı asal değildir");
        }

    }

}