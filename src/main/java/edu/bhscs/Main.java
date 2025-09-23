// Linus Ortiz
// P2
// Zero Hero
// 9/19/2025

/*
 * DESCRIPTION: Have a cake that can be different and be purchased (very inefficiently)
 * INPUT: dunno yet
 * OUTPUT: Guy with a cake
 * EDGE CASE: Still don't know
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

    Cake taste = new Cake("vanilla cake");

    taste.learnFlavour("strawberry frosting");

    System.out.println(taste.getFlavour());
    myCake.add(taste.getFlavour());

    System.out.println(taste.getFrostingFlavour());
    myCake.add(taste.getFrostingFlavour());

    System.out.println(myCake);
    System.out.println(cakePreference);
    for (int i = 0; i < 2; i++) { // babies first for  loop
      if (myCake.get(i) != cakePreference.get(i)) {
        System.out.println(
            ("I don't want " + myCake.get(i)) + (" I wanted " + cakePreference.get(i)));
      }
      if (myCake.get(i) == cakePreference.get(i)) {
        System.out.println("I like the " + cakePreference.get(i));
      }
    }
  }
}
