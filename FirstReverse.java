import java.util.*; 
import java.io.*;

class Main {

  public static String FirstReverse(String str) {
    String rts = "";
    for(int i=0; i<str.length(); i++) {
        char c = str.charAt(i);
        rts = String.valueOf(c) + rts;
    }
    return rts;
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }   
  
}
