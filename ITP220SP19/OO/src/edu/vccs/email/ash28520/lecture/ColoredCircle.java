package edu.vccs.email.ash28520.lecture;

public class ColoredCircle extends Circle {
   private String color;

   public ColoredCircle() {
   }

   public ColoredCircle(String color) {
      this.color = color;
   }

   public ColoredCircle(double radius, String color) {
      super(radius);
      this.color = color;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   @Override
   public String toString() {
      return "ColoredCircle{" +
          "color='" + color + '\'' +
          "} " + super.toString();
   }
}
