package model;

import java.util.ArrayList;

public class Season {
    private ArrayList<Match> matchList;

    public Season(Integer numberMatches) {
        this.matchList = new ArrayList<>(numberMatches);
    }
}
