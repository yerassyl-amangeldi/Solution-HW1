import java.util.List;
public class GameSimulation {
    public static void main(String[] args) {
        Player player = new Player("Hero");
        EnemyManager enemyManager = new EnemyManager();
        ItemManager itemManager = new ItemManager();
        LevelManager levelManager = new LevelManager();
        while (levelManager.getLevel() <= 3 && player.getPlayerHealth() > 0) {
            System.out.println("=== Level " + levelManager.getLevel() + " ===");

            enemyManager.spawnEnemies(levelManager.getLevel());
            while (enemyManager.hasEnemies() && (player.getPlayerHealth() > 0)) {
                String enemy = enemyManager.getNextEnemy();
            }

        }
    }

}