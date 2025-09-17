package edu.bhscs;

public class Awesome {
  // cool shit here
  // |
  // |
  // V

  String name;
  String knoledge;
  String knoledgeagain;


  public Awesome(String name) {
    System.out.println("I am awesome " + name);
    this.name = name;
  }

  String getName() {
    return "I am " + this.name;

  }

  void learnSomething(String knowledge){
    this.knoledge = knowledge;
  }
  String getKnowledge(){
    return this.knoledge;
  }

  void learnSomethingagain(String knowledge) {
    this.knoledge = knoledgeagain;
  }

  String getKnowledgeagain() {
    return this.knoledgeagain;
  }


}


