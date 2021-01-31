package com.giridhar.util;

public class ArrayRotaion {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };// output array should be 30,40,50,10,20
		int size = arr.length;
		int rotationDegree = 2;
		int[] tempArray = new int[size];
		int tempSize = size;
		tempSize = size - rotationDegree;
		for (int i = 0, j = 0; i < size; i++) {
			if (i >= rotationDegree) {
				tempArray[j] = arr[i];
				j++;
			} else {
				tempArray[tempSize] = arr[i];
				tempSize++;
			}
		}
		for (int el : tempArray) {
			System.out.println("tempArray's element: " + el);
		}

	}

}
