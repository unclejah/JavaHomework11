public class Puffendy extends Hogwarts{
    private int hardworking;
    private int loyal;
    private int honest;

    public Puffendy(String name, int magic, int transgress, int hardworking, int loyal, int honest) {
        super(name, magic, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }
    public void printStudent(){
        System.out.println("Имя - "+this.getName()+ ", Магия - " +this.getMagic()
                + ", Трансгрессия - " +this.getTransgress()+ ", Трудолюбие - " + this.hardworking+ ", Верность - " + this.loyal
                + ", Честность - " + this.honest);
    }
    public void comapre(Puffendy puffendy){
        int cur = this.hardworking+this.loyal+this.honest;
        int com = puffendy.getHardworking()+puffendy.getLoyal()+puffendy.getHonest();
        this.printStudent();
        puffendy.printStudent();
        if(cur > com){
            System.out.println(this.getName() + " лучший Пуффиндуец, чем "+ puffendy.getName());
        }else if(com > cur){
            System.out.println(puffendy.getName() + " лучший Пуффиндуец, чем "+ this.getName());
        }else{
            System.out.println("Ученики одинаковы по силе");
        }
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }
}
