package generics;

import java.util.ArrayList;
import java.util.Random;

public class Team <T extends Partismant>{
    private String name;
    private ArrayList<T> list = new ArrayList();

    public Team(String name) {
        this.name = name;
    }
    public void addPartsm (T partismant){
        list.add(partismant);
        System.out.println(" v team add " + this.name + "player" + partismant.getName());
    }

    public void playTeam (Team<T> team){
        Random random = new Random();
        if(random.nextBoolean()){
            System.out.println(this.name);
        }else {
            System.out.println(team.name);
        }
    }
}
