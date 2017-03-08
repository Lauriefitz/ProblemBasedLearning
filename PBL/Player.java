// Contributions;
// Andy - Setting up the class. Main contributor of the class.

public class Player {
  private String name;

  private int cash;
  private int debt;

  public Player(name) {
    this.name = name;
    this.cash = 0;
    this.debt = 0;
  }

  public String getName() {
    return this.name;
  }

  public int getCash() {
    return this.cash;
  }

  public int getDebt() {
    return this.debt;
  }

  public void setCash(int cash) {
    this.cash = cash;
  }

  public void setDebt(int debt) {
    this.debt = debt;
  }
}
