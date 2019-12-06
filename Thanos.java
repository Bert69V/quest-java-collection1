import java.util.*;

public class Thanos {

    public static void main(String[] args) {


        //TODO 1 : Create an empty heroes list
        ArrayList<Hero>fighter = new ArrayList<>();

        Hero blackWidow = new Hero ("Black Widow", 34);
        Hero captainAmerica = new Hero ("Capatain America", 100);
        Hero vision = new Hero ("Vision", 3);
        Hero ironMan = new Hero ("Iron Man", 48);
        Hero scarletWitch = new Hero ("Scarlet Witch", 29);
        Hero thor = new Hero ("Thor", 1500);
        Hero hulk = new Hero ("Hulk", 49);
        Hero doctorStrange = new Hero ("Doctor Strange", 42);



        // TODO 2 : Add those heroes to the list
        fighter.add (blackWidow);
        fighter.add (captainAmerica);
        fighter.add (vision);
        fighter.add (ironMan);
        fighter.add (scarletWitch);
        fighter.add (thor);
        fighter.add (hulk);
        fighter.add (doctorStrange);

        // TODO 3 : It's Thor birthday, now he's 1501
        thor.setAge (1501);
        // System.out.println(fighter.size());
        Hero check = fighter.get(5);
        //System.out.println(check.getAge());

        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(fighter);

        //TODO 5 : Keep only the half of the list
        for (int k = 0; k < fighter.size()/2+2; k++){
          //System.out.println("-" + fighter.get(k).getName());
          fighter.remove(k);
        }

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
          for (int i = 0; i < fighter.size(); i++) {
            System.out.println(fighter.get(i).getName());
        }
    }
}
