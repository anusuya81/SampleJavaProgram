package java1;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AddEenCond {

	
		 private static final Scanner scanner = new Scanner(System.in);

		    public static void main(String[] args) {
		        int n = scanner.nextInt();
		        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		        scanner.close();
		      /*  if(n%2==0 && n<=5)
		            System.out.println("not weired");
		        else if(n%2==0 && n>=6 && n<=20)
		            System.out.println("weired");
		        else if(n%2==0 && n>20)
		            System.out.println("not weired");
		        else if(!(n%2==0))
		            System.out.println("weired"); */
		        String ans="";
		        if(n%2==1 || ( (n%2==0) && (n>=6 && n <= 20 ) ) ){
		          ans = "Weird";
		        }
		        else{
		            ans = "Not Weird";
		           //Complete the code

		        }
		        System.out.println(ans);
		        
	}

}





   
  
