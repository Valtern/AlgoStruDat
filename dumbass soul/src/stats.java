public class stats {
    int hp, def, att, spd, mana, dex;
    double eva, dmgred, crrate, cdmg;

    stats () {

    }
    stats (int hp, int def, int att, int spd, double eva, double dmgred) {
        this.hp = hp;
        this.def = def;
        this.att = att;
        this.spd = spd;
        this.eva = eva;
    }

    stats (int hp, int att, int def, int spd, int mana, int dex, double cdmg, double crrate, double dmgred) {
        this.hp = hp;
        this.mana = mana;
        this.att = att;
        this.def = def;
        this.spd = spd;
        this.dex = dex;
        this.cdmg = cdmg;
        this.crrate = crrate;
        this.dmgred = dmgred;

    }
}
