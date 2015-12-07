package calcapp.main;
public class Calc{
  public static void main (String[]args){
    int a= 10; int b= 2;
    int total =calcapp.logics.CalcLogic.tasu(a,b);
    int delta =calcapp.logics.CalcLogic.hiku(a,b);
    System.out.println("足したら"+total+"、引いたら"+delta);
  }
}


