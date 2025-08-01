public String firstHalf(String str) {
  if (str.length()%2==0){
    int half = str.length()/2;
    return str.substring(0, half);
  }
  else{
    return str;
  }
}
