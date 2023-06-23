package backAround;

public class backAround {
    public String backAround(String str) {
  if ( str.length() > 2 ) {
    String rep = str.substring( (str.length()-1),(str.length()));
    
    return rep+str+rep ;
  } 
  else {
    return str+str+str;
  }
}
    
}
