package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Zoo de Tunis", "Tunis", 5); // Exemple avec 5 cages

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 4, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, false);

        System.out.println(zoo.ajoutAnimal(lion));
        System.out.println(zoo.ajoutAnimal(tiger));
        System.out.println(zoo.ajoutAnimal(lion));
        System.out.println(zoo.ajoutAnimal(elephant));

        zoo.afficherAnimals();

        System.out.println(zoo.rechercheAnimal(lion)); // 0
        System.out.println(zoo.rechercheAnimal(new Animal("Canidae", "Wolf", 3, true))); // -1
    }
}
