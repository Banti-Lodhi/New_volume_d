public class constructor extends onlineBank {
  public void rateOfInterest() {
    System.out.println("6%");
  }

  public static void main(String[] args) {
    onlineBank on = new onlineBank();
    on.onlineBanking();
    on.rateOfInterest();

    constructor cn = new constructor();
    cn.onlineBanking();
    cn.rateOfInterest();
  }
}