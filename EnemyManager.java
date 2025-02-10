import java.util.List;
public class EnemyManager {
    private List<String> enemies;


    public EnemyManager() {
        this.enemies = enemies;
    }

    public boolean hasEnemies() {
        return !enemies.isEmpty();
    }

    public String getNextEnemy() {
        if (hasEnemies()) {
            return enemies.remove(0);
        }
        return null;
    }
    public void spawnEnemies(int level) {
        if (level == 1) {
            enemies.add("Skeleton");
            enemies.add("Zombie");
        } else if (level == 2) {
            enemies.add("Vampire");
        } else if (level == 3) {
            enemies.add("Vampire");
            enemies.add("Zombie");
        }

    }


}
