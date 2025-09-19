package edu.bhscs;

import java.util.ArrayList;
import java.util.List;

public class Cake {


  String flavour;
  String frostingFlavour;
  String price;

  public Cake(String flavour) {
    System.out.println(flavour);
    this.flavour = flavour;
  }

  String getFlavour() {
    return "I am " + this.flavour;

    }



    void learnFlavour(String frostingFlavour) {
      this.frostingFlavour = frostingFlavour;
    }

    String getFrostingFlavour() {
      return this.frostingFlavour;
    }

}








