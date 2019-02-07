
import java.util.ArrayList;

public class ShapesStep2
{
  public static void main(String[] args)
  {

    ArrayList<Shape> shapes = new ArrayList<Shape>();

    for(int i = 1; i < 5; i++)
    {
      shapes.add(new Circle(i));
      shapes.add(new Rectangle(10 - i, 5));
    }

    for(Shape s : shapes)
    {
      System.out.println(s);
      System.out.format("Area = %.1f", s.calcArea());
      System.out.format("\nPerimeter = %.1f\n", s.calcPerimeter());

    }
  }
}
