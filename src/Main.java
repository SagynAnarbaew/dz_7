public class Main {
    public static void main(String[] args){

        HavingSuperAbility[]  Allheros = {new Magic(),new Medic(),new Warrior()};
        for (int i = 0; i < Allheros.length; i++) {
            Allheros[i].applySuperAbility();


        }

        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();
        magic.setHealth(100);
        medic.setHealth(123);
        warrior.setHealth(150);
        Hero[] allHeros1 = { magic,medic,warrior};
        for (int i = 0; i < allHeros1.length; i++) {
            System.out.println(medic.increseExperinance() + " "+i);

        }

    }


}