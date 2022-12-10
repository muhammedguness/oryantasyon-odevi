import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String harf;
        System.out.println("Harfi giriniz: ");
        harf = input.nextLine();
        switch (harf){
            case "A":
            case "I":
            case "O":
            case "U":
                System.out.println("Kalın Sesli Harf");
                break;
            case "E":
            case "İ":
            case "Ö":
            case "Ü":
                System.out.println("İnce Sesli Harf");
                break;
            default:
                System.out.println("Girdiğiniz harf sessiz harftir.");

        }
    }
}