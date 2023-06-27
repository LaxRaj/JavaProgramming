package stringBits;

public class stringbits {
    public String stringBits(String str) {
  String res = "";
  for (int i =0; i <str.length(); i= i+2 ) {
    res = res+str.substring(i,i+1);
  }
  return res;
}

}
