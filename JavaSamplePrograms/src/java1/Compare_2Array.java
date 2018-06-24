package java1;

import java.util.Arrays;
import java.util.Scanner;

public class Compare_2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1= {1,2,3,4,5};
		
	    //int[] array2= {1,2,3,4,5};
		Scanner input=new Scanner(System.in);
		System.out.println("how many numbers you are going to enter");
		int length=input.nextInt();
		int[] array2= new int[length];
		for(int count=0;count<length;count++)
		{
			array2[count]=input.nextInt();
		}
		
		if (Arrays.equals(array1, array2))
		{
			System.out.println("Both arrays are matching");
		}
		else
		{
			System.out.println("Not matching");
		}

	}

}
