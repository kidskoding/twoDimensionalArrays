public int[] array2D_rowSums(int[] row1, int[] row2, int[] row3) {
  int[][] arr = {row1, row2, row3};
  int[] rowSums = new int[arr.length];
  for(int r = 0; r < arr.length; r++) {
    int sum = 0;
    for(int c = 0; c < arr[r].length; c++) {
      sum += arr[r][c];
    }
    rowSums[r] = sum;
  }
  return rowSums;
}
