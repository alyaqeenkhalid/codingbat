public boolean closeFar(int a, int b, int c) {
   boolean bClose = Math.abs(b - a) <= 1;
    boolean cClose = Math.abs(c - a) <= 1;
    boolean bFar = Math.abs(b - c) >= 2 && Math.abs(b - a) >= 2;
    boolean cFar = Math.abs(c - b) >= 2 && Math.abs(c - a) >= 2;
    if (bClose && cFar) {
        return true;
    }
    if (cClose && bFar) {
        return true;
    }
    return false;
}
