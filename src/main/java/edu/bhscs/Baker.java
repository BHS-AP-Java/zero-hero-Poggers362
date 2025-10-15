// Linus Ortiz
// P2
// Zero Hero
// 10/10/2025

package edu.bhscs;

public class Baker {
  // PROPERTIES AND FIELDS
  Player p;
  Flour f;
  Store placeOfWork;
  int cash;
  String name = "wow";

  // CONSTRUCTOR
  Baker(Player p) {
    this.p = p;
  }

  // METHODS
  void takeOrder(int price, Customer c) {
    cash += c.pay(price);
    c.takeCake(bakeCake());
    System.out.println(c.pay(price));
  }

  /* public void learn(int amount){
    this.skill += amount;
  } */

  Cake bakeCake() {
    String answer = this.p.giveAnswer("what cake do you you want?");
    return new Cake(answer, this.f);
  }

  void takeJob(Store bakery) {
    String doYouWantToWorkHere = this.p.giveAnswer("Do you want to work at " + bakery.getName());
    if (doYouWantToWorkHere.equals("y")) {
      this.placeOfWork = bakery;
      System.out.println(this.name + " now works at " + bakery.getName());
    }
  }
}
