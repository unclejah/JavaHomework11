public class Cogtevrun extends Hogwarts{
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Cogtevrun(String name, int magic, int transgress, int smart, int wise, int witty, int creativity) {
        super(name, magic, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }
    public void printStudent(){
        System.out.println("Имя - "+this.getName()+ ", Магия - " +this.getMagic()
                + ", Трансгрессия - " +this.getTransgress()+ ", Ум - " + this.smart+ ", Мудрость - " + this.wise
                + ", Остроумие - " + this.witty+ ", Творчество - " + this.creativity);
    }
    public void comapre(Cogtevrun cogtevrun){
        int cur = this.smart+this.wise+this.witty+this.creativity;
        int com = cogtevrun.getSmart()+cogtevrun.getWise()+cogtevrun.getWitty()+cogtevrun.getCreativity();
        this.printStudent();
        cogtevrun.printStudent();
        if(cur > com){
            System.out.println(this.getName() + " лучший Когтевранец, чем "+ cogtevrun.getName());
        }else if(com > cur){
            System.out.println(cogtevrun.getName() + " лучший Когтевранец, чем "+ this.getName());
        }else{
            System.out.println("Ученики одинаковы по силе");
        }
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }
}
