

public class Has271 {
    public boolean has271(int[] nums) {
  int count = 0;
  
     for (int i=0; i<nums.length-2 ; i++ ) {
        int  value = nums[i] ;
          if (value+5 == nums[i+1] && Math.abs(nums[i+2] - (value-1)) <= 2) {
            count++;
          }
     }
     
     if (count > 0) {
     return true; }

  return false;
  
}
}
