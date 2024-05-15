package model;

public class Team {
    private String name;
    private Integer points;
    private Integer numMatchesPlayed;
    private Integer winCount;
    private Integer lossCount;
    private Integer noResultCount;

    public Team(String teamName, Integer p, Integer nMP, Integer nMW, Integer nML, Integer nMNR) {
        this.name = teamName;
        this.points = p;
        this.numMatchesPlayed = nMP;
        this.winCount = nMW;
        this.lossCount = nML;
        this.noResultCount = nMNR;

    }

    // Getters
    public String getName() {
        return this.name;
    }

    public Integer getPoints() {
        return this.points;
    }

    public Integer getNumMatchesPlayed() {
        return this.numMatchesPlayed;
    }

    public Integer getWinCount() {
        return this.winCount;
    }

    public Integer getLossCount() {
        return this.lossCount;
    }

    public Integer getNoResultCount() {
        return this.noResultCount;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public void setNumMatchesPlayed(Integer numMatchesPlayed) {
        this.numMatchesPlayed = numMatchesPlayed;
    }

    public void setWinCount(Integer winCount) {
        this.winCount = winCount;
    }

    public void setLossCount(Integer lossCount) {
        this.lossCount = lossCount;
    }

    public void setNoResultCount(Integer noResultCount) {
        this.noResultCount = noResultCount;
    }
}
