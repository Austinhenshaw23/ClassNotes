package edu.vccs.email.ash28520.lecture;

public abstract class Shape implements Centered {
   public abstract double getArea();
   private double x, y; // center of the shape

   @Override
   public double getCenterX() {
      return x;
   }

   @Override
   public double getCenterY() {
      return y;
   }

   @Override
   public void setCenter(double x, double y) {
      this.x = x;
      this.y = y;
   }
}

