import java.util.Scanner;

import static java.lang.Math.*;

/**
 * Created by zengjinjie on 2017/4/1 0001.
 */
public class Qunar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNextLine()) {
            String number = s.nextLine();
            long result = 0;
            for(int i = 0; i < number.length(); i ++) {
                char a = number.charAt(i);
                int b = a - 97;
                result += b * pow(26, number.length() - i - 1);
                System.out.println(result);
            }
        }


    }
}
