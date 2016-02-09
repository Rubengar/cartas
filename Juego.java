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
    //guarda el numero de jugadores 
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
        //si el numero de jugadores de pasa de los de mesa sale error
        if (numeroJugadores > 8 ){
            System.out.println("exceso de jugadores maximo 8 jugadores por mesa ");
        }
        //si el numero de jugadores es menosr de dos o mayor de 8 como en las reglas del poker 
        //a�ade automaticamente 4 jugadores para jugar la partida
        if (numeroJugadores < 2 ){
            numeroJugadores = 4;
            while(cont <= numeroJugadores){
                Jugador incluirJugador = new Jugador(cont);
                jugadoresMesa.add(incluirJugador);
                cont++;
            }
        }

        else{
            //si el numero de jugadores es 2 o mayor sin pasarse de 8 
            //a�ade el numero de jugadores hasta que sea el indicado entre diclos numeros 
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
        //lo utilizamos para cambiar la variable de el numero de jugadores si este es menos de 2 como ya k sino no repartiria a laas 4 jugadores como es devido 
        if (numeroJugadores < 2 ){
            numeroJugadores = 4;
        }
        //numero de cartas totales 
        int numeroDeCartas = 52;
        //numero de veces que tiene que hacer el bucle while para repartir las cartas a los jugadores 
        int cartasRepartir;
        cartasRepartir = (numeroDeCartas/numeroJugadores)*numeroJugadores;
        //las posicones que ocupan los jugadores en el arraylist 
        int posicionJugador = 0;
        //contador para saber las veces que a echo el bucle while 
        int contador = 0;
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
