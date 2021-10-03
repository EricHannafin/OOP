package Week09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;

public final class soccer extends ballSport implements game {

    private int gameDuration;
    private String[] surfaces;
    private String[] rules;
    private int playersPerTeam;

    public soccer(String name, int yearsEstablished, int gameDuration, String[] surfaces, String[] rules, int playersPerTeam) {
        super(name, yearsEstablished);
        setGameDuration(gameDuration);
        setSurfaces(surfaces);
        setRules(rules);
        setPlayersPerTeam(playersPerTeam);
    }

    public int getGameDuration() {
        return gameDuration;
    }

    public void setGameDuration(int gameDuration) {
        this.gameDuration = gameDuration;
    }

    public String[] getSurfaces() {
        return surfaces;
    }

    public void setSurfaces(String[] surfaces) {
        this.surfaces = surfaces;
    }

    @Override
    public String[] getRules() {
        return rules;
    }

    @Override
    public void setRules(String[] rules) {
        this.rules = rules;
    }

    @Override
    public int getPlayersPerTeam() {
        return playersPerTeam;
    }

    public void setPlayersPerTeam(int playersPerTeam) {
        this.playersPerTeam = playersPerTeam;
    }

    // learn below for final exam. Dont use toString. Use loops to print array
    @Override
    public String toString() {
        String text = "";
        text += super.toString() +
                "\nGame Duration: " + getGameDuration() + " Minutes" + "\nSurfaces for game ";

        if (getSurfaces() == null)
            text += "Surfaces not specified: ";
        else {
            for (int i = 0; i < getSurfaces().length; i++) {
                text += surfaces[i];
            }
        }

        text += "\nRules for game: ";

        if (getRules() == null)
            text += "Rules not specified: ";
        else {
            for (int i = 0; i < getRules().length; i++) {
                text +="Rule " + (i + 1) + ": " + rules[i];
            }
        }

        text += "\nPlayers per team: " + getPlayersPerTeam();

        return text;

    }

}
