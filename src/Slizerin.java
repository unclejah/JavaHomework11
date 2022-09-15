public class Slizerin extends Hogwarts{
    private int courage;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirst;

    public Slizerin(String name, int magic, int transgress, int courage, int determination, int ambition, int resourcefulness, int thirst) {
        super(name, magic, transgress);
        this.courage = courage;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirst = thirst;
    }
    public void printStudent(){
        System.out.println("Имя - "+this.getName()+ ", Магия - " +this.getMagic()
                + ", Трансгрессия - " +this.getTransgress()+ ", Хитрость - " + this.courage+ ", Решительность - " + this.determination
                + ", Амбициозность - " + this.ambition+ ", Находчивость - " + this.resourcefulness+ ", Жажда власти - " + this.thirst);
    }
    public void comapre(Slizerin slizerin){
        int cur = this.courage+this.determination+this.ambition+this.resourcefulness+this.thirst;
        int com = slizerin.getCourage()+slizerin.getDetermination()+slizerin.getAmbition()+slizerin.getResourcefulness()+slizerin.getThirst();
        this.printStudent();
        slizerin.printStudent();
        if(cur > com){
            System.out.println(this.getName() + " лучший Слизеринец, чем "+ slizerin.getName());
        }else if(com > cur){
            System.out.println(slizerin.getName() + " лучший Слизеринец, чем "+ this.getName());
        }else{
            System.out.println("Ученики одинаковы по силе");
        }
    }

    public int getCourage() {
        return courage;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirst() {
        return thirst;
    }
}
