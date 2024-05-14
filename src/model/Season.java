package model;

import java.util.ArrayList;

public class Season {
    private ArrayList<Match> matchList;
    private ArrayList<Team> teamList;

    public Season(Integer numberMatches, Integer numTeams) {
        this.matchList = new ArrayList<>(numberMatches);
        this.teamList = new ArrayList<>(numTeams);
    }

    public void addTeam(Team t) {
        teamList.add(t);
    }

    public void addMatch(Match m) {
        matchList.add(m);
    }
}
