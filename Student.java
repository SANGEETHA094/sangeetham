package Guvi;
import java.util.*;
public class Student {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int r=sc.nextInt();
			int j=sc.nextInt();
			String m=sc.next();
			int[] friends=new int[r];
			for(int i=0;i<j;i++){
				friends[i]=sc.nextInt();
			}
			for(int i=0;i<j;i++){
				if(m.charAt(friends[i]-1)=='0'){
					System.out.println("YES");
					System.exit(0);}
				}
			System.out.println("NO");
			sc.close();
}
}

