// Contributions;
// Andy - getNumOfPlayers() and takeLoan().
// Thomas - Loan class or method problem settled.
// Daemon - Plan with starting from the Driver Class.
// Laurie -
// Nathan -

import java.util.Scanner;
import java.util.ArrayList;

public class Driver {
  public Scanner input;
  public ArrayList<Player> players;

  public int turns;
  public int rounds;

  public static void main(String[] args) {
    Driver game = new Driver();
    // Phase 1
    game.getNumOfPlayers();
    for (int i = 0; i < players.size(); i++) {
      game.takeLoan(players.get(i));
    };

    // Phase 3 (For later)
    // Tell the weather as the round starts and how it may affect their oil from an owned space.
    // Do maths and apply them to the players.
      // Capital tax - Tax on oil.
      // Interest rate - Multiply cash by % of the rate.
      // Revenue - Tax on selling drilling concessions or drills.
    // Check if a player has won (cash > 5,000,000) or lost (cash <= 0).

    // Phase 2
    // 0. if round > 0 then | Take out another loan.
    // 1. Survey a plot of land / the spaces. - Board Class
    // 2. Buying a plot of land / the spaces. - Board Class
    // 3. Auction a drilling concession (owning a Space) for a space. Managed here, sent to - Player Class
    // For later; 4. Sell a drilling concession. - Board Class
      // 0. Sell to the bank.
      // 1. Sell to another player.
    // 5. Purchase an oil drill. - Board Class
    // For later; 6. Sell an oil drill. - Board Class
    // For later; 7. View all the spaces.
      // 0. View all active spaces.
      // 1. View your spaces.
    // For later; 8. End your turn.

    game.turns++;
    if (game.turns == 3) {
      game.rounds++;
    }
  }

  public Driver() {
    // Initializing all the variables.
    this.input = new Scanner(System.in);
    this.players = new ArrayList<Player>();
    this.turns = 1;
    this.rounds = 0;
  }

  public void getNumOfPlayers() {
    boolean goodInput = false;
    while (!goodInput) {
      // Repeating this block of code until valid inputs / numbers are given.
      try {
        System.out.println("How many players are playing? (Between 2 and 6 inclusive)");
        int num = input.nextInt();
        while (num < 2 && num > 6) {
          System.out.println("Please type a number between 2 and 6 inclusive!");
          num = input.nextInt();
        }
        for (int i = 0; i < num; i++) {
          System.out.println("Player " + (i + 1) + ", what do you want your name to be? ");
          String name = input.nextLine();
          Player player = new Player(name);
          players.add(player);
        }
        goodInput = true;
        // Error handling;
      } catch (Exception e) {
        System.out.println("Error caused; Please enter a valid integer.");
      }
    }
  }

  public void takeLoan(Player player) {
    System.out.println(Player.getName() + ", how much loan do you want to take out?");
    for (int i = 0; i < 8; i++) {
      // a + (n - 1) * d Formula to calculate the loan (0.5 mil to 4 mil).
      int sum = 0.5 + (i) * 0.5;
      System.out.println(i + ") Take out " + sum + " million.");
    }
    boolean goodInput = false;
    while (!goodInput) {
      try {
        int option = input.nextInt();
        // To Do: Verify if the option is 0 or 1 when round == 0.
        // Maybe put the following lines in an entire while loop and validate success using a boolean condition?
        while (option < 0 && option > 8) {
          System.out.println("Please put a valid number between 0 and 8.");
          option = input.nextInt();
        }
        if ((round > 0 && option <= 8) || (round == 0 && option <= 1)) {
          int sum = (0.5 + (option) * 0.5) * 1000000;
          player.setCash(player.getCash() + sum);
        }
        goodInput = true;
      } catch (Exception e) {
        System.out.println("Error caused; Please enter a valid integer.");
      }
    }
  }
}
