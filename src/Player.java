/**
 * Created by Manuel on 18.10.2016.
 */
public class Player {

    private String name;
    private int level;

    public Player(String name){
        this.name = name;
        level = 1;
    }

    public String getName(){
        return name;
    }

    public int getLevel(){
        return level;
    }

    public void setLevel(int newLevel){
        this.level = newLevel;
    }
}
