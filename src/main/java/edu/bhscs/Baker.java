package edu.bhscs;

import java.util.List;

public class Baker {

  List<String> Flavours = List.of("Chocolate", "Vannilla", "Strawberry");
  String theFlavour = Flavours.get((int)(Math.random() * 3));
  String theFrostingFlavour = Flavours.get((int) (Math.random() * 3));



  public Baker(String theFlavour) {
    System.out.println(theFlavour);
    this.theFlavour = theFlavour;
  }

  String getTheFlavour() {
    return this.theFlavour;
  }

  void learnTheFlavour(String theFrostingFlavour) {
    this.theFrostingFlavour = theFrostingFlavour;
  }

  String getTheFrostingFlavour() {
    return this.theFrostingFlavour;
  }
}


