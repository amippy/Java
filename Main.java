public class Main {
  public static void main(String[] args){
    int[] numbers={3,4,9};
    System.out.println("１桁の数字を入力してください。");
    int input=new java.util.Scanner(System.in).nextInt();
    for(int n:numbers){
      if(n==input){
        System.out.println("あたり！");
      }
    }
  }
}



    






