package com.yashas.lab2.question1;

import java.util.*;

public class Question1 {

	static int find(int a[], int target, int value) {
		int sum = 0;

		if (target <= a.length) {
			for (int i = 0; i < target; i++) {
				sum += a[i];
				if (value <= sum) {
					return i + 1;
				}

			}
			return -2;

		} else {
			return -1;
		}

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the Values of the Array");
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			a[i] = m;
		}

		System.out.println("Enter total number of targets to be acheived");
		int target = sc.nextInt();
		System.out.println("Enter Value of Target");
		int value = sc.nextInt();

		int returnValue = find(a, target, value);

		if (returnValue == -1) {
			System.out.println("Target greater than the transaction");
		} else if (returnValue == -2) {
			System.out.println("Target not Achieved");
		}

		else {
			System.out.println("Target Achieved after " + returnValue + " transactions");
		}

		sc.close();
	}

}
