import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy, kilo;
        String cinsiyet;
        Scanner scan = new Scanner(System.in);
        System.out.println("Cinsiyet bilgisini 'E' veya 'K' olarak giriniz: ");
        cinsiyet = scan.nextLine();
        System.out.println("Boy bilgisini giriniz: ");
        boy = scan.nextDouble();
        System.out.println("Kilo bilgisini giriniz: ");
        kilo = scan.nextDouble();
        double bki = kilo / (boy * boy);

        if (cinsiyet == "E") {
            if (bki > 0 && bki <= 20) {
                System.out.println("Cinsiyetiniz: " + cinsiyet);
                System.out.println("Beden Kitle İndeksiniz: " + bki);
                System.out.println("Zayıf");
            }
            if (bki > 20 && bki <= 25) {
                System.out.println("Cinsiyetiniz: " + cinsiyet);
                System.out.println("Beden Kitle İndeksiniz: " + bki);
                System.out.println("Normal Kilolu");
            }
            if (bki > 25) {
                System.out.println("Cinsiyetiniz: " + cinsiyet);
                System.out.println("Beden Kitle İndeksiniz: " + bki);
                System.out.println("Aşırı Kilolu");
            }
        }


        else {
            if (bki > 0 && bki <= 19) {
                System.out.println("Cinsiyetiniz: " + cinsiyet);
                System.out.println("Beden Kitle İndeksiniz: " + bki);
                System.out.println("Zayıf");
            }
            if (bki > 19 && bki <= 24) {
                System.out.println("Cinsiyetiniz: " + cinsiyet);
                System.out.println("Beden Kitle İndeksiniz: " + bki);
                System.out.println("Normal Kilolu");
            }
            if (bki > 24) {
                System.out.println("Cinsiyetiniz: " + cinsiyet);
                System.out.println("Beden Kitle İndeksiniz: " + bki);
                System.out.println("Aşırı Kilolu");
            }
        }

    }
}
