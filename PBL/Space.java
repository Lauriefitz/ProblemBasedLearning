// Contributions;
// Andy - Setting up the class. Main contributor of the class.

import java.util.ArrayList;

public class Space {
  // Quadrant data from the Board class.
  private String quadrant;
  private int index;

  private String owner = "";
  private ArrayList<String> seen; // To check who can look at the BlueCard freely.
  private BlueCard card; // Each Space will have an assigned BlueCard to them.
  private boolean bought; // Checking if a drill concession is bought aka ownership token.
  private boolean rig; // Checking if a drill rig is installed.

  public Space(String quadrant, int index) {
    this.setQuadrant(quadrant);
    this.setIndex(index);

    this.seen = new ArrayList<String>();
    this.setCard(new BlueCard());
    this.setBought(false);
    this.destroyRig();
  }

  public Space(String owner, String quadrant, int index) {
    this.setOwner(owner);
    this.Space(quadrant, index);
  }

  // Put this in Driver.java;
  // public void sellSpaceTo(dealer) {
  //   // int profit =
  //   // dealer.setCash(dealer.getCash())
  //   //
  //   this.giveSpaceTo(dealer.getName());
  // }

  public void giveSpaceTo(String owner) {
    this.setOwner(owner);
    this.setBought(true);
  }

  public String toString(String player) {
    this.seen.add(player);
    // Showing the blue card's data to the player.
    String str =
    "";

    return str;
  }

  public String getQuadrant() {
    return this.quadrant;
  }

  public int getIndex() {
    return this.index;
  }

  public String getOwner() {
    return this.owner;
  }

  public ArrayList<String> getSeen() {
    return this.seen;
  }

  public BlueCard getCard() {
    return this.card;
  }

  public boolean getBought() {
    return this.bought;
  }

  public boolean getRig() {
    return this.rig;
  }

  public void setQuadrant(String quadrant) {
    this.quadrant = quadrant;
  }

  public void setIndex(int index) {
    this.index = index;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public void setCard(BlueCard card) {
    this.card = card;
  }

  public void setBought(boolean bought) {
    this.bought = bought;
  }

  public void newRig() {
    this.rig = true;
  }

  public void destroyRig() {
    // if (weather == "Gale") {
    //  spaces[i].destroyRig();
    // }
    this.rig = false;
  }
}
