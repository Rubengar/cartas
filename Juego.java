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
        if (numeroJugadores < 1 || numeroJugadores > 8){
            numeroJugadores = 4;
            while(cont <= numeroJugadores){
                Jugador incluirJugador = new Jugador(cont);
                jugadoresMesa.add(incluirJugador);
                cont++;
            }
        }
        else{
            
            while(cont <= numeroJugadores){
                Jugador incluirJugador = new Jugador(cont);
                jugadoresMesa.add(incluirJugador);
                cont++;
            }
        
        
        }
        
    }
    /**
     * metodo para repartir todas las cartas 
     */
    public void repartir()
    {
        mazo.barajar();
        int size = 1;
        while(mazo.quedan() >= jugadoresMesa.size()){
            jugadoresMesa.get(size).recibirCarta(mazo.tomarPrimera());
            size++;

        }
    }

    /**
     * metodo que muestra el jugador y su respectiva mano 
     */
    public void mostrarCartasJugadores()
    {
        for(Jugador jugadorCartas : jugadoresMesa){
            System.out.println("El jugador " + jugadorCartas.getId());
            System.out.println("Tiene esta mano"  + jugadorCartas.cartasQueTieneEnLaMano());

        }

    }
}
