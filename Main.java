public class Main{
  public static void main (String[]args){
    System.out.println("メソッドを呼び出します");
    hello("アミ");
    hello("有美");
    hello("ami");
    System.out.println("呼び出しが終わりました。");
  }
  public static void hello(String name){
    System.out.println(name+"さん、こんにちは！");
  }
}

