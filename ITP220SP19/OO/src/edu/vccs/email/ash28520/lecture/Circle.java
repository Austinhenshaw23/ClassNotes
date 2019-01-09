package edu.vccs.email.ash28520.lecture;

/**
 * @author Austin Henshaw
 */
public class Circle {
   private double radius;

   public Circle() {
   }

   public Circle(double radius) {
      this.radius = radius;
   }

   @Override
   public String toString() {
      return "Circle{}" + "radius=" +
          radius + "}";
   }

   public double getCircumference() {
      return 2 *Math.PI * radius;
   }

   public double getRadius() {
      return radius;
   }

   public void setRadius(double radius) {
      if (radius >= 0) {
      this.radius = radius;
   }}

}
