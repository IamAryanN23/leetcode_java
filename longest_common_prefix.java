import java.util.Arrays;
class longestCommonPrefix {
    public static String longestCommon(String[] strs) 
    {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int len1=s1.length(), len2=s2.length();
        int idx = 0;
        while(idx < len1 && idx < len2){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
    public static void main(String[] args) {
        String[] s1 = {"dog","racecar","car"};
        System.out.println(longestCommon(s1));
    }
}
