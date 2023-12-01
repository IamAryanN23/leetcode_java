public class two_strings 
{

        public static boolean arrayStringsAreEqual(String word1, String word2) 
        {
        return word1.equals(word2); 
        }

        public static void main(String[] args) 
        {
        String s1[] = {"abcddefg"}, s2[] = {"abcd", "d","efg"};
        String st1 = String.join("",s1);
        String st2 = String.join("",s2);
        System.out.println(arrayStringsAreEqual(st1,st2));
        }

}