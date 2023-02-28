public class Slytherin extends Hogwarts{
    private int cunning;
    private int resoluteness;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int powerOfMagic, int blink, int cunning, int resoluteness,
                     int ambition, int resourcefulness, int lustForPower) {
        super(name, powerOfMagic, blink);
        this.cunning = cunning;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getTotalPointsSlytherin() {
        return getPowerOfMagic() + getBlink() + getCunning() + getResoluteness() + getAmbition() + getResourcefulness()
                + getLustForPower();
    }

    public static void getBestStudent(Slytherin first, Slytherin second ){
        if (first.getTotalPointsSlytherin() > second.getTotalPointsSlytherin()){
            System.out.println(first.getName() +" " + first.getTotalPointsSlytherin() + " лучший Слизеринец, чем " +
                    second.getName() + " " + second.getTotalPointsSlytherin());
        } else{
            System.out.println(second.getName() + " " + second.getTotalPointsSlytherin() +" лучший Слизеринец, чем " +
                    first.getName() + " " + first.getTotalPointsSlytherin());
        }
    }


    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public void setResoluteness(int resoluteness) {
        this.resoluteness = resoluteness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
}
