import java.util.ArrayList;
import java.util.List;

public  class Player {
    private String playerName;
    private int playerHealth;
    private int playerExperience;
    private List<String> inventory;

    public Player(String playerName) {
        this.playerName = playerName;
        this.playerHealth = 100;
        this.playerExperience = 0;
        this.inventory = new ArrayList<>();
    }

    public void takeDamage(int damage) {
        this.playerHealth -= damage;
        System.out.println("You've taken " + damage);
    }

    public void gainExperience(int expirience) {
        this.playerExperience += expirience;
    }

    public void pickItem(String item) {
        inventory.add(item);
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerHealth() {
        return playerHealth;
    }

    public int getPlayerExperience() {
        return playerExperience;
    }


}
