package com;

public class Test {
	
	public static void sortList(int[] arr) {
		int length = arr.length;
		int[] resultArray = new int[length];
		int count=0;
		for(int i =0;i<length;i++) {
			if(arr[i] /2 ==1) {
				resultArray[count] = arr[i];
				count++;
			}
		}
		for(int i=0;i<length;i++) {
			if(arr[i] /4 ==1) {
				resultArray[count] = arr[i];
				count++;
			}
		}
		System.out.println(resultArray);
		for(int i:resultArray) {
			System.out.print(i+", ");
		}
	}

	public static void main(String[] args) {
		int[] arr = {2,4,2,4};
		
		sortList(arr);
		int i=2,j=4;
		//System.out.println(j/2);
		
		
		
		
		
	}

}
