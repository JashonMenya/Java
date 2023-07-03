package encapsulatingclass;

/**
 * This class represents a team of players.
 */
public final class Team {
    private String teamName;
    private Player[] playerArray;

    /**
     * Constructs a Team object with the given team name and an array of players.
     *
     * @param teamName    The team's name.
     * @param playerArray An array of players in the team.
     */
    public Team(final String teamName, final Player[] playerArray) {
        this.teamName = teamName;
        this.playerArray = playerArray;
    }

    /**
     * Returns the array of players in the team.
     *
     * @return The array of players in the team.
     */
    public Player[] getPlayerArray() {
        return playerArray;
    }

    /**
     * Sets the array of players in the team.
     *
     * @param playerArray An array of players to set in the team.
     */
    public void setPlayerArray(final Player[] playerArray) {
        this.playerArray = playerArray;
    }

    /**
     * Returns the team's name.
     *
     * @return The team's name.
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Sets the team's name.
     *
     * @param teamName The team's name to set.
     */
    public void setTeamName(final String teamName) {
        this.teamName = teamName;
    }
}
