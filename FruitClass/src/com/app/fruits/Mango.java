package com.app.fruits;

public class Mango extends FruitBasket {
   public String taste() {
      return "sweet.";
   }

   public Mango(String fname, String fcolor, float weight) {
      super(fname, fcolor, weight);
   }

   public  String pulp() {
    return  this.getFname()+" "+this.getFcolor()+" creating pulp !!!";
    		}

   public String toString() {
      return super.toString();
   }
}
