public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
        new Gryffindor("Harry Potter", 90, 70, 80, 80, 60),
        new Gryffindor("Hermione Granger",  86, 80, 50, 50, 71),
        new Gryffindor("Ronald Weasley", 60, 50, 58, 53, 51)
        };

        Slytherin[] slytherins ={
        new Slytherin("Draco Malfoy", 73, 61, 78, 90, 73,
                61, 90),
        new Slytherin("Graham Montague", 60, 55, 41, 72, 73,
                73, 66),
        new Slytherin("Gregory Goyle", 80, 60, 77, 82, 65,
                81, 78)
        };

        Hufflepuff[] hufflepuffs = {
        new Hufflepuff("Zacharias Smith",  77, 65, 56, 90, 57),
        new Hufflepuff("Cedric Diggory",  92, 87, 80, 91, 99),
        new Hufflepuff("Justin Finch-Fletchley", 83, 65, 80, 90, 93)
        };

        Ravenclaw[] ravenclaws = {
        new Ravenclaw("Cho Chang",  54, 47, 67, 78, 87, 78),
        new Ravenclaw("Padma Patil",  67, 54, 90, 93, 79, 92),
        new Ravenclaw("Marcus Belby",  47, 51, 71, 73, 80, 76)
        };

        PrintService printService = new PrintService();
        printService.print(gryffindors);
        printService.print(hufflepuffs);
        printService.print(ravenclaws);
        printService.print(slytherins);
        System.out.println("Лучшие студенты факультетов");
        Gryffindor.getBestStudent(gryffindors[0],gryffindors[1]);
        Hufflepuff.getBestStudent(hufflepuffs[0],hufflepuffs[2]);
        Ravenclaw.getBestStudent(ravenclaws[1],ravenclaws[2]);
        Slytherin.getBestStudent(slytherins[0],slytherins[2]);


        Hogwarts[] students = {
                new Hogwarts("Harry Potter",90,70),
                new Hogwarts("Hermione Granger",  86, 80),
                new Hogwarts("Ronald Weasley",  60, 50),

                new Hogwarts("Draco Malfoy",  73, 61),
                new Hogwarts("Graham Montague",  60, 55),
                new Hogwarts("Gregory Goyle",  80, 60),

                new Hogwarts("Zacharias Smith",  77, 65),
                new Hogwarts("Cedric Diggory",  92, 87),
                new Hogwarts("Justin Finch-Fletchley",  83, 65),

                new Hogwarts("Cho Chang",  54, 80),
                new Hogwarts("Padma Patil",  67, 54),
                new Hogwarts("Marcus Belby", 47, 51)
        };
        System.out.println("Лучший студент \"Хогвартса\"");
        Hogwarts.getBestStudent(students[1],students[10]);

    }
}