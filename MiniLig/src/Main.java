
public class Main {

    public static void main(String[] args) {
        
        
        Team team1 = new Team("Galatasaray", "Istanbul");
        Team team2 = new Team("Fenerbahçe", "Istanbul");
        
        team1.addWin();
        team2.addLoss();
        
        System.out.println(team1);
        System.out.println(team2);
    }
    
}
