package java1;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class MinMaxSum {
	  static void minimax(int[] arr) {
	     
	        int n=arr.length;
	        int sum=0;
	        int j=0;
	        int k;
	        int max=0;
	        int min=0;
	        
        	int[] add1=new int[n];
        	
	        for(int i=0;i<n;i++)
	        {
	        	if(j==i)
	        	{
	        	for(k=0;k<n;k++)
	        	{
	        	sum=sum+arr[k];
	        	}
	        	sum=sum-arr[j];
	        	//int add=sum;
	        	add1[i]=sum;
	        	System.out.print(add1[i]+" ");
	        	if(i==0)
	        		max=max+add1[i];
	        	if(i==(n-1))
	        		min=min+add1[i];
	        	
	        	j++;
	        	sum=0;	        	
	        	}
	        	
	        	
	        }
	        
	        System.out.println();
	        System.out.print(max+" "+min);
	       
        	
        	
	            

	    }
	  private static final Scanner scan = new Scanner(System.in);

	    public static void main(String[] args) {
	        int[] arr = new int[5];

	        String[] arrItems = scan.nextLine().split(" ");

	        for (int arrItr = 0; arrItr < 5; arrItr++) {
	            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
	            arr[arrItr] = arrItem;
	        }

	        minimax(arr);
	    }
	}



  

    
