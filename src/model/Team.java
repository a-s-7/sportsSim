package model;

public class Team {
    private String name;
    private Integer points;
    private Integer matchCount;
    private Integer winCount;
    private Integer lossCount;
    private Integer noResultCount;

    public Team(String teamName) {
        this.name = teamName;
        this.points = 0;
        this.matchCount = 0;
        this.winCount = 0;
        this.lossCount = 0;
        this.noResultCount = 0;
    }

    // General Methods:

    public void incrementMatchCount() {
        this.matchCount++;
    }

    public void incrementWinCount() {
        this.winCount++;
    }

    public void incrementLossCount() {
        this.lossCount++;
    }

    public void incrementNoResultCount() {
        this.noResultCount++;
    }

    public boolean checkTeamCounts() {
        return this.matchCount == (this.winCount + this.lossCount + this.noResultCount);
    }

    public void incrementPoints(Integer points) {
        this.points += points;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public Integer getPoints() {
        return this.points;
    }

    public Integer getMatchCount() {
        return this.matchCount;
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

    public void setMatchCount(Integer matchCount) {
        this.matchCount = matchCount;
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
