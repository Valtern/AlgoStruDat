public class enemies {
    String name;
    stats statEnemies;

    enemies (String name, stats statEnemies) {
        this.name = name;
        this.statEnemies = statEnemies;
    }

    public enemies slime() {
        String names = "Slimes";
        statEnemies = new stats(20, 2, 5, 3, 5, 0);
        return new enemies(names, statEnemies);
    }

    public enemies goblin() {
        String names = "Goblin";
        statEnemies = new stats(35, 5, 10, 5, 5, 0);
        return new enemies(names, statEnemies);
    }

    public enemies skeleton() {
        String names = "Skeleton";
        statEnemies = new stats(50, 0, 8, 10, 10, 1.2);
        return new enemies(names, statEnemies);
    }

    public enemies bandits() {
        String names = "Bandits";
        statEnemies = new stats(100, 15, 20, 20, 15, 0.9);
        return new enemies(names, statEnemies);
    }
}
