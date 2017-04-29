/**
 * Created by Priyam on 4/29/2017.
 */
public class Candidate {
    private String name;
    private int wins;
    private int ties;
    private int losses;

    public Candidate(String name) {
        this.name = name;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    public void addWin(){
        this.wins++;
    }

    public void addTie(){
        this.ties++;
    }

    public void addLoss(){
        this.losses++;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
