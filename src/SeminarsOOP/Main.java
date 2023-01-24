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

        moveHeroInList(heroesOne, "Magician", "toStart");
        moveHeroInList(heroesTwo, "Monk", "toStart");

        moveHeroInList(heroesOne, "Peasant", "toEnd");
        moveHeroInList(heroesTwo, "Peasant", "toEnd");


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
            System.out.println("****** Team One ******");
            heroesOne.forEach(n -> n.step(heroesOne));
            System.out.println();
            System.out.println("***** Team Two *******");
            heroesTwo.forEach(n -> n.step(heroesTwo));
        }
    }
    public static void moveHeroInList(ArrayList<BaseHero>  heroesList, String hero, String place){
        List<Integer> tempIndex = new ArrayList<>();
        for (int i = 0; i < heroesList.size(); i++) {

            if (heroesList.get(i).getRole() == hero) {
                tempIndex.add(i);
            }
        }
        if (place == "toEnd") {
            for (int i = 0; i < tempIndex.size(); i++) {
                heroesList.add(heroesList.get(tempIndex.get(i)));
            }

            for (int i = tempIndex.size() - 1; i >= 0; i--) {
                int j = tempIndex.get(i);
                heroesList.remove(j);
            }
        }
        if (place == "toStart") {
            for (int i = 0; i < tempIndex.size(); i++) {
                heroesList.add(heroesList.get(tempIndex.get(i)));
            }

            for (int i = tempIndex.size() - 1; i >= 0; i--) {
                int j = tempIndex.get(i);
                heroesList.remove(j);
            }
            Collections.reverse(heroesList);
        }
    }
}