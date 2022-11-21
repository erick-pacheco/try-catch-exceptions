class Main {
  public static void main(String[] args) {
    int[] arrayOfInt = { 1, 2, 3, 4, 5 };

    try {
      getFifthElement(arrayOfInt);
    } catch (Exception ex) {
      Console.log("caught!");
      ex.printStackTrace();
    }

    Dog dog = new Dog();
    Dog dog2 = null;

    /* Section 8 */
    try {
      dog.greet(dog2);
    } catch (Exception ex) {
      Console.log("caught!");
    }
  }

  public static void getFifthElement(int[] array) {
    Console.log(array[5]);
  }
}