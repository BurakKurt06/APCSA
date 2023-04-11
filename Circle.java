import java.util.Scanner;

//Burak Kurt
public class Circle {
private double circle;
private double radius; 
private double area;
private double diameter;
private double circumference;
    
public Circle(double c, double r, double a, double d, double cf) {
    circle = c;
    radius = r; 
    area = a;
    diameter = d;
    circumference = cf;
}

public double getCircle() {
	return circle;
}

public void setCircle(double circle) {
	this.circle = circle;
}


public double getRadius() {
	return radius;
}

public void setRadius(double radius) {
	this.radius = radius;
}


public double getArea() {
	return area;
}

public void setArea(double area) {
	this.area = area;
}


public double getDiameter() {
	return diameter;
}

public void setDiameter(double diameter) {
	this.diameter = diameter;
}


public double getCircumference() {
	return circumference;
}

public void setCircumference(double circumference) {
	this.circumference = circumference;
}


public String toString () {
return "Circle:\nRadius:" + radius + "Area:" + area + "Diameter:" + diameter + "Circumference:" + circumference + "\n";
}

public Circle() {}
public Circle(double r) {
	// TODO Auto-generated constructor stub
}

public static void main(String[] args) {

	Circle one = new Circle();
	one.setRadius(10);
	System.out.println(one);
	System.out.println();

	Circle two = new Circle(11.9);
	System.out.println(two);
	System.out.println();

	Scanner key = new Scanner(System.in);
	System.out.println("Enter the radius");
	double r = key.nextDouble();
	Circle three = new Circle(r);
	System.out.println(three);
	System.exit(0);
}
}