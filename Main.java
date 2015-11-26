public class Main {
  public static void main (String[] args) {
    final double TAX = 1.08;
    int fax =5;
    System.out.println("５万円から４万円に値下げします。");
    fax = 4;
    System.out.println("FAXの新価格（税込）");
    System.out.println(fax*TAX+"万円");
  }
}

