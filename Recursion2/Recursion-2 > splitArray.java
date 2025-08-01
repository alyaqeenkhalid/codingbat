public boolean splitArray(int[] nums) {
  return helper(0, nums, 0, 0);
}

private boolean helper(int index, int[] nums, int sum1, int sum2) {
    if (index == nums.length) {
        return sum1 == sum2;
    }
    if (helper(index + 1, nums, sum1 + nums[index], sum2)) {
        return true;
    }
    if (helper(index + 1, nums, sum1, sum2 + nums[index])) {
        return true;
    }

    return false;
}
