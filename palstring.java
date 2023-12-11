class palstring {
    public static boolean isPalindrome(String s) {
        if (s.trim().isEmpty()) 
        {
            return true;
        } 
        else 
        {
            String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            int left = 0;
            int right = cleanedString.length() - 1;

            while (left < right) 
            {
                if (cleanedString.charAt(left) != cleanedString.charAt(right)) 
                {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
    
    
    
    
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
    }
}
