package birthdayCake;

import java.util.Scanner;

public class BirthdayCake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] ar = new int[n];
	        for(int ar_i = 0; ar_i < n; ar_i++){
	            ar[ar_i] = in.nextInt();
	        }
	        int result = birthdayCakeCandles(n, ar);
	        System.out.println(result);

	}
	
    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        
    	int maxHeight = ar[0];
    	int numOfMaxHeigth = 1;
    	
        for (int i = 1; i < ar.length; i++){
        	if (ar[i] > maxHeight){
        		maxHeight = ar[i];
        	}
        	else if (ar[i] == maxHeight){
        		numOfMaxHeigth++;
        	}	
        }
        
        return numOfMaxHeigth;
    }
}
