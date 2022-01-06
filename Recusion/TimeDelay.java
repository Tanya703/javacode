public class TimeDelay{
  public TimeDelay(int n){
    while(n>0){
      System.out.println(n+"...");
      oneSecondDelay();
      n-=1;
    }
  }
  public void oneSecondDelay(){
    try{
      Thread.sleep(1000);
    }
    catch(InterruptedException ignore){

    }
  }
  public static void main(String[] args){
    TimeDelay c=new TimeDelay(10);
  }
}
