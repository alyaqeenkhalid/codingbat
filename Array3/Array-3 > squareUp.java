public int[] squareUp(int n) {
  int[] result = new int[n * n];

    for (int i = 1; i <= n; i++) {
        for (int j = 0; j < i; j++) {
            result[n * i - j - 1] = j + 1;
        }
    }

    return result;
}
