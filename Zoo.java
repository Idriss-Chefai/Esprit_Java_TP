public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCage; // Utilisé comme compteur et capacité

    public Zoo(String name, String city, int nbrCage) {
        this.animals = new Animal[nbrCage]; // Initialiser le tableau avec la taille de nbrCage
        this.name = name;
        this.city = city;
        this.nbrCage = nbrCage;
    }

    public String toString(){
        return(name + " is in " + city + " et contient " + nbrCage + " de cages");
    }

    public boolean AjoutAnimal(Animal animal) {
        if (nbrCage <= 0) {
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

    public void AfficherAnimals() {
        for (int i = 0; i < animals.length - nbrCage; i++) {
            System.out.println(animals[i]);
        }
    }

    public int RechercheAnimal(Animal animal) {
        for (int i = 0; i < animals.length - nbrCage; i++) {
            if (animals[i].equals(animal)) {
                return i;
            }
        }
        return -1; // Animal non trouvé
    }
}
