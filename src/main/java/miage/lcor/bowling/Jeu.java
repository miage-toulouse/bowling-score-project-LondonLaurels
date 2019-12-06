package miage.lcor.bowling;

public class Jeu {
    private Integer lancer1;
    private Integer lancer2;

    public Jeu(Integer lancer1, Integer lancer2) {
        this.lancer1 = lancer1;
        this.lancer2 = lancer2;
    }
    public Jeu(Integer lancer1){
        this.lancer1 = lancer1;
        this.lancer2 = 0;
    }

    public Integer getLancer1(){
        return this.lancer1;
    }

    public Integer getLancer2(){
        return this.lancer2;
    }

    public int nbQuillesTombees(){
        return this.lancer1 + this.lancer2;
    }

    public boolean isSpare(){
            return (this.lancer1 + this.lancer2) == 10;
    }

    public boolean isStrike(){
        return this.lancer1 == 10;
    }
}
