import java .util.Scanner;
public class Positivezero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
              int i;
              Scanner s=new Scanner(System.in);
              i=s.nextInt();
              if(i>0){
            	  System.out.println("positive");
	}
              if(i<0){
            	  System.out.println("negative");
              }
              else
            	  System.out.println("zero");
              }

}
