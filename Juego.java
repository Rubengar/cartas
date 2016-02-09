import java.util.ArrayList;
/**
 * Write a description of class Juego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Juego
{
   //arraylist de los jugadores en el juego
    private ArrayList<Jugador> jugadoresMesa;
   //objeto tipo mazo para poder acceder a los datos de este y sus metodos
   private Mazo mazo;

    /**
     * Constructor for objects of class Juego
     */
    public Juego(int numeroJugadores)
    {
        jugadoresMesa = new ArrayList<Jugador>();
        mazo = new Mazo();
        mazo.barajar();
        int cont = 1;
        if (numeroJugadores<=1){
            while(cont<=4){
                Jugador incluirJugador = new Jugador(cont);
                jugadoresMesa.add(incluirJugador);
                cont++;
            }
        }
        else{

            while(cont<=numeroJugadores){
                Jugador incluirJugador = new Jugador(cont);
                jugadoresMesa.add(incluirJugador);
                cont++;
            }

        }

    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void repartir()
    {

    }
}
