public int[] fix45(int[] nums) {
int n = nums.length;
    int fiveIndex = 0;

    for (int i = 0; i < n; i++) {
        if (nums[i] == 4) {
            if (i + 1 < n) {
                while (fiveIndex < n && (nums[fiveIndex] != 5 || (fiveIndex > 0 && nums[fiveIndex - 1] == 4))) {
                    fiveIndex++;
                }
                if (fiveIndex < n) {
                    int temp = nums[i + 1];
                    nums[i + 1] = nums[fiveIndex];
                    nums[fiveIndex] = temp;
                }
            }
        }
    }
    return nums;
}
