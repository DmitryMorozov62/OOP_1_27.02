public class Hufflepuff extends Hogwarts{
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int powerOfMagic, int blink, int industriousness, int loyalty, int honesty) {
        super(name, powerOfMagic, blink);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getTotalPointsHufflepuff(){
        return getPowerOfMagic() + getBlink() + getIndustriousness() + getLoyalty() + getHonesty();
    }
    public static void getBestStudent(Hufflepuff first, Hufflepuff second ){
        if (first.getTotalPointsHufflepuff() > second.getTotalPointsHufflepuff()){
            System.out.println(first.getName() +" " + first.getTotalPointsHufflepuff() + " лучший Пуфендуиц, чем " +
                    second.getName() + " " + second.getTotalPointsHufflepuff());
        } else{
            System.out.println(second.getName() + " " + second.getTotalPointsHufflepuff() +" лучший Пуфендуиц, чем " +
                    first.getName() + " " + first.getTotalPointsHufflepuff());
        }
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
