abstract class Shape {
  private String name;

  
  public Shape(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public abstract void draw();

 
}



class Rectangle extends Shape {
  private double width;
  private double height;

  public Rectangle() {
   
    super("Rectangle");
   
  }

 
  public void draw() {
    System.out.println("Drawing a rectangle...");
  }

 
}


class Circle extends Shape {
  private double radius;

  public Circle() {
    super("Circle");
  
  }

 
  public void draw() {
    System.out.println("Drawing a circle...");
  }

 
}



public class Example_main_abstract {
  public static void main(String[] args) {
   
	  Shape a = new Rectangle();
	  Shape b = new Circle();
	  
	  a.draw();
	  b.draw();
   
  }
}