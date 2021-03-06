import java.util.ArrayList;
/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador
{
    // nombre de la persona
    private int id;
    //lista de cartas
    private ArrayList<Carta> cartasDeJugador;

    /**
     * Constructor de la clase Jugador 
     */
    public Jugador(int id)
    {
        this.id = id;
        cartasDeJugador = new ArrayList<Carta>();
    }

    /**
     * devuelve el id del jugador
     */
    public  int getId()
    {
        return id;
    }

    /**
     * agregar una carta a las que posee el jugador 
     */
    public void recibirCarta(Carta unaCarta)
    {
        cartasDeJugador.add(unaCarta);

    }

    /**
     * devuelve una coleccion de cadenas con los nombres de las cartas.
     */
    public ArrayList<String> cartasQueTieneEnLaMano()
    {
        {
            ArrayList<String> coleccionString = new ArrayList<String>();
            for (Carta objetoCarta : cartasDeJugador) {
                coleccionString.add(objetoCarta.getNombre());
            }
            return coleccionString;
        }
    }
}
