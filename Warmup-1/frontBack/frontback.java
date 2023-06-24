package frontBack;

public class frontback {
    public String frontBack(String str) {
  if (str.length() > 1 ) {
  String back = str.substring(0 , 1);
   String front = str.substring((str.length() - 1),(str.length()));
   String middle = str.substring(1,(str.length() - 1));
  
  return front+middle+back; }
  else {
    return str;
  }
}
    
}
