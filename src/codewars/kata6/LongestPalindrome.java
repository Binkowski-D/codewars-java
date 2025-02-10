package codewars.kata6;

public class LongestPalindrome {
    public static void main(String[] args) {

        System.out.println(longestPalindrome("a"));        // 1
        System.out.println(longestPalindrome("aab"));      // 2
        System.out.println(longestPalindrome("abcde"));    // 1
        System.out.println(longestPalindrome("zzbaabcd")); // 4
        System.out.println(longestPalindrome(""));         // 0

    }

    public static int longestPalindrome(final String s){
        if(s == null || s.isEmpty()){
            return 0;
        }

        int maxLength = 1;

        for(int i = 0; i < s.length(); i++){
            int firstLength = expandAroundCenter(s, i, i); // odds
            int secondLength = expandAroundCenter(s, i, i + 1); // evens

            maxLength = Math.max(maxLength, Math.max(firstLength, secondLength));
        }

        return maxLength;
    }

    private static int expandAroundCenter(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){

            left--;
            right++;

        }
        return right - left - 1;
    }
}

// aba