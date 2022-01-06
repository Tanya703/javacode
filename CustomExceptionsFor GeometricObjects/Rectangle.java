public class Rectangle extends GeometricObject {
	private double width;
	private double height;

	public Rectangle() {
	}

	public Rectangle (double width, double height) {
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


	public double getheight() {
		return height;
	}


	public void setheight(double height) {
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2 * (width * height);
	}


}
