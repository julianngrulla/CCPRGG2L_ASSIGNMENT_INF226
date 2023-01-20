public class App {
    public static void main(String[] args) {

       /* Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        mage.name = "Gondar";
        thief.sayMyName(); */

        Character Samurai = new Character();
        Samurai.name = "SamuraiX";
        Samurai.strength = 10;
        Samurai.intelligence = 5;
        Samurai.agility = 7;
        Samurai.sayMyName();
        Samurai.Attack();

        Weapon sword = new Weapon();

        sword.name = "Excalibur";
        sword.damage = 100;
        sword.rarity = "Common";
        sword.addDamage(10);
        sword.addDamage(10);
        System.out.println(sword.WeaponName());

        sword.WeaponName();
      
    }
}
