import java.util.Scanner;

public class Ex2 {
    // 2.   Scrieți un program Java ce primeste un numar
    // de la tastatura, iar programul ne spune daca numarul este pozitiv sau negativ.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un numar intreg: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Numarul introdus este pozitiv.");
        } else {
            System.out.println("Numarul introdus este negativ.");
        }

    }
}




