public String lastChars(String a, String b) {
  char firstChar = (a.length() > 0) ? a.charAt(0) : '@';
  char lastChar = (b.length() > 0) ? b.charAt(b.length() - 1) : '@';
  return "" + firstChar + lastChar;
}
