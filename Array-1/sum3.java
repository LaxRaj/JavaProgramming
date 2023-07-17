public class sum3 {
    public int Sum3(int[] nums) {
        int res = 0 ;
        
        for (int i = 0 ; i < nums.length ; i++) {
           res = nums[i] + res;
        }
        return res;
      }
      
}
