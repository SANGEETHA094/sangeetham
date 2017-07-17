package Guvi;
import java.util.Scanner;
public class Restaurant {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int j=sc.nextInt();
		int[] price=new int[r];
		int sum=0;
        for(int i=0;i<r;i++){
        price[i]=sc.nextInt();
        sum+=price[i];}
        int annacost=sc.nextInt();
        if(annacost==(sum/2)-(price[j]/2)){
       System.out.println("Bon Appetit");
        }
        else{
        System.out.println(annacost-(annacost-(price[j]/2)));
        }
        sc.close();

	}

}

