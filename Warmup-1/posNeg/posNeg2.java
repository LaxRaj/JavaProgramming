package posNeg;

public class posNeg2 {
    public boolean posNeg(int a, int b, boolean negative) {
  if (a > 0 && b<0 && negative==true) {
    return false;}
  else if ( ( a > 0 && b < 0) ||  (a<0 && b <0  && negative == true ) || (a < 0 && b>0 && negative==false)) {
    return true ;
  } 
  else {
    return false ;
  }
}
}
