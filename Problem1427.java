package problem1427;

import java.util.Scanner;

/*
 * 백준 1427번 문제
 */

public class Problem1427 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String number = scan.nextLine();
		
		int size = number.length();
		char[] arr = new char[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = number.charAt(i);
			for(int j=0; j<size; j++) {
				if(arr[i]<arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=size-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
	}
}
