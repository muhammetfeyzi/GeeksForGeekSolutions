package com.GreekCode;

import java.util.Random;
import java.util.Scanner;

public class PairWithgivenSumInSortedArray {
	/*
	 * Muammet Feyzi Saðlam 06.11.2018 You are given an array A of size N. You
	 * need to find all pairs in the array that sum to a number K. If no such
	 * pair exists then output will be -1. The elements of the array are
	 * distinct and are in sorted order. Testcase1: We cannot find any pair that
	 * sums to 98 Testcase2: We find 3 such pairs that sum to 8 (1,7) (2,6)
	 * (3,5)
	 */

	static Random rnd; // Random array object referans
	static int[] randomArray; // array refrans
	static int[] sortedArray;
	static int k = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		createArray(); 
		System.out.println("\n"+"* random array *");
		writeArray(randomArray); 
		sortedArray=sortedArray(randomArray);
		System.out.println("\n"+"* sorted array *");
		writeArray(sortedArray);
		System.out.println("\n"+"plesae enter compre number ");
		k = scan.nextInt();
		//int test[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		findPairSum(sortedArray, k);
	}

	private static void findPairSum(int[] pairSumArray, int k) {
		// TODO Auto-generated method stub
		int count = 0;
		int pair = 0;
		for (int i = 0; i < pairSumArray.length; i++) {
			for (int j = pairSumArray.length - 1; j > i; j--) {
				pair = pairSumArray[j] + pairSumArray[i];
				if (pair == k) {
					System.out.println(" ( " + pairSumArray[j] + "+"
							+ pairSumArray[i] + " ) " + pair);
					count++;
				}

			}
		}
		System.out.println("count of pairs : " + count);
	}

	private static int[] sortedArray(int[] randomArray) {
		// TODO Auto-generated method stub
		// we will sort array with booble sorted
		int temp = 0;
		for (int i = 0; i < randomArray.length; i++) {
			for (int j = 0; j < i; j++) {
				if (randomArray[i] > randomArray[j]) {
					temp = randomArray[i];
					randomArray[i] = randomArray[j];
					randomArray[j] = temp;
				}
			}
		}
		return randomArray;
	}

	private static void writeArray(int[] randomArray) {
		// TODO Auto-generated method stub
		for (int i = 0; i < randomArray.length; i++) {
			System.out.print(" " + i + " . eleman :" + randomArray[i]);
		}
	}

	private static int[] createArray() {
		// TODO Auto-generated method stub
		// data declerations
		rnd = new Random();
		randomArray = new int[8];
		for (int i = 0; i < 8; i++) {
			randomArray[i] = rnd.nextInt(45);
		}
		return randomArray;
	}

}