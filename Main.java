public class Main {
  public static void main(String []args){
    Hero h1 =new Hero();
    h1.name ="あみ";
    h1.hp =100;
    Hero h2 =new Hero();
    h2.name ="いけび";
    h2.hp =100;
    Wizard w =new Wizard();
    w.name ="ジェシー";
    w.hp=50;
    w.heal(h1);
    w.heal(h2);
    w.heal(h2);
  }
}

