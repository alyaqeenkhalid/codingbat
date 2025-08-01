public int[] fix34(int[] nums) {
  int n = nums.length;
    int fourIndex = 0;

    for (int i = 0; i < n; i++) {
        if (nums[i] == 3) {
            if (i + 1 < n) {
                while (fourIndex < n && (nums[fourIndex] != 4 || (fourIndex > 0 && nums[fourIndex - 1] == 3))) {
                    fourIndex++;
                }
                if (fourIndex < n) {
                    int temp = nums[i + 1];
                    nums[i + 1] = nums[fourIndex];
                    nums[fourIndex] = temp;
                }
            }
        }
    }
    return nums;
}
