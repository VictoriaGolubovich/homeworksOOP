package homeworks.homework2.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Creator> playerList = new ArrayList<>(Arrays.asList(
                new Human("Алексей", 1.30, 3.40),
                new Human("Евгений", 1.50, 3.80),
                new Cat("Барсик", 2.15, 9.10),
                new Cat("Сима", 2.50, 8.40),
                new Robot("Robo", 0.5, 3.50)
        ));

        List<Barrier> barrierList = new ArrayList<>(Arrays.asList(
                new Wall("Стена1", 0.5),
                new Wall("Стена2", 1.0),
                new Wall("Стена3", 1.5),
                new Pathway("Дорожка1", 1.5),
                new Pathway("Дорожка2", 2.5),
                new Pathway("Дорожка3", 3.5)
        ));


        for(Creator creator: playerList){
            System.out.println(creator.getName() + ":");
            creator.run();
            for (Barrier barrier: barrierList){
                if( barrier instanceof Wall){
                    creator.jump(((Wall) barrier).getDistance());
                } else if (barrier instanceof Pathway){
                    creator.runTest(((Pathway) barrier).getDistance());
                }
            }
            creator.endRace();
            System.out.println();
        }
    }
}