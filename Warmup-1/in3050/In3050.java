package in3050;

public class In3050 {
    public boolean in3050(int a, int b) {
  if ( (30 <= a && 40 >= a) && (30<=b && 40>=b) ){
    return true;
  }
  if ( (40 <= a && 50 >= a) && (40<=b && 50>=b) ){
    return true;
  }
  return false;
}

}
