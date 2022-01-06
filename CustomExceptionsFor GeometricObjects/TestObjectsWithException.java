public class TestObjectsWithException{
  public static void main(String[] args){
    //1
    System.out.println("Object1");
  new Circle(-1,"red",true);
//2
System.out.println("Object2");
  new Circle(5,"red",true);
//3
System.out.println("Object3");
  new Circle(-5,"black",true);

//4
System.out.println("Object4");
  new Rectangle(4,5,"green",true);
//5
System.out.println("Object5");
  new Rectangle(3,5,"red",true);
  }
}
