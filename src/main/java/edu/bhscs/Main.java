// Linus Ortiz
// P2
// Zero Hero
// 9/19/2025

/*
 * DESCRIPTION: Have a cake that can be different and be purchased (very inefficiently)
 * INPUT:
 * OUTPUT: Guy with a cake
 * EDGE CASE: Is the cake satisfactory
 */

package edu.bhscs;

import java.util.ArrayList;
import java.util.List;

class Main {

  public static void main(String[] args) {

    List<String> myCake = new ArrayList<String>();

    List<String> cakePreference = new ArrayList<String>();
    cakePreference.add("chocolate cake");
    cakePreference.add("strawberry frosting");

    //Figuring out what the cake is.
    Cake taste = new Cake("vanilla cake");

    taste.learnFlavour("strawberry frosting");

    System.out.println(taste.getFlavour());
    myCake.add(taste.getFlavour());

    System.out.println(taste.getFrostingFlavour());
    myCake.add(taste.getFrostingFlavour());

    System.out.println(myCake);
    System.out.println(cakePreference);

    // Checks to see if the cake made is what you want
    for (int i = 0; i < 2; i++) {
       //If they didn't like it they tell you
      if (myCake.get(i) != cakePreference.get(i)) {
        System.out.println(
        ("I don't want " + myCake.get(i)) + (" I wanted " + cakePreference.get(i)));
      }
       //If they did like it they tell you
      if (myCake.get(i) == cakePreference.get(i)) {
        System.out.println("I like the " + cakePreference.get(i));
      }
    }
  }
}
