public class Main {
    public static void main(String[] args) {

        Hero[] heroes = {new Magic(140, 40, "Fire Ball"),
                new Warrior(200, 50, "Critical Damage"),
                new Medic(100, 0, "Heal")};
        for (Hero hero : heroes) {
            System.out.println(hero.applySuperAbility());
            if (hero instanceof Medic) {
                System.out.println("Лечение медика: " + ((Medic) hero).getHealPoints());
                ((Medic) hero).increaseExperience();
                System.out.println("Лечение медика увеличено: " + ((Medic) hero).getHealPoints());
            }
        }
    }
}