public boolean linearIn(int[] outer, int[] inner) {
   int i = 0; 
    int j = 0; 

    while (i < inner.length && j < outer.length) {
        if (inner[i] == outer[j]) {
            i++;
            j++;
        } else if (outer[j] < inner[i]) {
            j++;
        } else {
            return false;
        }
    }
    return i == inner.length;
}
