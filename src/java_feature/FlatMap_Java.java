package java_feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FlatMap_Java {

	public static void main(String[] args) {
		
		List<String> teamIndia = Arrays.asList("virat","sachin","ms dhoni");
		List<String> teamAustralia = Arrays.asList("Warner", "Watson", "Smith");
		List<String> teamEngland = Arrays.asList("Alex", "Bell", "Broad"); 
		List<String> teamNewZeland = Arrays.asList("Kane", "Nathan", "Vettori");
		List<String> teamSouthAfrica = Arrays.asList("AB", "Amla", "Faf"); 
		List<String> teamWestIndies = Arrays.asList("Sammy", "Gayle", "Narine"); 
		List<String> teamSriLanka = Arrays.asList("Mahela", "Sanga", "Dilshan"); 
		List<String> teamPakistan = Arrays.asList("Misbah", "Afridi", "Shehzad");
		

        List<List<String>> playersInWorldCup2016 = new ArrayList<>();

        playersInWorldCup2016.add(teamIndia);
        playersInWorldCup2016.add(teamAustralia);
        playersInWorldCup2016.add(teamEngland);
        playersInWorldCup2016.add(teamNewZeland);
        playersInWorldCup2016.add(teamSouthAfrica);
        playersInWorldCup2016.add(teamPakistan);
        playersInWorldCup2016.add(teamWestIndies);
        playersInWorldCup2016.add(teamSriLanka);
        
        
        
        List<String> listOfAllPlayers= new ArrayList<String>();
        for(List<String> team :playersInWorldCup2016)
        {
        	for(String name :team)
        	{
        		listOfAllPlayers.add(name);
        	}// end of for
        }//end of outer for

        
        System.out.println(listOfAllPlayers);
        
        
        List<String> flatMapList= playersInWorldCup2016.stream().flatMap(pList->pList.stream()).collect(Collectors.toList());
	
	System.out.println(flatMapList);
	}
	}