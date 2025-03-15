public class Ex14 {
    public static void main(String[] args) {

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);

        } catch (Exception e) {
            System.out.println("Ceva a mers prost.");
        } finally {
            System.out.println("Incercarea sa terminat.");
        }
    }
}
