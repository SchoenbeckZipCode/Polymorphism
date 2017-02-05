package pajerowski.tony;

/**
 * Created by anthonypajerowski on 2/1/17.
 */
public class Goldfish extends Pet {

    private String name;

    public String getName() {
        return name;
    }

    Goldfish(){}

    Goldfish(String name) {
        this.name = name;
    }

    public String speak() {
        return "glub glub glub!";
    }

}
