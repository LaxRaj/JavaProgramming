package max1020;

public class Max1020 {
    public int max1020(int a, int b) {
  int val1 = 0;
  int val2 = 0;
  if (10<=a && 20>=a) {
   val1= a;  
  }   
  if (10<=b && 20>=b) {
    val2 =b;
  } 
  int max = 0;
  if ( val1 > val2) {
    max = val1;
  }
  if ( val1 < val2) {
    max = val2;
  }
  return max;
}

// TODO: work on the second approach
 public int max10201(int a, int b) {
  // First make it so the bigger value is in a
  if (b > a) {
    int temp = a;
    a = b;
    b = temp;
  }
  
  // Knowing a is bigger, just check a first
  if (a >= 10 && a <= 20) return a;
  if (b >= 10 && b <= 20) return b;
  return 0;
}
}
