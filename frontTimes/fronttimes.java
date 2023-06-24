package frontTimes;

public class fronttimes {
    public String frontTimes(String str, int n) {
  if (str.length() == 0 ) {return str;}
  if ( n == 0 ) {return "";}
  if (str.length() <= 3 ) { 
    String res = "";
    for (int i=0; i < n ; i++) {
      res = res + str;
    }
    return res ; }
    str = str.substring(0, 3);
    String res = "";
    for (int i=0; i < n ; i++) {
      res = res + str;
    }
  return res;

}
}
