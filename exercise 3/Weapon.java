public class Weapon {
    String name;
    int damage;
    String rarity;
    
    void addDamage(int additionalDamage){
        int newDamage = this.damage + additionalDamage;

        System.out.println("Damage increased from " + damage + " to " + newDamage);

        this.damage = newDamage;
    }

     String WeaponName() {
     return this.name + " " + this.rarity;
    }

}
