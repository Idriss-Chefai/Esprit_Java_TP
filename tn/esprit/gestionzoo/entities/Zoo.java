package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCage; // Utilisé comme compteur et capacité

    public Zoo(String name, String city, int nbrCage) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Le nom du zoo ne doit pas être vide.");
        }
        this.animals = new Animal[nbrCage]; // Initialiser le tableau avec la taille de nbrCage
        this.name = name;
        this.city = city;
        this.nbrCage = nbrCage;
    }

    @Override
    public String toString() {
        return name + " est à " + city + " et contient " + nbrCage + " cages";
    }

    public boolean isZooFull() {
        return nbrCage <= 0;
    }

    public boolean ajoutAnimal(Animal animal) {
        if (isZooFull()) {
            return false; // Le zoo est plein
        }
        for (int i = 0; i < animals.length - nbrCage; i++) {
            if (animals[i].equals(animal)) {
                return false; // Animal déjà présent
            }
        }
        animals[animals.length - nbrCage] = animal;
        nbrCage--; // Décrémenter le compteur
        return true;
    }

    public void afficherAnimals() {
        for (int i = 0; i < animals.length - nbrCage; i++) {
            System.out.println(animals[i]);
        }
    }

    public int rechercheAnimal(Animal animal) {
        for (int i = 0; i < animals.length - nbrCage; i++) {
            if (animals[i].equals(animal)) {
                return i;
            }
        }
        return -1; // Animal non trouvé
    }
}
