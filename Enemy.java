public class Enemy {
    private String name;
    private int health;
    private int damage;
    private int experienceReward;

    public Enemy(String name, int health, int damage, int experienceReward) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.experienceReward = experienceReward;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getExperienceReward() {
        return experienceReward;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) this.health = 0;
    }

    public boolean isDefeated() {
        return health <= 0;
    }
}
