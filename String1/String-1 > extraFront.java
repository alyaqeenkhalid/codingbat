public String extraFront(String str) {
  String front;
  if (str.length() >= 2) {
    front = str.substring(0, 2);
  } else {
    front = str;
  }
  return front + front + front;
}
