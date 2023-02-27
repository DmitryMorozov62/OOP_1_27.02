public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String firstName, String lastName, int powerOfMagic, int blink, int nobility, int honor, int bravery) {
        super(firstName, lastName, powerOfMagic, blink);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }


    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

}
