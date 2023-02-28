public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int powerOfMagic, int blink, int nobility, int honor, int bravery) {
        super(name, powerOfMagic, blink);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getTotalPointsGryffindor(){
        return getPowerOfMagic() + getBlink() + getNobility() + getHonor() + getBravery();
    }

    public static void getBestStudent(Gryffindor first, Gryffindor second ){
        if (first.getTotalPointsGryffindor() > second.getTotalPointsGryffindor()){
            System.out.println(first.getName() +" " + first.getTotalPointsGryffindor() + " лучший Гриффиндорец, чем " +
                    second.getName() + " " + second.getTotalPointsGryffindor());
        } else{
            System.out.println(second.getName() + " " + second.getTotalPointsGryffindor() +" лучший Гриффиндорец, чем " +
                    first.getName() + " " + first.getTotalPointsGryffindor());
        }
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
