public abstract class GeometricObject implements Comparable<GeometricObject>{
  private String color = "white";
	private boolean filled=false;
	private java.util.Date dateCreated;
  public double area;
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
  //for octagon and circle
  public GeometricObject(double a) {

  }
  //for rectangle
  public GeometricObject(double a,double b) {

  }
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color)throws InvalidColorException {
		if(color.equals("red")){
      throw new InvalidColorException();
    }
      else{
    this.color = color;}
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
  public void setArea(double area) {
		this.area = area;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

  public int compareTo(GeometricObject o){
    if(getArea()>o.getArea())
      return 1;
    else if(getArea()<o.getArea())
      return -1;
    else
      return 0;
  }
	public String toString() {
		return "Created on: " + dateCreated + ", color: " + color +
			", filled: " + filled;
	}

public abstract double getArea();

}
