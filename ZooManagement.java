import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        /*
        int nbrCages = 20;
        String zooName = "my zoo";
        Scanner scanner = new Scanner(System.in);

        // Saisie zooName
        System.out.println("Donner le nom du zoo");
        zooName = scanner.nextLine();

        // Saisie nbrCages
        System.out.println("Donner le nombre de cages");
        nbrCages = scanner.nextInt();

        System.out.println(zooName + " comporte " + nbrCages + " cages");

        // Fermeture du scanner
        scanner.close();*/
        Animal animal1 = new Animal("Famille1","nom1",10,true);
        Animal[] listeanimal = {animal1};
        Zoo zoo1 = new Zoo(listeanimal,"nomzoo","nomville",30);
        System.out.println(zoo1);
        System.out.println(zoo1.toString());
    }
}
