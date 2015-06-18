import java.util.ArrayList;
import java.util.Random;


public class TeamMaker {
	
    public static void main(String[] arguments)
    {
        Settings settings = new Settings();
        ArrayList<String> playersList = new ArrayList<String>();
        
        playersList.add("Boris Gichev");
        playersList.add("Denis Zaimov");
        playersList.add("Dimitar Kiryakov");
        //playersList.add("Dimitar Stoyanov");
        playersList.add("Emanuil Georgiev");
        playersList.add("Galina Petrova");
        //playersList.add("Ivo Karaneshev");
        playersList.add("Nikolay Dobrev");
        //playersList.add("Pavel Todorov");
        playersList.add("Radoslav Gruychev");
        playersList.add("Stanimir Tryufenov");
        playersList.add("Tihomir Tishev");
        
        settings.setPlayersList(playersList);
        settings.setNumberOfTeams(3);
        
        Random rand  = new Random();
        ArrayList<ArrayList<String>> teams = new ArrayList<ArrayList<String>>();
        int originalPlayersCount = settings.getPlayersList().size();

        for (int i = 0; i < settings.getNumberOfTeams() - 1; i++)
        {
            teams.add(new ArrayList<String>());
        }

        Information info = calculatePlayersPerTeam(originalPlayersCount, settings.getNumberOfTeams());

        while (settings.getPlayersList().size() != info.getResidue())
        {
        	int playerIdx = rand.nextInt(settings.getPlayersList().size());
            int teamIdx = rand.nextInt(teams.size());

            if (teams.get(teamIdx).size() == info.getPlayersPerTeam())
            {
                continue;
            }

            teams.get(teamIdx).add(settings.getPlayersList().get(playerIdx));
            settings.getPlayersList().remove(playerIdx);
        }

        teams.add(settings.getPlayersList());
        printTeams(teams);
    }
	
    private static Information calculatePlayersPerTeam(int originalPlayersCount, int numberOfTeams)
    {
    	int residue = 0;
    	Information info = new Information();
        int playersPerTeam = originalPlayersCount/numberOfTeams;

        while ((originalPlayersCount - ((numberOfTeams - 1) * playersPerTeam) - playersPerTeam) > 1)
        {
            playersPerTeam++;
        }

        residue = originalPlayersCount - (numberOfTeams - 1) * playersPerTeam;

        while (playersPerTeam - residue > 1)
        {
            residue++;
        }
        info.setResidue(residue);
        info.setPlayersPerTeam(playersPerTeam);
        return info;
    }
	
    public static void printTeams(ArrayList<ArrayList<String>> teams)
    {
        for (int i = 0; i < teams.size(); i++)
        {
            System.out.println("Team: "+(i + 1));
            for (int j = 0; j < teams.get(i).size(); j++)
            {
            	System.out.println("\t" + teams.get(i).get(j));
            }
        }
    }
}