package loneTeen;

public class loneteen {
    public boolean loneTeen(int a, int b) {
  if ( 13 <= a &&  a <= 19 &&  13 <= b &&  b <= 19) {return false;}
  else if ( 13 <= a &&  a <= 19 ||  13 <= b &&  b <= 19) {return true;}
  else { return false; }
}

//Second Approach

 public boolean loneTeen1(int a, int b) {
  // Store teen-ness in boolean local vars first. Boolean local
  // vars like this are a little rare, but here they work great.
  boolean aTeen = (a >= 13 && a <= 19);
  boolean bTeen = (b >= 13 && b <= 19);
  
  return (aTeen && !bTeen) || (!aTeen && bTeen);
  // Translation: one or the other, but not both.
  // Alternately could use the Java xor operator, but it's obscure.
}

    
}
