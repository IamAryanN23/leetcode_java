import java.util.ArrayList;
import java.util.List;

public class mergestringalternate {
    public static String mergeAlternately(String word1, String word2) {
        char[] char1 = word1.toCharArray();
        char[] char2 = word2.toCharArray();
        List<Character> newlist = new ArrayList<>();

        int size1 = char1.length;
        int size2 = char2.length;
        int max = Math.max(size1, size2);
        char[] newchar = new char[size1 + size2];

        for (int i = 0; i < max; i++) {
            if (i < size1) {
                newlist.add(char1[i]);
            }
            if (i < size2) {
                newlist.add(char2[i]);
            }
        }

        // Convert the List<Character> to a char array
        for (int i = 0; i < newlist.size(); i++) {
            newchar[i] = newlist.get(i);
        }

        return new String(newchar);
    }

    public static void main(String[] args) {
        String w1 = "ace", w2 = "bdf";
        System.out.println(mergeAlternately(w1, w2));  // Output: abcdef
    }
}
