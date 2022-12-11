import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Sıralanacak 3 sayıyı girin: ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        if (a > b && a > c) {
            if (b > c) {
                System.out.println(a + ">" + b + ">" + c);
            } else {
                System.out.println(a + ">" + c + ">" + b);
            }
        }


        if (b > c && b > a) {
            if (c > a) {
                System.out.println(b + ">" + c + ">" + a);
            } else {
                System.out.println(b + ">" + a + ">" + c);
            }
        }


        if (c > a && c > b) {
            if (a > b) {
                System.out.println(c + ">" + a + ">" + b);
            } else {
                System.out.println(c + ">" + b + ">" + a);
            }
        }

    }
}
