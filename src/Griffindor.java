public class Griffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int courage;

    public Griffindor(String name, int magic, int transgress, int nobility, int honor, int courage) {
        super(name, magic, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public void printStudent(){
        System.out.println("Имя - "+this.getName()+ ", Магия - " +this.getMagic()
                + ", Трансгрессия - " +this.getTransgress()+ ", Благородство - " + this.honor+ ", Честь - " + this.courage+ ", Храбрость - " + this.nobility);
    }

    public void comapre(Griffindor griffindor){
        int cur = this.nobility+this.honor+this.courage;
        int com = griffindor.getNobility()+griffindor.getHonor()+griffindor.getCourage();
        this.printStudent();
        griffindor.printStudent();
        if(cur > com){
            System.out.println(this.getName() + " лучший Гриффиндореч, чем "+ griffindor.getName());
        }else if(com > cur){
            System.out.println(griffindor.getName() + " лучший Гриффиндореч, чем "+ this.getName());
        }else{
            System.out.println("Ученики одинаковы по силе");
        }
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }
}
