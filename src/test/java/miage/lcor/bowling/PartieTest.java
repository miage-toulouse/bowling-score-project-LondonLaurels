package miage.lcor.bowling;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PartieTest {

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCalculeScoreSansStrikeSansSpare(){
        //given : une partie avec 10 jeux identiques faisant tomber 5 quilles sur les 2 lancers
        Jeu leJeu = new Jeu(5,0);
        Partie laPartie= new Partie(leJeu);

        //when : On calcule le score
        int score = laPartie.calculeScore();

        //then : ON s'attend à ce que le score soit de 50
        assertEquals(50, score);
    }

    @Test
    public void testCalculeScoreAvecSpare(){
        //given : une partie avec 10 jeux identiques faisant tomber toutes les quilles sur tous les lancers: spare
        Jeu leJeu = new Jeu(5,5);
        Partie laPartie= new Partie(leJeu);

        //when : On calcule le score
        int score = laPartie.calculeScore();

        //then : On s'attend à ce que le score soit de 150
        assertEquals(150, score);
    }

    @Test
    public void testCalculeScoreAvecStrike(){
        //given : une partie avec 10 strikes
        Jeu leJeu = new Jeu(10);
        Partie laPartie= new Partie(leJeu);

        //when : On calcule le score
        int score = laPartie.calculeScore();

        //then : On s'attend à ce que le score soit de 300
        assertEquals(300, score);
    }

}