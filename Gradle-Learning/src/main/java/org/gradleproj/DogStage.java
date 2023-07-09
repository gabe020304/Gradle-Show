package org.gradleproj;

import java.util.ArrayList;
import java.util.List;

public class DogStage {

    public static String pierto = "Pierto, Breed: Labrador";
    public static String alice = "Alice, Breed: Poodle";
    public static String selena = "Selena, Breed: Pug";

    public static void main() {
        System.out.println("\nWelcome to the show!\n");
        displayDogOne();
        displayDogTwo();
        displayDogThree();
        System.out.println("\n--------------------------------");
    }

    public static void displayDogOne() {
        Dog dog = new Dog(getDogList());
        System.out.println(dog.getName(0));
    }

    public static void displayDogTwo() {
        Dog dog = new Dog(getDogList());
        System.out.println(dog.getName(1));
    }

    public static void displayDogThree() {
        Dog dog = new Dog(getDogList());
        System.out.println(dog.getName(2));
    }

    public static List<String> getDogList() {
        List<String> nameList = new ArrayList<>();
        nameList.add(pierto);
        nameList.add(alice);
        nameList.add(selena);
        return nameList;
    }
}
