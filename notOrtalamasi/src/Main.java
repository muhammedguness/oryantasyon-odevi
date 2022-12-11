import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double bbg,algoritma,matematik,fizik;
        System.out.println("Bilgisayar bilimine giriş notunu giriniz: ");
        bbg = input.nextDouble();
        System.out.println("Algoritma notunu giriniz: ");
        algoritma = input.nextDouble();
        System.out.println("Matematik notunu giriniz: ");
        matematik = input.nextDouble();
        System.out.println("Fizik notunu giriniz: ");
        fizik = input.nextDouble();
        double ortalama = (bbg + algoritma + matematik + fizik) / 4 ;
        System.out.println("Ortalamanız: " + ortalama);
        if(ortalama<50){
            System.out.println("Maalesef Kaldınız");
        }
        else {
            System.out.println("Geçtiniz");
        }
    }
}