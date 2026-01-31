
class Solution {
    public boolean isPalindrome(String s) {
        // Step 1: Convert to lowercase
        s = s.toLowerCase();

        // Step 2: Remove all non-alphanumeric characters
        s = s.replaceAll("[^a-z0-9]", "");

        // Step 3: Use two-pointer approach
        int i = 0, j = s.length() - 1;

        while (i < j) {
            // Compare characters at both ends
            if (s.charAt(i) != s.charAt(j)) {
                return false;  // Not a palindrome
            }
            i++;
            j--;
        }

        return true;  // Palindrome
    }
}
