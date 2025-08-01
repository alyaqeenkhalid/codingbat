public int countClumps(int[] nums) {
  int count = 0;
    int i = 0;
    int n = nums.length;

    while (i < n) {
        int val = nums[i];
        int length = 1;
        i++;
        while (i < n && nums[i] == val) {
            length++;
            i++;
        }
        if (length > 1) {
            count++;
        }
    }

    return count;
}
