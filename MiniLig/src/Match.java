
public class Match {

    private Team homeTeam;
    private Team awayTeam;
    private int homeGoals;
    private int awayGoals;
    private boolean played;

    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public void playMatch(int homeGoals, int awayGoals) {
       
        if (homeGoals < 0 || awayGoals < 0) {
            System.out.println("Hata: Gol sayisi negatif olamaz!");
            return;
        }
         if (played) {
            System.out.println("Hata: Bu mac zaten oynandi!");
            return;
        }

        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;

        if (homeGoals > awayGoals) {
            homeTeam.addWin();
            awayTeam.addLoss();
        } else if (homeGoals < awayGoals) {
            homeTeam.addLoss();
            awayTeam.addWin();
        } else {
            homeTeam.addDraw();
            awayTeam.addDraw();
        }
        played= true;
    }

}
