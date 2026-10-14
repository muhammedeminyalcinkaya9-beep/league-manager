
import java.util.ArrayList;

public class League {

    private String name;
    private ArrayList<Team> teams;

    public League(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
    }

   public void addTeam(Team team) {

    for (Team existingTeam : teams) {

        if (existingTeam.getName().equalsIgnoreCase(team.getName())) {
            return;
        }

    }

    teams.add(team);
}
   
   
    public int getTeamCount() {
    return teams.size();
}
    public void printTeams() {

    for(Team team : teams){
        System.out.println(team.getName());
    }

}
    
    
    
    
    
    
    
    
}
