package Guvi;

public class Rotate {
	public static void main(String[] args) {

	int [] unOrderedArr = {1,2,3,4,5,6,7,8};
    int  orderToRotate =2;

   for(int i = 0; i<orderToRotate; i++){

       for(int j = unOrderedArr.length-1; j>0; j--){
           int temp = unOrderedArr[j];
           unOrderedArr[j] = unOrderedArr[j-1];
           unOrderedArr[j-1] = temp;

       }

    }

   for(int j = 0; j<unOrderedArr.length; j++){
     System.out.println("element is " + unOrderedArr[j]);
}
	}
}