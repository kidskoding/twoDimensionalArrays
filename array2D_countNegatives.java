public int array2D_countNegatives(int[] row1, int[] row2, int[] row3) {
  int[][] arr = {row1, row2, row3}; //initialize a 2D array
  int count = 0; /* creates a count to track the number of negatives that appear in the 2D array. Our goal is to return a count of the number of negatives that appear in the 2D
  * array */
  for(int r=0; r<arr.length; r++) { //traverse via 2D array
    for(int c=0; c<arr[r].length; c++) {
      if(arr[r][c] < 0) { //if negative then add 1 to count. Otherwise continue the loop. 
        count++;
      }
    }
  }
  return count; //return final count of negatives once all elements were checked if negative or positive
}
