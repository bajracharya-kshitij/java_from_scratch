import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

class CommonEvenFactors {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int n1 = scanner.nextInt();
    System.out.println("Enter second number: ");
    int n2 = scanner.nextInt();
    scanner.close();

    getAndDisplayCommonEvenFactorsOfNumbers(n1,n2);
  }

  private static ArrayList<Integer> getAndDisplayEvenFactorsOfNumber(int number) {
    ArrayList<Integer> evenFactors = getEvenFactorsOfNumber(number);
    if(evenFactors.size() <= 0) {
      System.out.print(number + " has no even factors");
    } else {
      System.out.println("The even factors of " + number + " are:");
    }
    printList(evenFactors);
    System.out.println("\n");
    return evenFactors;
  }

  private static ArrayList<Integer> getEvenFactorsOfNumber(int number) {
    ArrayList<Integer> evenFactors = new ArrayList<Integer>();
    for(int i=1; i<=number/2; i++) {
      if((i%2 == 0) && (number%i==0)) {
        evenFactors.add(i);
      }
    }
    return evenFactors;
  }

  private static void getAndDisplayCommonEvenFactorsOfNumbers(int n1, int n2) {
    ArrayList<Integer> evenFactors1 = getAndDisplayEvenFactorsOfNumber(n1);
    ArrayList<Integer> evenFactors2 = getAndDisplayEvenFactorsOfNumber(n2);

    HashSet<Integer> intersection = new HashSet<Integer>(evenFactors1);
    intersection.retainAll(evenFactors2);
    if(intersection.size() <= 0) {
      System.out.println("There are no common even factors between " + n1 + " and " + n2);  
    } else {
      System.out.println("The common even factors of " + n1 + " and " + n2 + " are:");
    }
    printList(intersection);
    System.out.println("\n");
  }

  private static void printList(Collection<Integer> numbers) {
    for(int n: numbers) {
      System.out.print(n + " ");
    }
  }

}