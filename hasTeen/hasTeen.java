package hasTeen;

public class hasTeen {
    public boolean HasTeen(int a, int b, int c) {
  if ( 12 < a && a < 20) { return true;}
  else if ( 12 < b && b < 20) { return true;}
  else if ( 12 < c && c < 20) { return true;}
  else { return false;}
}

//Second Approach 

public boolean hasTeen2(int a, int b, int c) {
  // Here it is written as one big expression,
  // vs. a series of if-statements.
  return (a>=13 && a<=19) ||
         (b>=13 && b<=19) ||
         (c>=13 && c<=19);
}

    
}
