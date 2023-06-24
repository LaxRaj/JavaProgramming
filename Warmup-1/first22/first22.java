package first22;

public class first22 {
    public String front22(String str) {
  if ( str.length() > 1) {
    String first2 = str.substring(0 , 2 );
    
    return first2+str+first2;
  } else {
    return str+str+str;
  }
}
    
}
