package demoTestArijit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the lenth of the list: ");
		System.out.println("Enter the no for calsulating factorial: ");
		int n = sc.nextInt();
		System.out.println(findFactorial(n));
//		int len = sc.nextInt();
//		for (int i=0; i < len; i++) {
//			System.out.println("Enter the value at i : "+ i);
//			num.add(sc.nextInt());
//		}
//		System.out.println(num);
		sc.close();
		//Print this list in reverse order//
		//[67, 8, 0, 45, 23]
//		System.out.println("Printing the List in reverse Order: ");
//		System.out.println(reverseList(num, len));
		//Print 4 th elemet of the list// 
//		System.out.println(num.get(3));
		
		//Write a code to print ith fibonacci no//
		//Write a code to reverse a string//
		//Accessing and creating a class object//
		Student arijit = new Student("TECHNO2023-30","Arijit Saha",222);
		System.out.println(arijit.getName());
	}
	
	private static ArrayList<Integer> findFactorial(int N) {
        ArrayList<Integer> ans = new ArrayList<>();
		ans.add(1);
		for (int i = 2;i <= N; i++) {
			int carry = 0;
			for (int j = 0; j < ans.size(); j++) {
				int temp = carry + i * ans.get(j);
				ans.set(j, temp % 10);
				carry = temp / 10;
			}
			while (carry != 0) {
				ans.add(carry % 10);
				carry = carry / 10;
			}
		}
		int i = 0;
		int j = ans.size()-1;
		while (i < j) {
			int temp = ans.get(i);
			ans.set(i, ans.get(j));
			ans.set(j, temp);
			i ++; j--;
		}
		return ans;
	}

	private static ArrayList<Integer> reverse(ArrayList<Integer> ans) {
		// TODO Auto-generated method stub
		return null;
	}

}
