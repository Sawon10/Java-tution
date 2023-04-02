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
		sc.close();
		//Print this list in reverse order//
		//[67, 8, 0, 45, 23]
		System.out.println("Printing the List in reverse Order: ");
		System.out.println(reverseList(num, len));
		//Print 4 th elemet of the list// 
//		System.out.println(num.get(3));
		
		//Write a code to print ith fibonacci no//
		//Write a code to reverse a string//
		//Accessing and creating a class object//
		Student arijit = new Student("TECHNO2023-30","Arijit Saha",222);
		System.out.println(arijit.getName());
	}

	private static List<Integer> reverseList(List<Integer> num, int n) {
		int i = 0;
		int j = n-1;
		while (i < j) {
			int temp = num.get(i);
			num.set(i, num.get(j));
			num.set(j, temp);
			i ++;
			j --;
		}
		return num;
	}

}
