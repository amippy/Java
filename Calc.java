public class Calc{
  public static void main (String[]args){
    int a =10; int b =11;
    int total =tasu(a,b);
    int delta =hiku(a,b);
    System.out.println("足したら"+total+"、引いたら"+delta);
  }

  public static int tasu(int a,int b){
    return(a+b);
  }

  public static int hiku(int a,int b){
    return(a-b);
  }
}

