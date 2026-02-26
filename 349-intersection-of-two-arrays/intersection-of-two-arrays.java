import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Store elements of nums1
        for (int num : nums1) {
            set1.add(num);
        }

        // Find common elements
        for (int num : nums2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }

        // Convert set2 to array
        int[] result = new int[set2.size()];
        int i = 0;
        for (int num : set2) {
            result[i++] = num;
        }

        return result;
    }
}