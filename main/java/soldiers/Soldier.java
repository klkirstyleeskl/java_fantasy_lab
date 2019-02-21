package soldiers;

public abstract class Soldier {
    String name;
    int health;
    Weapon weapon;
    Armour armour;

    public Soldier(String name, int health, Weapon weapon, Armour armour) {
        this.name = name;
        this.health = health;
        this.armour = armour;
        this.weapon = weapon;
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

    public Weapon getWeapon() {
        return weapon;
    }

    public Armour getArmour() {
        return armour;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }
}
