public class firstLast6 {
    public boolean firstlast6(int[] nums) {
  int length = nums.length-1 ;
  
  if (nums[0] == 6 || nums[length] == 6) {
    return true ;
  }
  
  return false;
}

}
