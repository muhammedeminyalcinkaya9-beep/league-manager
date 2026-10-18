
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

        Match derby = new Match(team1, team3);

        derby.playMatch(3, 1);
        derby.playMatch(3, 1);
        
        Match invalidMatch = new Match(team1, team3);
invalidMatch.playMatch(-2, 1);
Match drawMatch = new Match(team1, team3);
drawMatch.playMatch(2, 2);
Match awayWinMatch = new Match(team1, team3);
awayWinMatch.playMatch(1, 2);

        System.out.println(team1);
        System.out.println(team3);
    }

}
