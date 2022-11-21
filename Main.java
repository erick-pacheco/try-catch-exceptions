class Main {
  public static void main(String[] args) {
    int[] arrayOfInt = { 1, 2, 3, 4, 5 };

    try {
      getFifthElement(arrayOfInt);
    } catch (Exception ex) {
      Console.log("caught!");
      ex.printStackTrace();
    }

  }

  public static void getFifthElement(int[] array) {
    Console.log(array[5]);
  }
}