package pajerowski.tony;

import java.util.Comparator;

/**
 * Created by anthonypajerowski on 2/1/17.
 */
public class PetComparator implements Comparator<Pet>{  // sorting order based on pet name
    public int compare(Pet pet1, Pet pet2){
        return pet1.name.compareTo(pet2.name);
    }
}