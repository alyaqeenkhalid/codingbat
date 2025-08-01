public int maxSpan(int[] nums) {
  int maxSpan = 0;
    for (int i = 0; i < nums.length; i++) {
        for (int j = nums.length - 1; j >= i; j--) {
            if (nums[i] == nums[j]) {
                int span = j - i + 1;
                if (span > maxSpan) {
                    maxSpan = span;
                }
                break; 
            }
        }
    }
    return maxSpan;
}
