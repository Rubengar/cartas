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
    private String id;
    //lista de cartas
    private ArrayList<Carta> cartas;

    /**
     * Constructor de la clase Jugador 
     */
    public Jugador(String id)
    {
        this.id = id;
    }

    /**
     * devuelve el id del jugador
     */
    public String getId()
    {
        return id;
    }

    /**
     * agregar una carta a las que posee el jugador 
     */
    public void recibirCarta(Carta unaCarta)
    {
        cartas.add(unaCarta);

    }
    
    /**
     * devuelve una colección de cadenas con los nombres de las cartas.
     */
    public void cartasQueTieneEnLaMano()
    {
        for(Carta baraja : cartas) {
            System.out.println(baraja.getNombre());
        }
    }
}
