public int array2D_storageSpace(int[] row1, int[] row2, int[] row3) {
  int[][] arr = {row1, row2, row3}; //initialize a 2D array of ints
  return arr.length * arr[0].length; /*the total length is represented by multiplying the row length by the column length. 
  * arr.length is the length of the row and arr[0].length is the length of a column */
}
