import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        byte numarByte = 50;
        short numarShort = (byte) numarByte;//convertire manuala

        System.out.println(numarShort);
        System.out.println(numarByte);

        int numarInt = 100;
        double numarDouble = (int) numarInt;//convertire manuala

        System.out.println(numarInt);
        System.out.println(numarDouble);

        long numarLong = 100L;
        int numarInteger = (int) numarLong;//convertire manuala

        System.out.println(numarLong);
        System.out.println(numarInteger);

    }
}

