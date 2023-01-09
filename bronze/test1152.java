import java.util.Scanner;
import java.util.StringTokenizer;

public class test1152 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        StringTokenizer st = new StringTokenizer(a," ");
        int b = st.countTokens();
        System.out.println(b);
    }
}
