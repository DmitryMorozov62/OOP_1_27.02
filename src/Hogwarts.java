public class Hogwarts {
    private String name;
    private int powerOfMagic;
    private int blink;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hogwarts(String name, int powerOfMagic, int blink) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.blink = blink;
    }

    public static void getBestStudent(Hogwarts a, Hogwarts b ){
        int totalFirstStudent = a.getPowerOfMagic()+ a.getBlink();
        int totalSecondStudent = b.getPowerOfMagic()+ b.getBlink();
        if (a.getPowerOfMagic()+ a.getBlink() > b.getPowerOfMagic()+ b.getBlink()){
            System.out.println(a.getName() +" " + totalFirstStudent + " обладает бОльшей мощностью магии, чем " +
                    b.getName() + " " + totalSecondStudent);
        } else{
            System.out.println(b.getName() + " " + totalSecondStudent +" обладает бОльшей мощностью магии, чем " +
                    a.getName() + " " + totalFirstStudent);
        }
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






















