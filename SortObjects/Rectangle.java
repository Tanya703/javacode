public class Rectangle extends GeometricObject implements Comparable<GeometricObject>{
	private double width;
	private double height;

	public Rectangle() {
	}

	public Rectangle (double width, double height) {
		//constructs geometric object with area
		super(width,height);
		super.setArea(getArea());
		this.width = width;
		this.height = height;
	}

	public Rectangle(double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		try{
		setColor(color);}
		catch(InvalidColorException ex){
			System.out.println("Color can't be red");
		}
		setFilled(filled);
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this. width = width;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2 * (width * height);
	}
	public int compareTo(GeometricObject o){
		if(getArea()>o.getArea())
			return 1;
		else if(getArea()<o.getArea())
			return -1;
		else
			return 0;
	}
	public String toString(){
		return "Rectangle - Height: "+getHeight()+" Width: "+getWidth()+" Area: "+getArea();
	}
}
