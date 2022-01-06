public class Octagon extends GeometricObject implements Comparable<GeometricObject> {
  private double side;

  public Octagon() {
  }
  public Octagon (double side) {
    //constructs geometric object with area
    super(side);
    super.setArea(getArea());
    this.side = side;
  }
  public double getSide() {
		return side;}

  public double getArea() {
		return (2 * (1 + Math.sqrt(2))* side * side);
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
    return "Octagon - Side: "+getSide()+" Area: "+getArea();
  }
}
