public class Sword {
  String name;
  int damage;
}

public class Hero {
  String name;
  int hp;
  Sword sword;
  void attack(){
    System.out.println(this.name+"は攻撃した！");
    System.out.println("敵に５ポイントのダメージを与えた！");
  }
}

