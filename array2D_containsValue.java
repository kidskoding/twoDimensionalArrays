public boolean array2D_containsValue(int[] row1, int[] row2, int[] row3, int target) {
  int[][] arr = {row1, row2, row3}; //create 2D array
  for(int r=0; r<arr.length; r++) { //traverse through 2D array
    for(int c=0; c<arr[r].length; c++) {
      if(arr[r][c] == target) //if element equals target return true
        return true;
    }
  }
  return false; //otherwise return false
}
