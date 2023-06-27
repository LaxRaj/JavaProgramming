package Notriples;

public class NoTriples {
    public boolean noTriples(int[] nums) {
  int count = 0;
  
     for (int i=0; i<nums.length-2; i++) {
        if (nums[i]==nums[i+1] && nums[i+1]==nums[i+2]) {
          count++;
        }  
     }
     
     if (count > 0) {
       return false;
     }
  return true;     
}

}
