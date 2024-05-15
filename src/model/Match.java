package model;

public class Match {
    private Team homeTeam;
    private Team awayTeam;
    private TeamType winningTeam;
    private TeamType losingTeam;
    private Integer matchNum;

    public Match(Team hTeam, Team aTeam) {
        homeTeam = hTeam;
        awayTeam = aTeam;
        winningTeam = null;
        losingTeam = null;
        matchNum = 0;
    }

    // Assigns the winning and losing team for a match, based on the team type of the winning team
    public void setResultByWinning(TeamType winningTeam) {
        setWinningTeam(winningTeam);

        if(winningTeam == TeamType.HOME) { // If winning team is homeTeam, set awayTeam as losing team
            setLosingTeam(TeamType.AWAY);
        } else { // If winning team is awayTeam, set homeTeam as losing team
            setLosingTeam(TeamType.HOME);
        }
    }

    // Getters

    public TeamType getWinningTeam() {
        return winningTeam;
    }

    public TeamType getLosingTeam() {
        return losingTeam;
    }
    public Integer getMatchNum() {
        return matchNum;
    }

    // Setters

    public void setWinningTeam(TeamType winningTeam) {
        this.winningTeam = winningTeam;
    }

    public void setLosingTeam(TeamType losingTeam) {
        this.losingTeam = losingTeam;
    }

    public void setMatchNum(Integer matchNum) {
        this.matchNum = matchNum;
    }
}

