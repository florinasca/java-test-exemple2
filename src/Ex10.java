import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        //creare obiect scanner
        Scanner scanner = new Scanner(System.in);
        int a; int numarUtilizator;
        numarUtilizator = 18;
        int b;
        final int numarUtilizator1 = numarUtilizator;
        int numarUtizator = 32;

        //numere introduse de user
        System.out.println("Introduceti numerele de la 18 la 32.");

        //numere introduse de user
        int numereUtilizator = scanner.nextInt();

        numarUtilizator = 0;
        if (numarUtilizator <= 18) {
            System.out.println("Este un numar par.");
        } else if (numarUtilizator >= 32) {
            System.out.println("Este un numar impar.");



        }
    }
}