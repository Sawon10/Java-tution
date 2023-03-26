package demoTestArijit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenth of the list: ");
		int len = sc.nextInt();
		for (int i=0; i < len; i++) {
			System.out.println("Enter the value at i : "+ i);
			num.add(sc.nextInt());
		}
		
		System.out.println(num);
		//Print this list in reverse order//
		//Print 4 th elemet of the list//
		//Write a code to print ith fibonacci no//
		//Write a code to reverse a string//
	}

}
