public int blackjack(int a, int b) {
  if (a > 21 && b > 21) {
        return 0;
    }
    if (a > 21) {
        return b;
    }
    if (b > 21) {
        return a;
    }
    return (21 - a) <= (21 - b) ? a : b;
}
