package SeminarsOOP;

import SeminarsOOP.units.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int teamCount = 10;
        Random rand = new Random();
        String heroName;

        ArrayList<BaseHero> heroesOne = new ArrayList<>();
        ArrayList<BaseHero> heroesTwo = new ArrayList<>();

        for (int i = 0; i < teamCount; i++) {
            heroName = String.valueOf(Name.values()[rand.nextInt(Name.values().length)]);

            switch (rand.nextInt(4)) {
                case 0: heroesOne.add(new Peasant(heroName)); break;
                case 1: heroesOne.add(new Outlaw(heroName)); break;
                case 2: heroesOne.add(new Sniper(heroName)); break;
                case 3: heroesOne.add(new Magician(heroName)); break;
            }
            switch (rand.nextInt(4)) {
                case 0: heroesTwo.add(new Peasant(heroName)); break;
                case 1: heroesTwo.add(new Spearman(heroName)); break;
                case 2: heroesTwo.add(new Crossbowman(heroName)); break;
                case 3: heroesTwo.add(new Monk(heroName)); break;
            }
        }

        movePeasantToEnd(heroesOne);
        movePeasantToEnd(heroesTwo);

        heroesOne.forEach(n -> System.out.print(n.getInfo() + ", "));
        System.out.println();
        heroesTwo.forEach(n -> System.out.print(n.getInfo() + ", "));
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter to continue ... or To exit any key + Enter ");
        while (true) {
            String button = scanner.nextLine();
            if (button.length() > 0) {
                break;
            }
            heroesOne.forEach(n -> n.step(heroesOne));
        }


    }
    public static void movePeasantToEnd(ArrayList<BaseHero>  heroesList){
        List<Integer> tempIndex = new ArrayList<>();
        for (int i = 0; i < heroesList.size(); i++) {

            if (heroesList.get(i).getRole() == "Peasant") {
                tempIndex.add(i);
            }
        }

        for (int i = 0; i < tempIndex.size(); i++) {
            heroesList.add(heroesList.get(tempIndex.get(i)));
        }

        for (int i = tempIndex.size() - 1; i >= 0; i--) {
            int j = tempIndex.get(i);
            heroesList.remove(j);
        }
    }
}