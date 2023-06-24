public boolean sleepIn(boolean weekday, boolean vacation) {
  if (weekday == vacation) {
    return true ;
  }
   else if ( weekday == false && vacation == true ) {
     return true;
   }
   else {
     return false ;
   }
}