package healers;


public class Cleric{


    String name;
    int healingPower;

    public Cleric(String name, int healingPower) {
        this.name = name;
        this.healingPower = healingPower;
    }

    public String getName() {
        return name;
    }

    public int getHealingPower() {
        return healingPower;
    }

    public void setHealingPower(int healingPower) {
        this.healingPower = healingPower;
    }



}
