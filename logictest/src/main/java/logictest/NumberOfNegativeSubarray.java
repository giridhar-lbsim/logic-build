package logictest;

import java.util.Scanner;

// Print the number of subarrays of having negative sums.
public class NumberOfNegativeSubarray {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
   /* int numberOfNegativeSubarray = 0, lengthOfArray;
    // enter length of array
    Scanner in = new Scanner(System.in);
    // System.out.println("enter length of array:");
    lengthOfArray = in.nextInt();
    if (lengthOfArray >= 1 && lengthOfArray <= 100) {


      int[] array = new int[lengthOfArray];
      // enter array elements
      for (int i = 0; i < lengthOfArray; i++) {
        int element = in.nextInt();
        if (element >= -10000 && element <= 10000) {
          array[i] = element;
        }

      }

      // display array

      for (int i = 0; i < lengthOfArray; i++) {
        System.out.println(" " + array[i]);
      }


      for (int i = 0; i < lengthOfArray; i++) {
        int a = i;
        if (i == a) {
          System.out.println("i in loop:"+i);
          for (int j = 0; j < lengthOfArray-i; j++) {
            if (array[j] < 0) {
              numberOfNegativeSubarray++;
            }
          }

        }
        
        
        if (i == 1) {
          for (int j = 0; j < array.length - 1; j++) {
            if (array[j] + array[j + 1] < 0) {
              numberOfNegativeSubarray++;
            }
          }

        }
        if (i == 2) {
          for (int j = 0; j < array.length - 2; j++) {
            if (array[j] + array[j + 1] + array[j + 2] < 0) {
              numberOfNegativeSubarray++;
            }
          }

        }
        if (i == 3) {
          for (int j = 0; j < array.length - 3; j++) {
            if (array[j] + array[j + 1] + array[j + 2] + array[j + 3] < 0) {
              numberOfNegativeSubarray++;
            }
          }

        }
        if (i == 4) {
          for (int j = 0; j < array.length - 4; j++) {
            if (array[j] + array[j + 1] + array[j + 2] + array[j + 3] < 0) {
              numberOfNegativeSubarray++;
            }
          }

        }

      }
      System.out.println(numberOfNegativeSubarray);

    }
*/
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    int[] arr = new int[length];

    int first = sc.nextInt();
    arr[0] = first;
    int count = first < 0 ? 1 : 0;

    for (int i = 1; i < length; i++){
        int num = sc.nextInt();
        arr[i] = arr[i - 1] + num;

        if (arr[i] < 0){
            count++;
        }

        for (int j = 0; j < i; j++){
            int sub_result = arr[i] - arr[j];
            if (sub_result < 0){
                count++;
            }
        }
    }

    System.out.print(count);
    
  }

}
