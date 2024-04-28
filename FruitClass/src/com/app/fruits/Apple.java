package com.app.fruits;

public class Apple extends FruitBasket {
   public Apple(String fname, String fcolor, float weight) {
      super(fname, fcolor, weight);
   }

   public String taste() {
      return "Sweet and sour.";
   }

   public  String jam() {
     return this.getFname()+" making jam!"; 
     		
   }

   public String toString() {
      return super.toString();
   }
}
