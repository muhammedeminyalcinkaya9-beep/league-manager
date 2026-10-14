
public class Team {

    private String name;
    private String city;
    private int points;
    private int playedMatches;
    private int wins;
    private int draws;
    private int losses;

    public Team(String name, String city) {
        this.name = name;
        this.city = city;
        this.points = 0;
        this.playedMatches = 0;
        this.wins = 0;
        this.draws = 0;
        this.losses = 0;

    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getPoints() {
        return points;
    }

    public int getPlayedMatches() {
        return playedMatches;
    }

    public int getWins() {
        return wins;
    }

    public int getDraws() {
        return draws;
    }

    public int getLosses() {
        return losses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setPlayedMatches(int playedMatches) {
        this.playedMatches = playedMatches;
    }

  

    public void addWin(){
        playedMatches++;
        wins++;
        points +=3;
        
    } 
    public void addDraw(){
        playedMatches++;
        draws++;
        points +=1;
    }
    public void addLoss(){
        playedMatches++;
        losses++;
        
    }

    @Override
    public String toString() {
        return  name + " - " + city +
                "| O: " + playedMatches+
                " G: " + wins + 
                " B: " + draws+
                " M : " + losses+
                " P : "+ points;
                 
    }
            
            
    
}
