public class Ravenclaw extends Hogwarts{
    private int intellect;
    private int wisdom;
    private int ingenious;
    private int creation;

    public Ravenclaw(String firstName, String lastName, int powerOfMagic, int blink, int intellect, int wisdom, int ingenious, int creation) {
        super(firstName, lastName, powerOfMagic, blink);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.ingenious = ingenious;
        this.creation = creation;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getIngenious() {
        return ingenious;
    }

    public void setIngenious(int ingenious) {
        this.ingenious = ingenious;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }
}
