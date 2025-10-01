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
import java.util.Scanner;

class Main {

  public static void main(String[] args) {


// Getting user input on what kind of cake and frosting they'd like.
    Scanner preference = new Scanner(System.in);

    System.out.println("What kind of cake do you want?");
    String preferedCake = preference.nextLine();
    System.out.println(preferedCake);

    System.out.println("What kind of cake do you want?");
    String preferedFrosting = preference.nextLine();
    System.out.println(preferedFrosting);




    List<String> flavours = List.of("chocolate", "vanilla", "strawberry");

    List<String> myCake = new ArrayList<String>();

    List<String> cakePreference = new ArrayList<String>();
    cakePreference.add(preferedCake + " cake");
    cakePreference.add(preferedFrosting + " frosting");




    // Figuring out what the cake is randomly.
    Bakery taste = new Bakery(flavours.get((int) (Math.random() * 3)) + " cake");

    taste.learnFlavour(flavours.get((int) (Math.random() * 3)) + " frosting");

    System.out.println(taste.getFlavour());
    myCake.add(taste.getFlavour());

    System.out.println(taste.getFrostingFlavour());
    myCake.add(taste.getFrostingFlavour());

    System.out.println(myCake);
    System.out.println(cakePreference);

    // Checks to see if the cake made is what you want
    for (int i = 0; i < 2; i++) {
      // If they didn't like it they tell youv
      if (!myCake.get(i).equals(cakePreference.get(i))) {
        System.out.println(
            ("I don't want " + myCake.get(i)) + (" I wanted " + cakePreference.get(i)));
      }
      // If they did like it they tell you
      if (myCake.get(i).equals(cakePreference.get(i))) {
        System.out.println("I like the " + cakePreference.get(i));
      }
    }
  }
}
