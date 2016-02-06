import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/**
 * 
 */
public class Mazo
{
     //Guarda una lista de todas las cartas
    private ArrayList<Carta> mazo;
     //Guarda una carta
     private Carta carta;
    /**
     * Constructor de la clase Mazo que inicializa un ArrayList mazo y guarda en el las 52 cartas de la baraja
     */
     public Mazo()
    {
         mazo = new ArrayList<Carta>(Arrays.asList(carta = new Carta(1,"Corazones"),carta = new Carta(2,"Corazones"),carta = new Carta(3,"Corazones"),carta = new Carta(4,"Corazones")
                               ,carta = new Carta(5,"Corazones"),carta = new Carta(6,"Corazones"),carta = new Carta(7,"Corazones"),carta = new Carta(8,"Corazones"),carta = new Carta(9,"Corazones")
                               ,carta = new Carta(10,"Corazones"),carta = new Carta(11,"Corazones"),carta = new Carta(12,"Corazones"),carta = new Carta(13,"Corazones")
                               ,carta = new Carta(1,"Picas"),carta = new Carta(2,"Picas"),carta = new Carta(3,"Picas"),carta = new Carta(4,"Picas")
                               ,carta = new Carta(5,"Picas"),carta = new Carta(6,"Picas"),carta = new Carta(7,"Picas"),carta = new Carta(8,"Picas"),carta = new Carta(9,"Picas")
                               ,carta = new Carta(10,"Picas"),carta = new Carta(11,"Picas"),carta = new Carta(12,"Picas"),carta = new Carta(13,"Picas")
                               ,carta = new Carta(1,"Diamantes"),carta = new Carta(2,"Diamantes"),carta = new Carta(3,"Diamantes"),carta = new Carta(4,"Diamantes")
                               ,carta = new Carta(5,"Diamantes"),carta = new Carta(6,"Diamantes"),carta = new Carta(7,"Diamantes"),carta = new Carta(8,"Diamantes"),carta = new Carta(9,"Diamantes")
                               ,carta = new Carta(10,"Diamantes"),carta = new Carta(11,"Diamantes"),carta = new Carta(12,"Diamantes"),carta = new Carta(13,"Diamantes")
                               ,carta = new Carta(1,"Tréboles"),carta = new Carta(2,"Tréboles"),carta = new Carta(3,"Tréboles"),carta = new Carta(4,"Tréboles")
                               ,carta = new Carta(5,"Tréboles"),carta = new Carta(6,"Tréboles"),carta = new Carta(7,"Tréboles"),carta = new Carta(8,"Tréboles"),carta = new Carta(9,"Tréboles")
                               ,carta = new Carta(10,"Tréboles"),carta = new Carta(11,"Tréboles"),carta = new Carta(12,"Tréboles"),carta = new Carta(13,"Tréboles")));
    }
    /**
     * Metodo que barajalas cartas
     */
    public void barajar()
    {
        Collections.shuffle(mazo);
    }
    /**
     * Metodo que devuelve la primera carta y la elimina de la baraja
     */
    public String tomarPrimera()
    {
        if (mazo.isEmpty())
        {
            return null;
        }
        return mazo.remove(0).getNombre();
    }
    /**
     * Metodo que devuelve el numero de cartas que quedan en la baraja
     */
    public int  quedan()
    {
        return mazo.size();
        
    }
    
}
