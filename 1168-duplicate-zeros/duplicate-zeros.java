class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == 0) {
                // shift elements to the right
                for (int j = n - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                // duplicate zero
                i++; // skip the next position (just duplicated)
            }
        }
    }
}