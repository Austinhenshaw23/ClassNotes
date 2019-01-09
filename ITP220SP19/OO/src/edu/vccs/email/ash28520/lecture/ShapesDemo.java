package edu.vccs.email.ash28520.lecture;

public class ShapesDemo {
   public static void main(String[] args) {
      Circle circle = new Circle(1.0);
      ColoredCircle coloredCircle = new ColoredCircle(2.0, "red");
      Square square = new Square(2.1);

      System.out.println(coloredCircle);
      System.out.println(square);
   }
}
