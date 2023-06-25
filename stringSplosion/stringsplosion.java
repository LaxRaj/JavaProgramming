package stringSplosion;

public class stringsplosion {
    public String stringSplosion(String str) {
  String res = "";
  for (int i=0; i<str.length(); i++) {
    res = res + str.substring(0, i+1);
  }
  return res;
}

}
