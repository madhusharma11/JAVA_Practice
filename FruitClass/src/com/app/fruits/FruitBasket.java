package com.app.fruits;

public abstract class FruitBasket {
   private String fname;
   private String fcolor;
   private float weight;
   private boolean freshness=true;

   public FruitBasket(String fname, String fcolor, float weight) {
      this.fcolor = fcolor;
      this.fname = fname;
      this.weight = weight;
      
   }

   public String getFname() {
      return this.fname;
   }

   public void setFname(String fname) {
      this.fname = fname;
   }
   

   public String getFcolor() {
      return this.fcolor;
   }

   public void setFcolor(String fcolor) {
      this.fcolor = fcolor;
   }

   public float getWeight() {
      return this.weight;
   }

   public void setWeight(float weight) {
      this.weight = weight;
   }

   public boolean getFreshness() {
      return this.freshness;
   }

   public void setFreshness(boolean freshness) {
      this.freshness = freshness;
   }

   public abstract String taste();

   public String toString() {
      return "Fruit name: " + this.fname + ", fruit color: " + this.fcolor +
    		  ", Fruit weight: " + this.weight + "\n";
   }
}
