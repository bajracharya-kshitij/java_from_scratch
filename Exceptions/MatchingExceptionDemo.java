class MatchingExceptionDemo {

  public static void main(String[] args) {

    try {
        divideByZero();
        System.out.print("Divide by zero successful");
    } catch(ArrayIndexOutOfBoundsException e1) {
      System.out.println("Array index out of bounds exception has occurred");
    } catch(ArithmeticException e2) {
      System.out.println("You cannot divide a number by zero");
    }
  }

  static void divideByZero() {
    System.out.println("Attempting to divide a number by zero...."); 
    System.out.println(1/0);
  }

}