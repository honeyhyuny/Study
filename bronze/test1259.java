import java.util.Arrays;
import java.util.Scanner;

public class test1259 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {

            String a;
            a = sc.nextLine();
            if (a.equals("0"))
                break;

            int[] ab = new int[a.length()];
            int[] cd = new int[a.length()];
            for (int i = 0; i < a.length(); i++) {
                ab[i] = a.charAt(i) - '0';
            }

            for (int i = ab.length - 1; i > -1; i--) {
                cd[i] = ab[ab.length - i - 1];
            }

            if (Arrays.equals(ab, cd))
                System.out.println("yes");
            else System.out.println("no");

        }
        sc.close();

    }
}
