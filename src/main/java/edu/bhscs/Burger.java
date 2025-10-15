// Linus Ortiz
// P2
// Zero Hero
// 10/10/2025

package edu.bhscs;

public class Burger {
  // Propertie(s) and Field(s)
  Boolean hasCheese;
  int weight;
  int size = 15;
  int rand;
  String underLine = "";
  String paddy = "";
  String buns = "";
  String lettuce = "";

  // Constructor(s)
  public Burger() {}

  // Method(s)

  void burgerSize(int size){
    for (int i = 0; i < size; i++) {
      underLine += "_";
      paddy += "|";
      //the random to make a bun with seeds
      if (((int) (Math.random() * 15 + 1)) > 12){
        buns += "'";
      }
      else if (((int) (Math.random() * 15 + 1)) <= 9){
        buns += " ";
      }
      else if (((int) (Math.random() * 15 + 1)) > 9 || ((int) (Math.random() * 15 + 1)) <= 12){
        buns += ".";
      }


      rand = (int) (Math.random() * 3 + 1);
      if (rand == 1){
        lettuce += "/";
      }

      else if (rand == 2){
        lettuce += "|";

      }

      else;{
        lettuce += "\\";
      }

    }
  }


  void draw(){
    System.out.println("I\'m drawing a burger");
    burgerSize(size);

    System.out.println("  " + underLine + "  ");
    System.out.println(" /" + buns + "\\");
    System.out.println(" (" + paddy + ") ");
    System.out.println(lettuce);
    //System.out.println("/\\|/\\\\|/|/\\|/\\/\\V\\V");
    System.out.println("__" + underLine + "__");
    System.out.println(" \\" + underLine + "/");




  }




}
