public int array2D_largestValue(int[] row1, int[] row2, int[] row3) {
  int[][] arr = {row1, row2, row3}; //create 2D array
  int largest = arr[0][0]; //start largest at whatever the first element is in 2D array.
  for(int r=0; r<arr.length; r++) { //traverse through 2D array
    for(int c=0; c<arr[r].length; c++) {
      if(arr[r][c] > largest) { //if element is greater than the current largest number, assign that to largest
        largest = arr[r][c];
      }
    }
  }
  return largest; //once all elements are traversed, return final largest number
}
