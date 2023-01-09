
import java.util.Scanner;

public class Test1439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int [] a = new int[S.length()];

        for (int i=0;i<a.length;i++)
            a[i]= S.charAt(i)-'0';

        int count=0;
        for(int i=1;i<a.length;i++)
            if(a[i]==a[i-1])
                count++;

        System.out.println((a.length-count)/2);

    }
}
