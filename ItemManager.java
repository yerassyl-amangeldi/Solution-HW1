import java.util.List;

public class ItemManager {
    private List<String> items;

    public ItemManager() {
        this.items = items;
    }

    public void spawnItems(int level) {
        if (level == 1) {
            items.add("Gold Coin");
            items.add("Health Elixir");
        } else if (level == 2) {
            items.add("Magic Scroll");
        } else if (level == 3) {
            items.add("Health Elixir");
            items.add("Gold Coin");
        }

    }

    public void hasItems() {
        if (items.isEmpty()) {
            System.out.println("There is items");
        }
    }
}