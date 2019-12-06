package miage.lcor.bowling;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Partie {

    private List<Jeu> jeux = new ArrayList<>();

    public Partie(Jeu leJeu) {
        for (int i = 0; i < 10; ++i){
            this.jeux.add(leJeu);
        }
        if(jeux.get(9).isSpare()){
            this.jeux.add(leJeu);
        }
        if(jeux.get(9).isStrike()){
            this.jeux.add(leJeu);
            if(jeux.get(10).isStrike()){
                this.jeux.add(leJeu);
            }
        }
    }

    public int calculeScore() {
        int score = 0;
        for (int j = 0 ; j< 10 ; ++j) {
            Jeu jeuCourant = this.jeux.get(j);
            score += jeuCourant.nbQuillesTombees();
            //si strike
            if(jeuCourant.isStrike()){
                score += this.jeux.get(j+1).nbQuillesTombees();
                if (this.jeux.get(j+1).isStrike()){
                    score += this.jeux.get(j+2).nbQuillesTombees();
                }
            //si spare
            }else if (jeuCourant.isSpare()){
                score += this.jeux.get(j+1).getLancer1();
            }
        }
        return score;
    }
}
