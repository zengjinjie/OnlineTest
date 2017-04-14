import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by zengjinjie on 2017/4/1 0001.
 * This is same to LeetCode 126 & 127
 */
public class Qunar2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        String c = s.nextLine();
        String[] word = c.split(" ");
        Set<String> dict= new HashSet<String>();
        for(String ss : word) {
            dict.add(ss);
        }

        int result = distance(a, b, dict);
        System.out.println(result);
    }

    public static int distance(String begin, String end, Set<String> wordDict) {
        Set<String> reached = new HashSet<String>();
        reached.add(begin);
        wordDict.add(end);
        int distance = 1;
        while (!reached.contains(end)) {
            Set<String> addIn = new HashSet<String>();
            for (String e : reached) {
                for (int i = 0; i < e.length(); i++) {
                    char[] chs = e.toCharArray();
                    for (char c = 'a'; c <= 'z'; c++) {
                        chs[i] = c;
                        String w = new String(chs);
                        if (wordDict.contains(w)) {
                            addIn.add(w);
                            wordDict.remove(w);
                        }
                    }
                }
            }
            distance ++;
            if (addIn.size() == 0) return 0;
            reached = addIn;
        }
        return distance;
    }
}
