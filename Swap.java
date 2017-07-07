package ss;

import java.util.Arrays;
import java.util.Scanner;
public class Swap {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String even_odd = sc.next();
        char[] t = even_odd.toCharArray();
        System.out.println(Arrays.toString(t));

        //calling the function for even numbers
        printChars(even_odd, true);

        //calling the function for odd numbers
        printChars(even_odd, false);
    }

	private static void printChars(String even_odd, boolean b) {
		// TODO Auto-generated method stub
		
	}

}