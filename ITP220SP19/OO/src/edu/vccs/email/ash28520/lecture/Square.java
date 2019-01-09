package edu.vccs.email.ash28520.lecture;

/**
 * @author ash
 */
public class Square {
   private double side;

   public Square() {
   }

   public Square(double side) {
      setSide(side);
   }

   public double getSide() {
      return side;
   }

   public void setSide(double side) {
      if (side >= 0) {
         this.side = side;
      }
   }

   @Override
   public String toString() {
      return "Square{" +
          "side=" + side +
          '}';
   }
}
