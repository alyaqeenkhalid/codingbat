public String lastTwo(String str) {
   if (str.length() < 2) {
    return str;
  }
  String start = str.substring(0, str.length() - 2);
  char secondLast = str.charAt(str.length() - 2);
  char last = str.charAt(str.length() - 1);
  return start + last + secondLast;
}
