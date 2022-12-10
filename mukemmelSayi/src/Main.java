import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Sayıyı giriniz: ");
        number = input.nextInt();
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }
        if (total == number) {
            System.out.println("Mükemmel Sayıdır.");
        } else {
            System.out.println("Mükemmel Sayı Değildir.");
        }
    }
}