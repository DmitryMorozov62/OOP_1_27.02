public class Ravenclaw extends Hogwarts{
    private int intellect;
    private int wisdom;
    private int ingenious;
    private int creation;

    public Ravenclaw(String name, int powerOfMagic, int blink, int intellect, int wisdom, int ingenious, int creation) {
        super(name, powerOfMagic, blink);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.ingenious = ingenious;
        this.creation = creation;
    }

    public int getTotalPointsRavenclaw(){
        return getPowerOfMagic() + getBlink() + getIntellect() + getWisdom() + getIngenious() + getCreation();
    }

    public static void getBestStudent(Ravenclaw first, Ravenclaw second ){
        if (first.getTotalPointsRavenclaw() > second.getTotalPointsRavenclaw()){
            System.out.println(first.getName() +" " + first.getTotalPointsRavenclaw() + " лучший Когтевранец, чем " +
                    second.getName() + " " + second.getTotalPointsRavenclaw());
        } else{
            System.out.println(second.getName() + " " + second.getTotalPointsRavenclaw() +" лучший Когтевранец, чем " +
                    first.getName() + " " + first.getTotalPointsRavenclaw());
        }
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
