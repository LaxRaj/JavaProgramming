package stringYak;

public class StringYak {
    public String stringYak(String str) {
   String res = "";
  for (int i=0; i<str.length(); i++ ) {

    if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
       i =i+2;
    } else {
      res = res + str.charAt(i);
    }
  }
  
  return res;
}

}
