public abstract class Hogwarts {
    private String name;
    private int magic;
    private int transgress;

    public Hogwarts(String name, int magic, int transgress) {
        this.name = name;
        this.magic = magic;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }
    public int getMagic() {
        return magic;
    }
    public int getTransgress() {
        return transgress;
    }
    public void compareHogwarts(Hogwarts hg){
        int curr = this.magic+this.transgress;
        int com = hg.getMagic()+hg.getTransgress();
        if(curr > com){
            System.out.println(this.name+" обладает бОльшей мощность магии, чем "+hg.getName());
        }else if(com > curr){
            System.out.println(hg.name+" обладает бОльшей мощность магии, чем "+this.getName());
        }else{
            System.out.println("Ученики обладают одинковой мощьностью магии");
        }
    }
}
