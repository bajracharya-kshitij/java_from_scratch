class FinalClassDemo {

  public static void main(String args[]) {

    System.out.println("***DC***");
    SuperHero flash = new DCComics();
    flash.name = "The Flash";
    flash.superpower = "being the fastest man alive";
    flash.printSuperpower();
    DCComics.printComicBooks();

    System.out.println("\n***Marvel***");
    // SuperHero deadpool = new MarvelComics(); /* Cannot create instance of MarvelComics*/
    SuperHero deadpool = new Marvel();
    deadpool.name = "Deadpool";
    deadpool.superpower = "quick healing";
    deadpool.printSuperpower();
    // Marvel.printComicBooks();
  }
}

abstract class SuperHero {

  String name;
  String superpower; 

  abstract void printSuperpower();

}

class DC extends SuperHero {

  void printSuperpower() {
    System.out.println("My superpower is " + this.superpower + ". People call me " + this.name + ".");
  }
}

final class Marvel extends SuperHero {

  void printSuperpower() {
    System.out.println("My name is " + this.name + " and my superpower is " + this.superpower + ".");
  }

}

class DCComics extends DC {

  static void printComicBooks() {
    System.out.println("I have my own series of comic books.");
  }

}

// Cannot extend final class Marvel, results in compile error
/*
class MarvelComics extends Marvel {
  static void printComicBooks() {
    System.out.println("I have my own series of comic books.");
   }
}
*/