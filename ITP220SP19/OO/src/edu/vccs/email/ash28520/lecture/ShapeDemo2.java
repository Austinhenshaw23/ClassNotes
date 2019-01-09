package edu.vccs.email.ash28520.lecture;

public class ShapeDemo2 {
   public static void main(String[] args) {
      Shape[] shapes = new Shape[3];
      shapes[0] = new Circle(1.0);
      shapes[1] = new ColoredCircle(2.0, "blue");
      shapes[2] = new Square(3.0);

      for (Shape shape : shapes) {
         shape.setCenter(Math.random(), Math.random());
         tellMeAbout(shape);
      }
   }
   private static void tellMeAbout(Shape shape) {
      System.out.printf("%s", shape);
      System.out.printf(": Area = %f", shape.getArea());
      System.out.printf(" at (%f.3f, %.3f\n", shape.getCenterX(),
                        shape.getCenterY());
   }
}
