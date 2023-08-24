public class Warrior extends Hero{
    public Warrior(int hp, int damage, String superAbility) {
        super(hp, damage, superAbility);
    }

    @Override
    public String applySuperAbility() {
        return "Warrior used super ability "+ getSuperAbility();
    }
}
