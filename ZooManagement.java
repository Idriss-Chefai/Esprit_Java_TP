public class ZooManagement {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Zoo de Tunis", "Tunis", 5); // Exemple avec 5 cages

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 4, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, false);

        System.out.println(zoo.AjoutAnimal(lion));
        System.out.println(zoo.AjoutAnimal(tiger));
        System.out.println(zoo.AjoutAnimal(lion));
        System.out.println(zoo.AjoutAnimal(elephant));

        zoo.AfficherAnimals();

        System.out.println(zoo.RechercheAnimal(lion)); // 0
        System.out.println(zoo.RechercheAnimal(new Animal("Canidae", "Wolf", 3, true))); // -1
    }
}
