package model;

public class Team {
    private String name;
    private Integer points;
    private Integer numMatchesPlayed;
    private Integer numMatchesWon;
    private Integer numMatchesLost;

    public Team(String teamName) {
        name = teamName;
        points = 0;
        numMatchesPlayed = 0;
        numMatchesWon = 0;
        numMatchesLost = 0;
    }
}
