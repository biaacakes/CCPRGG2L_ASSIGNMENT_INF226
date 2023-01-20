public class App {
    public static void main(String[] args) {

        Weapon sword = new Weapon();

        sword.name= "Jini Sza";
        sword.damage= 5;
        sword.rarity= "Legendary";
        sword.saymyName();
        sword.damage();
        sword.addDamage(108);
        sword.attack();
        String showNameandRarity = sword.showNameandRarity();
        System.out.println(showNameandRarity);

        Weapon magic= new Weapon();
        magic.name= "Kill Bill";
        magic.damage= 10;
        magic.rarity= "Mythic";
        

        Weapon dory= new Weapon();
        dory.name= "Athena";
        dory.damage= 8;
        dory.rarity= "Legandary";
       

    }
}
