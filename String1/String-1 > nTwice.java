public String nTwice(String str, int n) {
  String firstPart = str.substring(0, n);
  String lastPart = str.substring(str.length() - n);
  return firstPart + lastPart;
}
