class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int rigth = s.length-1;
        while(left<rigth){
          char swap = s[left];
            s[left]  = s[rigth];
            s[rigth] = swap;
            left++;
            rigth--;
            
        }
    }
}