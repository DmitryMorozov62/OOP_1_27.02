public class Hogwarts extends Person {
    private int powerOfMagic;
    private int blink;

    public Hogwarts(String firstName, String lastName, int powerOfMagic, int blink) {
        super(firstName, lastName);
        this.powerOfMagic = powerOfMagic;
        this.blink = blink;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getBlink() {
        return blink;
    }

    public void setBlink(int blink) {
        this.blink = blink;
    }
}






















