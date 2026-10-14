
public class Main {

    public static void main(String[] args) {
        
        
         League superLig = new League("Super Lig");

        Team team1 = new Team("Galatasaray", "Istanbul");
        Team team2 = new Team("galatasaray", "Istanbul");
        
        Team team3 = new Team("Fenerbahce", "Istanbul");

        superLig.addTeam(team1);
        superLig.addTeam(team2);
         superLig.addTeam(team3);
         

        System.out.println("Takim sayisi: " + superLig.getTeamCount());
        
        System.out.println("Ligdeki takimlar: ");
        superLig.printTeams();
    }
    
}
