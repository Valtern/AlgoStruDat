public class classes {
   stats classStat;

   classes (stats classStat) {
       this.classStat = classStat;
   }

    public classes Warrior() {
        int hp = 150;
        int mana = 30;
        int att = 10;
        int def = 5;
        int spd = 15;
        int dex = 10;
        double cdmg = 10;
        double crrate = 1.1;
        double dmgred = 0.95;

        stats warrStat = new stats(hp, att, def, spd, mana, dex, cdmg, crrate, dmgred);
        return new classes(warrStat);
    }
}
