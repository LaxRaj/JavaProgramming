package altPairs;

public class altpairs {
    public String altPairs(String str) {
  String res = "";
    // here we run it : 0,4,8,12,...
    for (int i=0 ; i< str.length() ; i= i+4 ) {
      // here from above; 0 => 2 , 6 , 10
      int end = i+2;
        // this above append here stays in the range of the given string
        if (end > str.length() ) {
          end = str.length() ;
        }
      //now we just add the strings and substring the i , i+1 
      res = res + str.substring(i , end);  
    }
    
    return res;
}

}
