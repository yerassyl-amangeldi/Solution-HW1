public class LevelManager {
    private int level;

    public LevelManager() {
        this.level = 1;
    }

    public void advanceLevel() {
        level++;
        System.out.println("Level up: " + level);
    }

    public int getLevel() {
        return level;
    }
}
