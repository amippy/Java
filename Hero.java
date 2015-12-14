public class Hero{
  String name;
  int hp;
  static int money;

  static void setRandomMoney(){
    Hero.money= (int)(Math.random()*1000);
  }
}


