public int maxMirror(int[] nums) {
   int maxLen = 0;
    int n = nums.length;

    for (int i = 0; i < n; i++) {
        for (int j = n - 1; j >= 0; j--) {
            int length = 0;
            int left = i;
            int right = j;
            while (left < n && right >= 0 && nums[left] == nums[right]) {
                length++;
                left++;
                right--;
            }
            if (length > maxLen) {
                maxLen = length;
            }
        }
    }

    return maxLen;
}
