package model;

public class Match {
    private String homeTeam; // Num - 0

    private String awayTeam; // Num - 1
    private Integer winningTeam;
    private Integer losingTeam;

    public Match(String hTeam, String aTeam) {
        homeTeam = hTeam;
        awayTeam = aTeam;
        winningTeam = -1;
        losingTeam = -1;
    }

    public Integer getWinningTeam() {
        return winningTeam;
    }

    public Integer getLosingTeam() {
        return losingTeam;
    }

    public void setResultByWinning(Integer winningTeam) {
        setWinningTeam(winningTeam);

        if(winningTeam == 1) {
            setLosingTeam(0);
        } else {
            setLosingTeam(1);
        }
    }

    public void setWinningTeam(Integer winningTeam) {
        this.winningTeam = winningTeam;
    }

    public void setLosingTeam(Integer losingTeam) {
        this.losingTeam = losingTeam;
    }
}

