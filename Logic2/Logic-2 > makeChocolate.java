public int makeChocolate(int small, int big, int goal) {
  int bigBarsUsed = Math.min(goal / 5, big);
    int remainder = goal - bigBarsUsed * 5;
    if (small >= remainder) {
        return remainder;
    } else {
        return -1; 
    }
}
