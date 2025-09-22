package edu.bhscs;

public class Cake {

  String flavour;
  String frostingFlavour;
  String price;

  public Cake(String flavour) {
    System.out.println(flavour);
    this.flavour = flavour;
  }

  String getFlavour() {
    return this.flavour;
  }

  void learnFlavour(String frostingFlavour) {
    this.frostingFlavour = frostingFlavour;
  }

  String getFrostingFlavour() {
    return this.frostingFlavour;
  }
}
