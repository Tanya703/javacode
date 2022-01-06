public class Circle extends GeometricObject implements Comparable<GeometricObject>{
	private double radius;

	public Circle() {
	}

	public Circle(double radius){
//constructs geometric object with area
		super(radius);
		super.setArea(getArea());
		try{
		setRadius(radius);}
		catch( InvalidRadiusException ex){
			System.out.println(ex);
		}
	}

	public Circle(double radius, String color, boolean filled){
		try{
		setRadius(radius);}
		catch( InvalidRadiusException ex){
			System.out.println(ex);
		}
		try{
		setColor(color);}
		catch( InvalidColorException ex){
			System.out.println("Color can't be red");
		}
		setFilled(filled);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) throws InvalidRadiusException{
		if (radius>=0){
		this.radius = radius;}
		else{
			throw new InvalidRadiusException(radius);
		}
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	public double getDiameter() {
		return 2 * radius;
	}

	public int compareTo(GeometricObject o){
		if(getArea()>o.getArea())
			return 1;
		else if(getArea()<o.getArea())
			return -1;
		else
			return 0;
	}
	public void printCircle()
	{
		System.out.println("The circle is created " + getDateCreated() + " with the radius is " + radius);
	}
	public String toString(){
		return "Circle - Radius: "+getRadius()+" Area: "+getArea();
	}
}
