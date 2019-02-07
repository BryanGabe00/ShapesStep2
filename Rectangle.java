
public class Rectangle extends Shape
{
  public Rectangle() { this(1, 1); }

  public Rectangle(int width, int height)
  {
    setWidth(width);
    setHeight(height);
  }

  public double calcArea()
  {
    return getHeight() * getWidth();
  }

  public double calcPerimeter()
  {
    return getHeight() + getHeight() + getWidth() + getWidth();
  }
}
