import java.math.BigDecimal;

public class Day9Clicle {
  private String color;
  private double radius;
  // private double area; 
  // don't use "area", because violate OOP concept, because readly have "radius"

  // Constructor (all args constructor)
  public Day9Clicle(double radius, String color){
    this.radius = radius;
    this.color = color.toUpperCase();
  }

  public double calArea() {
    return BigDecimal.valueOf(this.radius)//
    .multiply(BigDecimal.valueOf(this.radius))//
    .multiply(BigDecimal.valueOf(Math.PI))//
    .doubleValue();
  }

  public double calDiameter() {
    return BigDecimal.valueOf(this.radius)//
    .multiply(BigDecimal.valueOf(2.0))//
    .doubleValue();  
  }

  public static void main(String[] args) {
   
    Day9Clicle c1 = new Day9Clicle(3.5,"RED");
    Day9Clicle c2 = new Day9Clicle(4.5, "BLUE");
    
    Day9Clicle[] clicles = new Day9Clicle[2];
    clicles[0] = c1;
    clicles[1] = c2;
    System.out.println("c2's color is " + clicles[1].color); // alse can create a getColor method for that
    System.out.println("c1's area is " + clicles[0].calArea());

    System.out.println("c1's diameter is " + clicles[0].calDiameter());

    
  }

}
