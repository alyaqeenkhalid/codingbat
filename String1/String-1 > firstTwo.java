public String firstTwo(String str) {
  if (str.length()<=1){
    return str;
  }
  else{
  String first2 = str.substring(0,2);
  return first2 ;
  }
}