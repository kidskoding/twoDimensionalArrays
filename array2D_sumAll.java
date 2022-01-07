public int array2D_sumAll(int[] row1, int[] row2, int[] row3) {
  int[][] arr = {row1, row2, row3}; //initialize a 2D array of ints
  int sum = 0; //create a sum counter that will sum all elements in the 2D array
  for(int r=0; r<arr.length; r++) {  //traverse through a 2D array. Unlike 1D arrays, you need a nested for loop since you have to traverse through the rows and columns
    for(int c=0; c<arr[r].length; c++) {
      sum += arr[r][c];  //add elements in 2D array
    }
  }
  return sum; //return final sum once loop has reached final element
}
