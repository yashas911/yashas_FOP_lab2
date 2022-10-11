package com.yashas.lab2.que2.test;

import com.yashas.lab2.model.MergeSort;
import java.util.*;

public class Question2 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Currency denominations");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the currency values");
		for (int i = 0; i < n; i++) {
			int ele = sc.nextInt();
			a[i] = ele;
		}
		MergeSort.mergeSort(a, n);

		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		int[] count = new int[n];

		for (int i = 0; i < n; i++) {
			if (amount >= a[i]) {
				count[i] = amount / a[i];
				amount = amount - (count[i] * a[i]);
			}
		}
		if (amount == 0) {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for (int i = 0; i < n; i++) {
				if (count[i] == 0)
					continue;
				System.out.println(a[i] + " : " + count[i]);
			}
		} else
			System.out.println("oops Exact amount not possible");

		sc.close();

	}

}
