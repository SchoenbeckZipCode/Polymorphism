package pajerowski.tony;

/**
 * Created by anthonypajerowski on 2/1/17.
 */

public abstract class Pet implements Comparable<Pet>{
    String name;
    String type;

    public String getName() {
        return name;
    }

    public abstract String speak();


    public int compareTo(Pet otherPet){
        return compareNameThenType(otherPet);
    }


    public int compareTo(Pet otherPet, int compareType){
        if (compareType==0) {
            return compareNameThenType(otherPet);
        } else
            return compareTypeThenName(otherPet);

    }

    public int compareTypeThenName(Pet otherPet){
        if(compareKind(otherPet) == 0)
            return compareName(otherPet);
        else
            return compareKind(otherPet);
    }

    public int compareNameThenType(Pet otherPet){
        if(compareName(otherPet) == 0)
            return compareKind(otherPet);
        else
            return compareName(otherPet);
    }

    private int compareName(Pet otherPet){
        return this.name.compareTo(otherPet.getName());
    }

    private int compareKind(Pet otherPet){
        return this.getClass().getSimpleName().compareTo(otherPet.getClass().getSimpleName());
    }
}