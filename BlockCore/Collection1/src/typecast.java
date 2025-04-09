public class typecast {
  public static void main(String[] args) {

    // Original array
    int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };

    // Create a new array to replace myNumbers[1] and add 9 to it
    int[] newArray = new int[myNumbers[1].length + 1];

    // Copy original elements of myNumbers[1] to newArray
    for (int i = 0; i < myNumbers[1].length; i++) {
      newArray[i] = myNumbers[1][i];
    }

    // Add the new value 9 at the end of newArray
    newArray[myNumbers[1].length] = 9;

    // Replace myNumbers[1] with the new array
    myNumbers[1] = newArray;

    // Printing the updated array
    for (int i = 0; i < myNumbers.length; i++) {
      for (int j = 0; j < myNumbers[i].length; j++) {
        System.out.print(myNumbers[i][j] + " ");
      }
      System.out.println();
    }
  }
}