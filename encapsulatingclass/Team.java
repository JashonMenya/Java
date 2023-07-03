package encapsulatingclass;

/**
 * This class represents a team of players.
 */
public class Team {
    public String teamName;
    public Player[] playerArray;

    /*
     * Add a constructor that takes a team name and an array of players.
     */
    public Team(String n, Player[] p) {
        teamName = n;
        playerArray = p;
    }

    /*
     * return the player Array
     */
    public Player[] getPlayerArray() {
        return playerArray;
    }

    /*
     * set the player Array
     */
    public void setPlayerArray(Player[] p) {
        playerArray = p;
    }

}
