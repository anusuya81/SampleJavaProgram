package java1;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class PlusMinusZero {
	 static void plusMinus(int[] arr) {
	       double count1 =0;
	        double count2=0;
	        double count3=0;
	       
	         int p=arr.length;
	         //System.out.println(p);
	        for(int i=0;i<p;i++)
	        {
	            if(arr[i]<0)
	            {
	                count1=count1+1;
	           
	            }
	            else if(arr[i]>0)
	            {
	                count2=count2+1;
	          
	            }
	            else
	            {
	                count3=count3+1;
	            
	            }
	            
		         
		         
	        }
	        
	    
           System.out.printf("%.6f %n",count1/p);
           System.out.printf("%.6f %n",count2/p);
           System.out.printf("%.6f %n",count3/p);
           
	        
	       
	        
	        
	        

	    }

	    private static final Scanner scan = new Scanner(System.in);

	    public static void main(String[] args) {
	        int n = Integer.parseInt(scan.nextLine().trim());

	        int[] arr = new int[n];

	        String[] arrItems = scan.nextLine().split(" ");

	        for (int arrItr = 0; arrItr < n; arrItr++) {
	            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
	            arr[arrItr] = arrItem;
	        }

	        plusMinus(arr);
	    }

}
