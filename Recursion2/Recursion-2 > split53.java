public boolean split53(int[] nums) {
   return helper(0, nums, 0, 0);
}

private boolean helper(int index, int[] nums, int group1, int group2) {
    if (index == nums.length) {
        return group1 == group2;
    }

    int value = nums[index];

    if (value % 5 == 0) {
        return helper(index + 1, nums, group1 + value, group2);
    } else if (value % 3 == 0) {
        return helper(index + 1, nums, group1, group2 + value);
    } else {
        return helper(index + 1, nums, group1 + value, group2) ||
               helper(index + 1, nums, group1, group2 + value);
    }
}
