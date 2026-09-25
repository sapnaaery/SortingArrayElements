package day7;

import java.util.Arrays;

public class SortingElementArray {

	public static void main(String[] args) {
		// Program to sort Array elements

		int i[] = { 4, 80, 35, 23, 90, 56, 32, 12, 21, 75, 2 };
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(i));

		System.out.println("After sorting");
		Arrays.sort(i);// To sort array elements
		System.out.println(Arrays.toString(i));

	}

}
