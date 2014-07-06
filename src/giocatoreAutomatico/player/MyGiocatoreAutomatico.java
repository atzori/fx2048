package giocatoreAutomatico.player;

import giocatoreAutomatico.GiocatoreAutomatico;
import giocatoreAutomatico.Griglia;
import java.util.Random;

/**
 *
 * @author Andrea
 */
public class MyGiocatoreAutomatico implements GiocatoreAutomatico {
        @Override
        public int prossimaMossa(Griglia g){
            Random numeroCasuale= new Random();
            numeroCasuale.setSeed(4);

            return numeroCasuale.nextInt();
        }
}
