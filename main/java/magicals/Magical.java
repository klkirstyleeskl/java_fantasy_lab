package magicals;

public abstract class Magical {
    String name;
    int health;
    Spell spell;
    Beast beast;




    public Magical(String name, int health, Spell spell, Beast beast) {
        this.name = name;
        this.health = health;
        this.spell = spell;
        this.beast = beast;
    }


    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public Beast getBeast() {
        return beast;
    }

    public void setBeast(Beast beast) {
        this.beast = beast;
    }
}