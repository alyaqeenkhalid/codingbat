public boolean canBalance(int[] nums) {
  int totalSum = 0;
    for (int num : nums) {
        totalSum += num;
    }

    int leftSum = 0;
    for (int i = 0; i < nums.length - 1; i++) {
        leftSum += nums[i];
        int rightSum = totalSum - leftSum;
        if (leftSum == rightSum) {
            return true;
        }
    }
    return false;
}
