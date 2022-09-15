import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Griffindor potter = generateGriffindor("Potter");
        Griffindor hermiona = generateGriffindor("Hermiona");
        Griffindor ron = generateGriffindor("Ron");
        Slizerin draco = generateSlizerin("Draco");
        Slizerin grehem = generateSlizerin("Grehem");
        Slizerin goil = generateSlizerin("Goil");
        Puffendy smith = generatePuffendy("Smith");
        Puffendy sedric = generatePuffendy("Sedric");
        Puffendy jastin = generatePuffendy("Jastin");
        Cogtevrun chjoy = generateCogtevrun("Chjoy");
        Cogtevrun padma = generateCogtevrun("Padma");
        Cogtevrun markus = generateCogtevrun("Markus");

        potter.printStudent();
        draco.printStudent();
        smith.printStudent();
        chjoy.printStudent();

        potter.comapre(hermiona);
        draco.comapre(grehem);
        smith.comapre(sedric);
        chjoy.comapre(padma);

        potter.compareHogwarts(draco);
    }
    public static Griffindor generateGriffindor(String name){
        return new Griffindor(name,
                new Random().nextInt(100),
                new Random().nextInt(100),
                new Random().nextInt(100),
                new Random().nextInt(100),
                new Random().nextInt(100));
    }
    public static Cogtevrun generateCogtevrun(String name){
        return new Cogtevrun(name,
                new Random().nextInt(100),
                new Random().nextInt(100),
                new Random().nextInt(100),
                new Random().nextInt(100),
                new Random().nextInt(100),
                new Random().nextInt(100));
    }
    public static Puffendy generatePuffendy(String name){
        return new Puffendy(name,
                new Random().nextInt(100),
                new Random().nextInt(100),
                new Random().nextInt(100),
                new Random().nextInt(100),
                new Random().nextInt(100)
                );
    }
    public static Slizerin generateSlizerin(String name){
        return new Slizerin(name,
                new Random().nextInt(100),
                new Random().nextInt(100),
                new Random().nextInt(100),
                new Random().nextInt(100),
                new Random().nextInt(100),
                new Random().nextInt(100),
                new Random().nextInt(100)
        );
    }
}