package edu.bhscs;

import java.util.List;

public class Baker {

  List<String> flavours = List.of("Chocolate", "Vannilla", "Strawberry");
  String theFlavour = flavours.get((int) (Math.random() * 3));
  String theFrostingFlavour = flavours.get((int) (Math.random() * 3));

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
