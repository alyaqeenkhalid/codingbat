public String right2(String str) {
  String last2 = str.substring(str.length() - 2);
  String front = str.substring(0, str.length() - 2);
  return last2 + front;
}
