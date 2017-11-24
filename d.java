
public class d {

    public static void main(String[] args) {
        long num = 19, len = 0, binary = 0, noof1 = 0, rem, base = 1;

        while (num > 0) {
            rem = num % 2;
            /*  To count no.of 1s */
            if (rem == 1) {
                noof1++;
            }
            binary = binary + rem * base;
            num = num / 2;
            base = base * 10;
        }
        System.out.println("Binary = " + binary);
        while (binary != 0) {
            binary = binary / 10;
            len++;
        }
        System.out.println("No. of 1 = " + noof1);
        long noof0 = len - noof1;
        System.out.println("No. of 0 = " + noof0);

    }
}
