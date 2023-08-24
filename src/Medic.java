public class Medic extends Hero{
    private int healPoints = 100;

    public Medic(int hp, int damage, String superAbility) {
        super(hp, damage, superAbility);
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    public void increaseExperience() {
       healPoints = healPoints / 100 * 10 + healPoints;
    }
    @Override
    public String applySuperAbility() {
        return "Medic used super ability " + getSuperAbility();
    }
}
