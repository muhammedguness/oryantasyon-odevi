import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 4, 6, 8, 34, 12, 13, 34};

        Scanner input = new Scanner(System.in);
        int aranacakSayi;
        System.out.println("Aranacak sayıyı giriniz: ");
        aranacakSayi = input.nextInt();

        boolean control = false;

        for (int liste : numbers) {
            if(liste == aranacakSayi){
                control = true;
            }
        }

        if (control) {
            System.out.println("Aradığınız sayı listenin içindedir.");
        }
        else {
            System.out.println("Aradığınız sayı listenin içinde bulunmamaktadır.");
        }
    }
}
