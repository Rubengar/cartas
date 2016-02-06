import java.util.ArrayList;
/**
 * Write a description of class Juego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Juego
{
    // jugadores que juegan
    private int numeroJugadores;
    //arraylist de los jugadores en el juego
    private ArrayList<Jugador> jugadoresMesa;

    /**
     * Constructor for objects of class Juego
     */
    public Juego(int numeroJugadores)
    {
        jugadoresMesa = new Arraylist<Jugador>();
        mazo = new Mazo();
        mazo.barajar();
        int cont = 1;
        if (numeroJugadores<=1){
            while(contador<=4){
                Jugador incluirJugador = new Jugador(cont);
                jugadoresMesa.add(incluirJugador);
                cont++;
            }
        }
        else{

            while(contador<=numeroJugadores){
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
