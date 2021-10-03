package Week09;

public interface game {

    // every method in an interface will be public and abstract
    // can only define constants in interface
    // any class that implements a interface must be able to do the methods in the interface class

    public abstract void setRules(String[] rules);
    public abstract void setPlayersPerTeam(int playersPerTeam);
    public abstract String[]getRules();
    public abstract int getPlayersPerTeam();



}
