package logictest;

import java.util.Random;

public class HourGlassMaxSum {



  public static void main(String[] args) {
    System.out.println("HourGlass");
    int row = 6, column = 6, hourGlassSum = Integer.MIN_VALUE;

    // creating 6*6 matrix
    int[][] array = new int[6][6];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        array[i][j] = new Random().nextInt(10);
      }
    }
    // displaying 6*6 matrix
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        System.out.print(" " + array[i][j]);
      }
      System.out.println();
    }

    // finding hour glass and their sum

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        int sum = array[i][j] + array[i][j + 1] + array[i][j + 2] + array[i + 1][j + 1]
            + array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2];
        
        if(hourGlassSum<sum){
          hourGlassSum = sum;
        }
      }
    }
    System.out.println("hourGlassSum "+hourGlassSum);
  }

}
