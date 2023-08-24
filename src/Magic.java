public class Magic extends Hero{
    public Magic(int hp, int damage, String superAbility) {
        super(hp, damage, superAbility);
    }

    @Override
    public String applySuperAbility() {
        return "Magic used super ability " + getSuperAbility();
    }
}
