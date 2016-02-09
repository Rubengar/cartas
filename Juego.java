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
    //
    private int numeroJugadores ;

    /**
     * Constructor for objects of class Juego
     */
    public Juego(int numeroJugadores)
    {
        this.numeroJugadores = numeroJugadores;
        jugadoresMesa = new ArrayList<Jugador>();
        mazo = new Mazo();
        mazo.barajar();
        int cont = 1;
        //si el numero de jugadores es menosr de dos o mayor de 8 como en las reglas del poker 
        //añade automaticamente 4 jugadores para jugar la partida 
        if (numeroJugadores < 2 || numeroJugadores > 8){
            numeroJugadores = 4;
            while(cont <= numeroJugadores){
                Jugador incluirJugador = new Jugador(cont);
                jugadoresMesa.add(incluirJugador);
                cont++;
            }
        }
        else{
            //si el numero de jugadores es 2 o mayor sin pasarse de 8 
            //añade el numero de jugadores hasta que sea el indicado entre diclos numeros 
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
        int numeroDeCartas = 52;
        int cartasRepartir;
        cartasRepartir = (numeroDeCartas/numeroJugadores);
        int posicionJugador = 0;
        int contador = 1;
        mazo.barajar();
        while (contador<cartasRepartir){
            jugadoresMesa.get(posicionJugador).recibirCarta(mazo.tomarPrimera());
            posicionJugador++;
            if (posicionJugador == numeroJugadores){
                posicionJugador = 0;
            }
            contador++;

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
