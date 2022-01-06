import java.util.*;
public class DNABarcodeGenerator{
  static int N;
  static int L;

//Tanya Matsegora tm3515
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //get number of sequences
    System.out.println("How many sequences of DNA barcodes you would like to generate?");
    N=input.nextInt();
    //get length
    System.out.println("What is the length of the DNA barcode?");
    L=input.nextInt();
    String barcode;

    for (int i=1;i<N+1;i++){
      //generate, check and replace with new barcode if needed
      do{
          barcode=generateBarcode();
        }while((isRedundantBarcode(barcode))||(!(validateGCCount(barcode))));
        barcode=isRestrictedList(barcode);
        //print
        System.out.println("barcode"+i+": "+ barcode);
    }
  }

  //generate a barcode
  public static String generateBarcode (){
    String nucleotides ="ATCG";
    String code="";
    for(int i=0;i<L;i++){
      int num=(int)(Math.random()*4);
      code+=nucleotides.charAt(num);}
    return code;
    }

//check if restricted, if yes generate a new one
    public static String isRestrictedList(String barcode){
      String AgeI = "ACCGGT";
      String AscI = "GGCGCGCC";
      String BamHI = "GGATCC";
      String SbfI = "CCTGCAGG";
      while (barcode.equals(AgeI)||barcode.equals(AscI)||barcode.equals(BamHI)||barcode.equals(SbfI)){
        barcode=generateBarcode();
      }
        return barcode;
    }

//returns true if GC percentage is between 40 and 60
    public static boolean validateGCCount(String barcode){
      char chc='C';
      char chg='G';
      int count=0;
      //count occurance of G and C
      for (int i = 0; i <barcode.length(); i++){
        char temp = barcode.charAt(i);
        if (temp == chc || temp == chg){
          count++;
        }
      }
      //find percentage of GC in barcode
      double content=((count/(double)barcode.length()*100));
      //check
      if (content>=40 && content<=60 )
        return true;
      else
        return false;
    }
    
//returns true if there are 3 identical nucleotides in a row
    public static boolean isRedundantBarcode(String barcode){
      for (int i = 0; i <barcode.length()-2; i++){
        char temp = barcode.charAt(i);
        if (temp == barcode.charAt(i+1) && temp == barcode.charAt(i+2))
          return true;
        }
        return false;
  }
}
