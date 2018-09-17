import java.util.Random;

class MultipleExceptionsDemo {

  public static void main(String[] args) {
    int resultArray[] = new int[5];
    Random rand = new Random();
    int i = 0;

    while(true) {
      System.out.println("Random number " + (i+1) + " between 0 and 100 as the dividend");
      int dividend = rand.nextInt(100);
      System.out.println(dividend + "\n");

      System.out.println("Random number " + (i+1) + " between 0 and 10 as the divisor");
      int divisor = rand.nextInt(10);
      System.out.println(divisor + "\n");

      try {
        int result = dividend / divisor;
        resultArray[i] = result;
        System.out.println("***Result added to array***\n");
        i++;  
      } catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
        String exceptionName = e.getClass().getSimpleName();
        if(exceptionName.equals("ArrayIndexOutOfBoundsException")) {
          System.out.println("5 items have been added to the result array. No more space left!");
        } else if(exceptionName.equals("ArithmeticException")) {
          System.out.println("Illegal division. The divisor is zero!");
        }
      
        System.out.println("The resulting array is: ");
        for(double r : resultArray) {
          System.out.print(r + " ");
        }
        System.out.print("\n");
        break;
      }
    }
  }

}