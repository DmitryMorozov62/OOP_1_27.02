public class PrintService {

    public void print(Gryffindor[] gryffindors) {
        System.out.println(" \"Gryffindor\" students");
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println(gryffindor.getName() +" "+" хар-ки:" + " Сила магии " + gryffindor.getPowerOfMagic()
                    + ", расстояние трансгресии " + gryffindor.getBlink() + ", благородство "+
                    gryffindor.getNobility() +", честь "+ gryffindor.getHonor() +", храбрость "+ gryffindor.getBravery());
        }
    }

    public void print(Hufflepuff[] hufflepuffs) {
        System.out.println(" \"Hufflepuff\" students");
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println(hufflepuff.getName() +" "+" хар-ки:" + " Сила магии " + hufflepuff.getPowerOfMagic()
                    + ", расстояние трансгресии " + hufflepuff.getBlink() + ", трудолюбие " +
                    hufflepuff.getIndustriousness() + ", верность" + hufflepuff.getLoyalty() + ", честность " +
                    hufflepuff.getHonesty());
        }
    }

    public void print(Ravenclaw[] ravenclaws) {
        System.out.println(" \"Ravenclaw\" students");
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println(ravenclaw.getName() +" "+" хар-ки:" + " Сила магии " + ravenclaw.getPowerOfMagic()
                    + ", расстояние трансгресии " + ravenclaw.getBlink() + ", ум " + ravenclaw.getIntellect()
            + ", мудрость " + ravenclaw.getWisdom() +", остроумие " +ravenclaw.getIngenious() + ", творчество " + ravenclaw.getCreation());
        }
    }

    public void print(Slytherin[] slytherins) {
        System.out.println(" \"Slytherin\" students");
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println(slytherin.getName() +" "+" хар-ки:" + " Сила магии " + slytherin.getPowerOfMagic()
                    + ", расстояние трансгресии " + slytherin.getBlink() + ", хитрость " + slytherin.getCunning()
            + ", решительность " + slytherin.getResoluteness() + ", амбициозность " + slytherin.getAmbition() + ", находчивость " +
                    slytherin.getResourcefulness() + ", жажда власти " + slytherin.getLustForPower());
        }
    }
}
