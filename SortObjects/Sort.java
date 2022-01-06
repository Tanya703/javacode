import java.util.*;
public class Sort {
//  static GeometricObject[] al = {new Circle(8), new Circle(1),
  		//	new Circle(3)};

  static ArrayList<GeometricObject> al=new ArrayList<>();
  public static void main(String[] args){
  al.add(new Circle(8.0));
  al.add(new Rectangle(1.0,2.0));
  al.add(new Octagon(10.0));
  al.add(new Circle(20.0));
  System.out.println("Total area of elements in arrayList: " + sumArea());
printSorted();

}
/**public static double sumArea() {
		double sum = 0;
		for (int i = 0; i < al.length; i++) {
			sum += al[i].getArea();
		}
		return sum;
	}*/
/**public static void printSorted(){
  Arrays.sort(al);
  for (int i = 0; i < al.length; i++) {
    System.out.println(al[i].toString());}
  }*/
  //sorts by area and prints
  public static void printSorted(){
    System.out.println("Sorted by area: ");
     Collections.sort(al);
    for (int i = 0; i < al.size(); i++) {
      System.out.println((al.get(i)).toString());}}
//calculates the total area in ArrayList
public static double sumArea() {
  double area=0.0;
  for(int i = 0; i < al.size();i++){
    area+=(al.get(i)).getArea();}
		return area;
	}
}
