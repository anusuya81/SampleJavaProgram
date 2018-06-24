package java1;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Which table you want to do");
		int num=input.nextInt();
		for (int i=1; i<=10; i++)
		{
			System.out.println(num + "X" + i + "=" +( num*i));
		}

	}}


