package java1;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class StaircaseHash {
	
	
	    static void staircase(int n) {
	        
	      /* String a="";
	        String b="";
	        int j=n;
	            if(n<10)
	            {
	            	
	            	for(int i=0;i<n;i++)
	            	{
	                 	                 
	                 a=a+"#";
	                 if(j>=0)
	                 {
	                b=b+" ";
	                j--;
	                System.out.print(b);
	                 }
	                 
	                 System.out.print(a);
	                 System.out.println();
		            
	            	
	                 }
	            }
	            else
	            {
	              System.out.println("#");  
	            }*/
	    	
	    	for(int i=1;i<=n;i++)
	        {
	             for(int k=n;k>i;k--)
	             {
	                 System.out.printf(" ");
	             }    
	             for(int j=1;j<=i;j++)
	             {
	                 System.out.printf("#");
	             }
	            System.out.println();
	        }
	    	
	    	
	         
	    }

	    private static final Scanner scan = new Scanner(System.in);

	    public static void main(String[] args) {
	        int n = Integer.parseInt(scan.nextLine().trim());

	        staircase(n);
	    }
	

}
