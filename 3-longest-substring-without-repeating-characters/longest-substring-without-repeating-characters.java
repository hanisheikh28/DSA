class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max = 0;
        Set<Character> ch = new HashSet<>();
        for(int rigth = 0;rigth<s.length();rigth++){
            while(ch.contains(s.charAt(rigth))){
                ch.remove(s.charAt(left));
                left++;

            }
            ch.add(s.charAt(rigth));
            max = Math.max(max,rigth-left+1);
            
        }
        return max;
    }
}