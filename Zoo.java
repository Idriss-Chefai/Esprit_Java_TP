public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCage;

    public Zoo(Animal[] animals, String name, String city, int nbrCage) {
        this.animals = animals;
        this.name = name;
        this.city = city;
        this.nbrCage = nbrCage;
    }

    public String toString(){
        return(name+" is in "+city+" et contient "+nbrCage+" de cages");
    }
}
