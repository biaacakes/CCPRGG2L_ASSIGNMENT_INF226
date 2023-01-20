public class Weapon {
    String name;
    int damage;
    String rarity;
    
    public void saymyName(){
        System.out.println("Weapon's name: " + name);
    }

    public void damage(){
        System.out.println("Total damage: " + damage);
    }
    
    public void rarity(){
        System.out.println("Rarity: " + rarity);
    }
    void attack() {
        System.out.println("I am attacking");

    }
    void addDamage(int additionalDamage ) {
        int newDamage= this.damage+additionalDamage;
        System.out.println("Damage has increased from " + this.damage + " to " + newDamage);
        

        this.damage = newDamage;
    }
    String showNameandRarity() {
        String showNameandRarity = "Name: " + name + "Rarity: " + rarity;
        return showNameandRarity;

    }
   
}