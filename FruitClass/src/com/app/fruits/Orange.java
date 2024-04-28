package com.app.fruits;

public class Orange extends FruitBasket {
   public Orange(String fname, String fcolor, float weight) {
      super(fname, fcolor, weight);
   }

   public String taste() {
      return "Sour.";
   }

   public  String juice() {
    return this.getFname()+" "+this.getWeight()+" extracting juice.";
   }

   public String toString() {
      return super.toString();
   }
}
