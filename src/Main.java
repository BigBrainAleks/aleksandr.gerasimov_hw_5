public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(60);
        boss.setDefenseType("Physical");

        System.out.println("Boss Health: " + boss.getHealth());
        System.out.println("Boss Damage: " + boss.getDamage());
        System.out.println("Boss Defense Type: " + boss.getDefenseType());

        Hero[] heroes = createHeroes();
        for (Hero hero : heroes) {
            System.out.println("Hero Health: " + hero.getHealth());
            System.out.println("Hero Damage: " + hero.getDamage());
            System.out.println("Hero Super Power: " + hero.getSuperPower());
        }
    }

    public static Hero[] createHeroes() {
        Hero Mag = new Hero(200, 50, "Fireball");
        Hero Physic = new Hero(300, 40);
        Hero Medik = new Hero(240, 20, "Healing");

        Hero[] heroes = {Mag, Physic, Medik};
        return heroes;
    }
}
