public class InvalidColorException extends Exception {
      private String color;

     /** Construct an exception */
     public InvalidColorException() {
        super("color can't be Red");
       this.color = color;
      }


   /** Return the radius */
   public String getColor() {
     return color;
    }
  }
