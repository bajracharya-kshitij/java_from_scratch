class ExceptionDemo {

  public static void main(String[] args) {

    int numbers[] = {1,2,3,4,5,6,7,8,9,10};
    System.out.println("The given array of numbers is: ");
    for(int n : numbers) {
      System.out.print(n + " ");
    }
    System.out.println("\n");

    try {
      System.out.println("Finding the third item in the array...");
      int third_item = numbers[2];
      System.out.println("The third item in the array is " + third_item + "\n");

      System.out.println("Finding the eleventh item in the array...");
      int eleventh_item = numbers[10];
      System.out.println("The eleventh item in the array is " + eleventh_item);
    } catch(Exception e) {
      System.out.println("An error has occurred! Cannot find the eleventh item in the array because the array has only 10 items.");
    }
  }
}