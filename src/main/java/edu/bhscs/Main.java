// Linus Ortiz
// P2
// Zero Hero
// 9/12/2025

/*
 * DESCRIPTION: Whatever Mr. Reiber commands INPUT: dunno what this is about yet OUTPUT: print
 * garbage! EDGE CASE: *
 */

package edu.bhscs;


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
        // make list works myNum.add(int, index someNumber);
      }
    }

    //Mostly pointless print statements
    System.out.println(myNum + "working list!");
    System.out.println("67!" + A + someNumber);
    System.out.print(A + "?" + A + someNumber);
    System.out.print(A + A + someNumber);
    System.out.println();
    System.out.println("this is neet");
    System.out.println();
    System.out.println();
    System.out.println("okay Im done");

  }
}

