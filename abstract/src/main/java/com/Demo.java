package com;

public class Demo {

  public static void main(String[] args) {
    Cock cock = new Cock();
    Hen hen = new Hen();
    ChildChicken childChicken = new ChildChicken();

    cock.outPut();
    hen.outPut();
    System.out.format("100元可以买%s %d只\n", childChicken.getType(), (int)(100 / childChicken.getPrice()));
  }

}
