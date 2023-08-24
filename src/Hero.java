public abstract class Hero implements HavingSuperAbility{
    private int hp = 1000;
    private int damage = 200;
    private String superAbility;

    public Hero(int hp, int damage, String superAbility) {
        this.hp = hp;
        this.damage = damage;
        this.superAbility = superAbility;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperAbility() {
        return superAbility;
    }
}
