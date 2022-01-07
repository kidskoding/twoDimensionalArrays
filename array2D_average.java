public double array2D_average(int[] row1, int[] row2, int[] row3) {
  int[][] arr = {row1, row2, row3}; //initialize 2D array
  double avg = 0; //make a double called avg equal 0 
  for(int r=0; r<arr.length; r++) { //traverse through 2D array
    for(int c=0; c<arr[r].length; c++) {
      avg += arr[r][c]; //add avg to each element in 2D array
    }
  }
  return avg / (arr.length * arr[0].length); //divide avg by the length of the 2D array which is just multiplying the rows and columns
}
