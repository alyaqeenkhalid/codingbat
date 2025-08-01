public String startWord(String str, String word) {
   int wordLen = word.length();
  if (str.length() < wordLen) {
    return "";
  }
  if (str.substring(1, wordLen).equals(word.substring(1))) {
    return str.substring(0, wordLen);
  } else {
    return "";
  }
}
