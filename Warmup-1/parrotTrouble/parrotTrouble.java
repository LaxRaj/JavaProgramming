package parrotTrouble;

public class parrotTrouble {
    public boolean parrottrouble(boolean talking, int hour) {
  if (talking == true && (hour < 7 || hour > 20)) {
    return true;
  } else {
    return false ;
  }
}
    
}
