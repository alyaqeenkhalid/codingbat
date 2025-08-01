public boolean makeBricks(int small, int big, int goal) {
  int maxBigNeeded = goal / 5;
    int bigUsed = Math.min(maxBigNeeded, big);
    int remainder = goal - bigUsed * 5;
    return remainder <= small;
}
