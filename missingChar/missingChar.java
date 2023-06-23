package missingChar;

public class missingChar {
    public String missingChar(String str, int n) {
  //first iterate to 0-n and then start from back n+1 
  String front = str.substring(0, n);
  String back = str.substring(n+1, str.length());
  return front + back;
}
    
}
