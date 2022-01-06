public class  TimeDelayRecusion{
  public  TimeDelayRecusion(int n){
    oneSecondDelay(n);
  }
  //recusion
  public void oneSecondDelay(int n){
    //base case
    if(n==0)
      return;
    else{
      System.out.println(n+"...");
    try{
      Thread.sleep(1000);
    }
    catch(InterruptedException ignore){}
      oneSecondDelay(n-1);
  }
}
  public static void main(String[] args){
    TimeDelay c=new TimeDelay(10);
  }
}
