package model;

import java.util.ArrayList;

public class Tournament {
    private ArrayList<Match> matchList;
    private ArrayList<Team> teamList;

    public Tournament() {
        this.matchList = new ArrayList<>();
        this.teamList = new ArrayList<>();
    }

    public void addTeam(Team t) {
        teamList.add(t);
    }

    public void addMatch(Match m) {
        matchList.add(m);
    }
}
