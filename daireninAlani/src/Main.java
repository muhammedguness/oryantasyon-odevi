import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçapı giriniz: ");
        double yariCap = input.nextDouble();

        double alan = pi * yariCap * yariCap;
        double cevre = 2 * pi * yariCap;
        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);
    }
}
