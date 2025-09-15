// Linus Ortiz
// P2
// Zero Hero
// 9/12/2025

/*
 * DESCRIPTION: Whatever Mr. Reiber commands INPUT: dunno what this is about yet OUTPUT: print
 * garbage! EDGE CASE: *
 */

package edu.bhscs;

import java.util.ArrayList;
import java.util.List;

class Main {

  public static final char A = 'a';

  public static void main(String[] args) {

    // while loop and list testing
    int someNumber = 7;
    List<Integer> myNum = new ArrayList<Integer>(5);
    while (someNumber < 35) {
      someNumber++;
      if (someNumber % 5 == 0) {
        System.out.println(someNumber);
        myNum.add(someNumber);
      }
    }

    // Mostly pointless print statements
    System.out.println(myNum + "working list!");
    System.out.println("67!" + A + someNumber);
    System.out.print(A + "?" + A + someNumber);
    System.out.print(A + A + someNumber);
    System.out.println();
    System.out.println("this is neet");
    System.out.println();
    System.out.println();
    System.out.println("okay Im done");


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


  }
}