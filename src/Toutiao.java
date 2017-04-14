import java.util.Scanner;

/**
 * Created by zengjinjie on 2017/3/30 0030.
 */
public class Toutiao {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int q = s.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[2];

        for(int i = 0; i < n; i ++) {
            a[i] = s.nextInt();
        }
        for(int i = 0; i < n; i ++) {
            b[i] = s.nextInt();
        }

        for(int i = 0; i < q; i ++) {
            c[0] = s.nextInt();
            c[1] = s.nextInt();
            int sum = 0;
            for(int j = 0; j < n; j ++) {
                if(a[j] >= c[0] && b[j] >= c[1] )
                    sum ++;
            }
            System.out.println(sum);
        }

    }
}
