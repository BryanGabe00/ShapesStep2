
public class Circle extends Shape
{
  private int radius;

  //default constructor
  public Circle() { this(1); }

  public Circle(int radius)
  {
    setRadius(radius);
  }

  public double calcArea()
  {
    return Math.PI * radius * radius;
  }

  public double calcPerimeter()
  {
    return 2 * Math.PI * radius;
  }

  @Override
  public String toString()
  {
    String superToString = super.toString();
    return String.format("%sRadius = %d\n", superToString, radius);
  }

  //getters
  public final int getRadius() { return radius; }

  //setters
  public final void setRadius(int radius)
  {
    if(radius < 1) throw new IllegalArgumentException("The radius can't be smaller than 1");
    this.radius = radius;
    setWidth(radius * 2);
    setHeight(radius * 2);
  }
}
