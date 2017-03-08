// Contributions;
// Andy - Setting up the class. Main contributor of the class.

public class Player {
  private String name;

  private double cash;
  private double debt;

  public Player(String name) {
    this.name = name;
    this.cash = 0;
    this.debt = 0;
  }

  public String getName() {
    return this.name;
  }

  public double getCash() {
    return this.cash;
  }

  public double getDebt() {
    return this.debt;
  }

  public void setCash(double cash) {
    this.cash = cash;
  }

  public void setDebt(double debt) {
    this.debt = debt;
  }
}
