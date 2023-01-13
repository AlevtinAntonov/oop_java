package Seminar_01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Heroy> peasantArrayList = new ArrayList<>();
        ArrayList<Heroy> magicianArrayList = new ArrayList<>();
        ArrayList<Heroy> outlawArrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            peasantArrayList.add((new Peasant("Peasant" + i)));
            magicianArrayList.add(new Magician("Magician" + i));
            outlawArrayList.add(new Outlaw("Outlaw" + i));
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(peasantArrayList.get(i));
            System.out.println(magicianArrayList.get(i));
            System.out.println(outlawArrayList.get(i));
        }
    }
}
