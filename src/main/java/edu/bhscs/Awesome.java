package edu.bhscs;

public class Awesome {
  // cool shit here
  // |
  // |
  // V

  String name;



  public Awesome(String name) {
    System.out.println("I am awesome " + name);
    this.name = name;
  }

  String getName() {
    return "I am " + this.name;

  }
}
