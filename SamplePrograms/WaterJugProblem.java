import java.util.Scanner;

public class WaterJugProblem {

  private static final int THREE_GALLON_JUG_CAPACITY = 3;
  private static final int FIVE_GALLON_JUG_CAPACITY = 5;
  private static final int TARGET_WATER_LEVEL = 4;

  private static int currentWaterLevelIn3GallonJug = 0;
  private static int currentWaterLevelIn5GallonJug = 0;

  public static void main(String[] args) {

    System.out.println("***The Problem***");
    System.out.println("You have two empty water jugs in your hands. One holds 3 gallons of water, the other holds 5 gallons of water." +
                        "You need to use these two jugs to measure exactly 4 gallons of water.\n");
    
    Scanner scanner = new Scanner(System.in);

    do{
      displayCurrentWaterLevels();
      displayOptions();
      int selectedOption = scanner.nextInt();
      if(selectedOption == 7) {
        System.out.print("Thanks for trying. Bye!\n");
        break;
      }
      updateAfterSelection(selectedOption);
      if(currentWaterLevelIn5GallonJug == TARGET_WATER_LEVEL) {
        displayCurrentWaterLevels();
        System.out.println("Congrats you've done it!");
      }
    } while(currentWaterLevelIn5GallonJug != TARGET_WATER_LEVEL);
  }

  private static void displayOptions() {
    System.out.println("1. Fill 3 gallon jug");
    System.out.println("2. Fill 5 gallon jug");
    System.out.println("3. Pour water from 3 gallon to 5 gallon until 3 gallon is empty or 5 gallon is full");
    System.out.println("4. Pour water from 5 gallon to 3 gallon until 5 gallon is empty or 3 gallon is full");
    System.out.println("5. Empty 3 gallon jug");
    System.out.println("6. Empty 5 gallon jug");
    System.out.println("7. Quit");
    System.out.print("Choose an option: ");
  }

  private static void displayCurrentWaterLevels() {
    System.out.println("\nCurrent water level in 3 gallon jug: " + currentWaterLevelIn3GallonJug  + " gallon(s)");
    System.out.println("Current water level in 5 gallon jug: " + currentWaterLevelIn5GallonJug  + " gallon(s)\n");
  }

  private static void updateAfterSelection(int selectedOption) {
    switch(selectedOption) {
      case 1:
        fill3Gallon();
        break;
      case 2:
        fill5Gallon();
        break;
      case 3:
        pour3GallonTo5Gallon();
        break;
      case 4:
        pour5GallonTo3Gallon();
        break;
      case 5:
        empty3Gallon();
        break;
      case 6:
        empty5Gallon();
        break;
      default:
        break;  
    }
  }

  private static void fill3Gallon() {
    if(currentWaterLevelIn3GallonJug>0){
      System.out.println("The jug is already filled. Cannot add 3 more gallons of water!");
    } else {
      currentWaterLevelIn3GallonJug = THREE_GALLON_JUG_CAPACITY;
    }
  }

  private static void fill5Gallon() {
    if(currentWaterLevelIn5GallonJug>0){
      System.out.println("The jug is already filled. Cannot add 5 more gallons of water!");
    } else {
      currentWaterLevelIn5GallonJug = FIVE_GALLON_JUG_CAPACITY;
    }
  }

  private static void pour3GallonTo5Gallon() {
    if(currentWaterLevelIn5GallonJug == FIVE_GALLON_JUG_CAPACITY){
      System.out.println("The jug is already filled. Cannot add more water!");
    } else if(currentWaterLevelIn5GallonJug >= THREE_GALLON_JUG_CAPACITY){
      int volumeThatCanBeTransfered = FIVE_GALLON_JUG_CAPACITY - currentWaterLevelIn3GallonJug;
      currentWaterLevelIn5GallonJug += volumeThatCanBeTransfered;
      currentWaterLevelIn3GallonJug = currentWaterLevelIn3GallonJug - volumeThatCanBeTransfered;
    } else {
      currentWaterLevelIn5GallonJug += currentWaterLevelIn3GallonJug;
      currentWaterLevelIn3GallonJug = 0;
    }
  }

  private static void pour5GallonTo3Gallon() {
    if(currentWaterLevelIn3GallonJug == THREE_GALLON_JUG_CAPACITY){
      System.out.println("The jug is already filled. Cannot add more water!");
    } else {
      int volumeThatCanBeTransfered = THREE_GALLON_JUG_CAPACITY - currentWaterLevelIn3GallonJug; 
      int volumeThatIsTransferred =  (volumeThatCanBeTransfered > currentWaterLevelIn5GallonJug) ? currentWaterLevelIn5GallonJug : volumeThatCanBeTransfered; 
      currentWaterLevelIn3GallonJug += volumeThatIsTransferred;
      currentWaterLevelIn5GallonJug = currentWaterLevelIn5GallonJug - volumeThatIsTransferred;
    }
  }

  private static void empty3Gallon() {
    if(currentWaterLevelIn3GallonJug<=0){
      System.out.println("The jug is already empty!");
    } else {
      currentWaterLevelIn3GallonJug = 0;
    }
  }

  private static void empty5Gallon() {
    if(currentWaterLevelIn5GallonJug<=0){
      System.out.println("The jug is already empty!");
    } else {
      currentWaterLevelIn5GallonJug = 0;
    }
  }
}