// Linus Ortiz
// P2
// Zero Hero
// 9/19/2025

/*
 * DESCRIPTION: Have a cake that can be different and be purchased
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








    Awesome one = new Awesome("1");
    Awesome two = new Awesome("2");
    Awesome three = new Awesome("3");
    Awesome four = new Awesome("4");
    Awesome five = new Awesome("5");
    Awesome six = new Awesome("6");

    System.out.println(one.getName());
    System.out.println(two.getName());
    System.out.println(three.getName());
    System.out.println(four.getName());
    System.out.println(five.getName());
    System.out.println(six.getName());

    one.learnSomething("I know stuff");

    System.out.println(one.getKnowledge());

    one.learnSomething("I know even more stuff!");

    System.out.println(one.getKnowledge());



    Cake taste = new Cake("vanilla");

    taste.learnFlavour("Chocolate Frosting");


    System.out.println(taste.getFlavour());
    myCake.add(taste.getFlavour());

    System.out.println(taste.getFrostingFlavour());
    myCake.add(taste.getFrostingFlavour());



    System.out.println(myCake);


    /*
     * while loop and list testing int someNumber = 7; List<Integer> myNum = new
     * ArrayList<Integer>(5); while (someNumber < 35) { someNumber++; if (someNumber % 5 == 0) {
     * System.out.println(someNumber); myNum.add(someNumber); } }
     *
     *
     * // my list works! System.out.println(myNum + "working list!");
     */
  }
}
