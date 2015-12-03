public class Main {
  public static void main (String[]args){
    String title ="お誘い";
    String address ="jessie@j.com";
    String text ="こんにちわ！";
    email(title,address,text);
  }
  public static void email(String title,String address,String text){
    System.out.println(address+"に、以下のメールをお送りしました。");
    System.out.println("件名"+title);
    System.out.println("本文"+text);
  }
}

