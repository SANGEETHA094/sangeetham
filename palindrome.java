import java.util.*;
 
class Pali
{
   public static void main(String args[]){
  String original, rev = "";
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a string to check if it is a palindrome");
      original = in.nextLine();
 
      int len = original.length();
 for (int i = len - 1; i >= 0; i-- )
         rev = rev + original.charAt(i);
 
      if (original.equals(rev))
         System.out.println("Entered string is a palindrome.");
      else
         System.out.println("Entered string is not a palindrome.");
}
}	
