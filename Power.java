package Guvi;
import java.util.*;
		public class Power {

		    public static void main(String args[])
		    {
		        Scanner sc=new Scanner(System.in);
		        int number = 0;
		        int pow = 0;
		        int power = 0;

		        System.out.print("Enter number: ");
		        number = sc.nextInt();

		        System.out.print("Enter power: ");
		        pow = sc.nextInt();

		        System.out.print(power(number,pow));
		    }
		    public static int power(int a, int b)
		    {
		            int power = 1;
		            for(int c=0;c<b;c++)
		            power*=a;
		            return power;
		        }
		}
		