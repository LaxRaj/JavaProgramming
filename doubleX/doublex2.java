package doubleX;

public class doublex2 {
    boolean doubleX(String str) {
  if (str.length()==0 ) {return false;}
  if (str.equals("xx") ) {return true;}
  int count = 0;
  for (int i=0; i < str.length()-3; i++ ) {
   if ( str.substring(i,i+2).equals("xx") ) {
     count++ ;
   }
  }
  
  if (count != 0) {
    return true;
  }
  return false;
}

}
