public boolean splitOdd10(int[] nums) {
  return helper(0, nums, 0, 0);
}

private boolean helper(int index, int[] nums, int group1, int group2) {
    if (index == nums.length) {
        return (group1 % 10 == 0 && group2 % 2 == 1) ||
               (group2 % 10 == 0 && group1 % 2 == 1);
    }
    if (helper(index + 1, nums, group1 + nums[index], group2)) {
        return true;
    }
    if (helper(index + 1, nums, group1, group2 + nums[index])) {
        return true;
    }

    return false;
}
